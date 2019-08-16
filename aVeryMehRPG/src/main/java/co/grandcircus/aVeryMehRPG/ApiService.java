package co.grandcircus.aVeryMehRPG;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.aVeryMehRPG.model.Character;
import co.grandcircus.aVeryMehRPG.model.ClassTypes;
import co.grandcircus.aVeryMehRPG.model.Classes;
import co.grandcircus.aVeryMehRPG.model.Equipment;
import co.grandcircus.aVeryMehRPG.model.EquipmentResponse;
import co.grandcircus.aVeryMehRPG.model.StartingEquipmentResponse;
import co.grandcircus.aVeryMehRPG.model.StartingEquipment;

@Component
public class ApiService {

	RestTemplate restTemplate = new RestTemplate();
	
	public List<ClassTypes> showAll(){
		
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
//		//url to populate starting equipment because it's a different end point
//		String url2 = "http://www.dnd5eapi.co/api/startingequipment/";
//		StartingEquipmentResponse details = restTemplate.getForObject(url2, StartingEquipmentResponse.class);
//		StartingEquipment weapon = details.getDetails().get(index);
//		return weapon;
//		
//	}
	
	public List<Equipment> showAllWeapons(){
		
		String url = "http://www.dnd5eapi.co/api/equipment/";
		EquipmentResponse response = restTemplate.getForObject(url, EquipmentResponse.class);
		List<Equipment> equipments = response.getAllEquipment();
		return equipments;
	}
	
	
	
}
