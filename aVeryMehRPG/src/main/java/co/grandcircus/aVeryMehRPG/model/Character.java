package co.grandcircus.aVeryMehRPG.model;

import com.fasterxml.jackson.annotation.JsonProperty;


/*
 *  "index": 6,
 * "name": "Monk",
 *	"hit_die": 8,
 * "starting_equipment": {},
 * "url": "http://www.dnd5eapi.co/api/classes/9"
 */


public class Character {
	private int index;
	private String name;
	@JsonProperty("hit_die")
	private int hit_die;
	@JsonProperty("starting_equipment")
	private StartingEquipment starting_equipment;
	private String url;
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHit_die() {
		return hit_die;
	}
	public void setHit_die(int hit_die) {
		this.hit_die = hit_die;
	}
	
	public StartingEquipment getStarting_equipment() {
		return starting_equipment;
	}
	public void setStarting_equipment(StartingEquipment starting_equipment) {
		this.starting_equipment = starting_equipment;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Character [index=" + index + ", name=" + name + ", hit_die=" + hit_die + ", starting_equipment="
				+ starting_equipment + ", url=" + url + "]";
	}
	
	
}
