package co.grandcircus.aVeryMehRPG.dm;

public class Enemy {
	private Health health;

	public Enemy() {
		health = new Health();
	}
	
	public Health getHealth() {
		return health;
	}

	public void setHealth(Health health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Enemy [health=" + health + "]";
	}
	
	
}
