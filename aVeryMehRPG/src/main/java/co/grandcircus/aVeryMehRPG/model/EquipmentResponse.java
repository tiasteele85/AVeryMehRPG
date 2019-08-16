package co.grandcircus.aVeryMehRPG.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * "results": [
{
"name": "Club",
"url": "http://www.dnd5eapi.co/api/equipment/1"
},
 */
public class EquipmentResponse {
	@JsonProperty("results")
	private List<Equipment> allEquipment;
	private String url;
	public List<Equipment> getAllEquipment() {
		return allEquipment;
	}
	public void setAllEquipment(List<Equipment> allEquipment) {
		this.allEquipment = allEquipment;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "EquipmentResponse [allEquipment=" + allEquipment + ", url=" + url + "]";
	}
	
	
	
}
