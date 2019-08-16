package co.grandcircus.aVeryMehRPG.model;



import com.fasterxml.jackson.annotation.JsonProperty;

public class StartingEquipment {

	private int quantity;
	@JsonProperty("item")
	private Item item;
	private int index;
	private String url;
	
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "StartingEquipment [quantity=" + quantity + ", item=" + item + ", index=" + index + ", url=" + url + "]";
	}

	

	
	
	
	
}
