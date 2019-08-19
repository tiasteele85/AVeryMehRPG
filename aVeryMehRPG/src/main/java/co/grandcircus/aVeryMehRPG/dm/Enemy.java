package co.grandcircus.aVeryMehRPG.dm;

import co.grandcircus.aVeryMehRPG.model.StartingEquipmentURL;
import co.grandcircus.aVeryMehRPG.model.Weapon;

public class Enemy {
	private Health health;
	private String name;
	private int hit_die;
	
	private Weapon weapon;

	public Health getHealth() {
		return health;
	}

	public void setHealth(Health health) {
		this.health = health;
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

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	
	

	@Override
	public String toString() {
		return "Enemy [health=" + health + ", name=" + name + ", hit_die=" + hit_die + " ,weapon=" + weapon + "]";
	}

}
