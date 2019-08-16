package co.grandcircus.aVeryMehRPG.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/*
 * "item": {
 */
public class StartingEquipment {
	//@JsonProperty("starting_equipment")
	private List<StartingEquipmentDetails> details;

	public List<StartingEquipmentDetails> getDetails() {
		return details;
	}

	public void setDetails(List<StartingEquipmentDetails> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "StartingEquipment [details=" + details + "]";
	}
	
	
	

}
