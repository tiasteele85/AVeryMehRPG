package co.grandcircus.aVeryMehRPG.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
/*
 * "item": {
 */
public class StartingEquipmentResponse {
	//@JsonProperty("starting_equipment")
	private List<StartingEquipment> details;

	public List<StartingEquipment> getDetails() {
		return details;
	}

	public void setDetails(List<StartingEquipment> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "StartingEquipment [details=" + details + "]";
	}
	
	
	

}
