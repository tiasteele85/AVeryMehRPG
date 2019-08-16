package co.grandcircus.aVeryMehRPG.model;

import com.fasterxml.jackson.annotation.JsonProperty;
/*
 * "name": "Javelin",
 */
public class Weapon {
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("damage")
	private Damage damage;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Damage getDamage() {
		return damage;
	}
	
	public void setDamage(Damage damage) {
		this.damage = damage;
	}
	@Override
	public String toString() {
		return "Weapon [name=" + name + ", damage=" + damage + "]";
	}

	
	
	

}
