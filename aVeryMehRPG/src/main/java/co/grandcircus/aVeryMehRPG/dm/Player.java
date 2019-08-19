package co.grandcircus.aVeryMehRPG.dm;

public class Player {
	private Health health;
	
	
	public Player() {
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
		return "Player [health=" + health + "]";
	}
	
	
	
}
