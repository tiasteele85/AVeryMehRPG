package co.grandcircus.aVeryMehRPG.model;

public class Equipment {
	
	private String name;
	private String url;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Equipment [name=" + name + ", url=" + url + "]";
	}

	
	
	

}
