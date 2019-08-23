package co.grandcircus.aVeryMehRPG;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.aVeryMehRPG.model.Character;
import co.grandcircus.aVeryMehRPG.model.ClassTypes;
import co.grandcircus.aVeryMehRPG.model.Classes;
import co.grandcircus.aVeryMehRPG.model.Equipment;
import co.grandcircus.aVeryMehRPG.model.EquipmentResponse;
import co.grandcircus.aVeryMehRPG.model.StartingEquipmentResponse;
import co.grandcircus.aVeryMehRPG.model.Weapon;

@Component
public class ApiService {

	RestTemplate restTemplate = new RestTemplate();

	public List<ClassTypes> showAll() {

		String url = "http://www.dnd5eapi.co/api/classes/";
		Classes response = restTemplate.getForObject(url, Classes.class);
		List<ClassTypes> classes = response.getClasses();
		return classes;
	}

	public Character showCharacter(int index) {
		String url = "http://www.dnd5eapi.co/api/classes/" + index;

		Character response = restTemplate.getForObject(url, Character.class);
		return response;

	}

//	public StartingEquipment getEquipment(int index) {
//		
//		
//	}

	public List<Equipment> showAllWeapons() {

		String url = "http://www.dnd5eapi.co/api/equipment/";
		EquipmentResponse response = restTemplate.getForObject(url, EquipmentResponse.class);
		List<Equipment> equipments = response.getAllEquipment();
		return equipments;
	}
	// url  is being parsed twice
	// starting equipment is a seperate endpoint
	// we had to pass the se url to get the weapon url
	public Weapon chooseWeapon(Character character) {
		// url to populate starting equipment because it's a different end point

		StartingEquipmentResponse response = restTemplate.getForObject(character.getStarting_equipment().getUrl(),
				StartingEquipmentResponse.class);
		String weaponURL;
		if (character.getIndex() == 5) {
			Random rand = new Random();
			weaponURL = "http://www.dnd5eapi.co/api/equipment/" + rand.nextInt(12);
		} else {
			weaponURL = response.getStartingEquipment().get(0).getItem().getUrl();
		}
		Weapon weapon = restTemplate.getForObject(weaponURL, Weapon.class);

		return weapon;
	}
	
	public Weapon reWeapon(int place) {
		String url = "http://www.dnd5eapi.co/api/equipment/" + place;		
		Weapon weapon = restTemplate.getForObject(url, Weapon.class);
		return weapon;
	}

}
