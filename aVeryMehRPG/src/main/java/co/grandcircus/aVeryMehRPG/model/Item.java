package co.grandcircus.aVeryMehRPG.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item {
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("url")
	private String itemUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return itemUrl;
	}

	public void setUrl(String url) {
		this.itemUrl = url;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", url=" + itemUrl + "]";
	}


	

}
