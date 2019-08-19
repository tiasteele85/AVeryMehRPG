package co.grandcircus.aVeryMehRPG.dm;

public class Health {
	
	private int health;
	
	public Health() {
		health = 100;
	}

	public int getHealth() {
		return health;
	}

	@Override
	public String toString() {
		return "Health [health=" + health + "]";
	}

	public void setHealth(int damage) {
		health -= damage;
	}
	
	
}
