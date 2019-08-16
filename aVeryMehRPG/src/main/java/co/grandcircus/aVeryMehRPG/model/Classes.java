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
	
	
	@Override
	public String toString() {
		return "Classes [classes=" + classes + "]";
	}
	public List<ClassTypes> getClasses() {
		return classes;
	}
	public void setClasses(List<ClassTypes> classes) {
		this.classes = classes;
	}
	

	
	
}
