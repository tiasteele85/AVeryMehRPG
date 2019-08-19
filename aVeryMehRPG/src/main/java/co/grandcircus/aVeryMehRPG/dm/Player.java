package co.grandcircus.aVeryMehRPG.dm;

import co.grandcircus.aVeryMehRPG.model.Weapon;

public class Player {
	private Health health;
	private String name;
	private int hit_die;	
	private Weapon weapon;
	
	
	public Player() {
		health = new Health();
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



	public Health getHealth() {
		return health;
	}

	public void setHealth(Health health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Player [health=" + health + "]";
	}
	
	
	
}
