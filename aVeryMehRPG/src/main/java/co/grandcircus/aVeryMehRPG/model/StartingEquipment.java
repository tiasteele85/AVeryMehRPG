package co.grandcircus.aVeryMehRPG.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StartingEquipment {

	
	private List<ItemResponse> items;

	public List<ItemResponse> getItems() {
		return items;
	}

	public void setItems(List<ItemResponse> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "StartingEquipment [items=" + items + "]";
	}
	
	
	
	
}
