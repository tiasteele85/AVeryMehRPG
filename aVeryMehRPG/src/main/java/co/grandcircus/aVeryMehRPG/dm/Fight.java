package co.grandcircus.aVeryMehRPG.dm;

public class Fight {
	
	private Player player;
	private Enemy enemy;
	
	public Fight() {
		
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

	@Override
	public String toString() {
		return "Fight [player=" + player + ", enemy=" + enemy + "]";
	}
	
	

}
