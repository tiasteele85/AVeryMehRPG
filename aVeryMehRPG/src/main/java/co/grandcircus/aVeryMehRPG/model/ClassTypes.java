package co.grandcircus.aVeryMehRPG.model;



/*
 * "name": "Barbarian",
"url": "http://www.dnd5eapi.co/api/classes/1"
 * 
 */
public class ClassTypes {
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
	public int getIndex() {
		String test = "/";
		
		System.out.println("Captain Joe: " + url.substring(url.length()-2, url.length()-1).equals(test));
		System.out.println(url.charAt(url.length()-2));
		if(url.substring(url.length()-2, url.length()-1).equals(test))
		{
			return Integer.parseInt(url.substring(url.length()-1));
		}else {
			return Integer.parseInt(url.substring(url.length()-2));
		}
			
		
	}
	
	@Override
	public String toString() {
		return "ClassTypes [name=" + name + ", url=" + url + "]";
	}
	
	
}
