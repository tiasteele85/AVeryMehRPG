package co.grandcircus.aVeryMehRPG.model;

public class Weapon {
	
	private String name;
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
