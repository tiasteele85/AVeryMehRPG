package co.grandcircus.aVeryMehRPG.model;
/*
 * "name": "Monk",
 *	"hit_die": 8,
 * "starting_equipment": {},
 */

public class Character {
	private String name;
	private int hit_die;
	private String starting_equipment;
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
	public String getStarting_equipment() {
		return starting_equipment;
	}
	public void setStarting_equipment(String starting_equipment) {
		this.starting_equipment = starting_equipment;
	}
	
	
}
