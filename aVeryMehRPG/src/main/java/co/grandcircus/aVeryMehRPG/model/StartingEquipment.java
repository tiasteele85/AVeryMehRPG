package co.grandcircus.aVeryMehRPG.model;

import java.util.List;

public class StartingEquipment {
	
	private List<Item> items;

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "StartingEquipment [items=" + items + "]";
	}
	
	

}
