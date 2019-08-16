package co.grandcircus.aVeryMehRPG.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * "results": [
	{
		"name": "Barbarian",
		"url": "http://www.dnd5eapi.co/api/classes/1"
	},
 * 
 */


/*
 * RESPONSE CLASS
 */


public class Classes {
	
	@JsonProperty("results")
	private List<ClassTypes> classes;
	private List<ClassTypes> availCharacterTypes;
	public List<ClassTypes> getClasses() {
		return classes;
	}
	public void setClasses(List<ClassTypes> classes) {
		this.classes = classes;
	}
	
	public void setAvailCharacterTypes() {
		availCharacterTypes.add(classes.get(2));
		availCharacterTypes.add(classes.get(4));
		availCharacterTypes.add(classes.get(6));
		availCharacterTypes.add(classes.get(9));
	}
	
	public List<ClassTypes> getAvailCharacters(){
		return availCharacterTypes;
	}
	
	
}
