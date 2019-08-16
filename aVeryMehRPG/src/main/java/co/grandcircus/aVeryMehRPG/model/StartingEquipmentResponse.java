package co.grandcircus.aVeryMehRPG.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/*
 * "item": {
 */
public class StartingEquipmentResponse {
	@JsonProperty("starting_equipment")
	private List<StartingEquipment> startingEquipment;

	public List<StartingEquipment> getStartingEquipment() {
		return startingEquipment;
	}

	public void setStartingEquipment(List<StartingEquipment> startingEquipment) {
		this.startingEquipment = startingEquipment;
	}

	@Override
	public String toString() {
		return "StartingEquipmentResponse [startingEquipment=" + startingEquipment + "]";
	}

	
	
	

}
