package co.grandcircus.aVeryMehRPG.dm;

/*
 * This guy handles all the stuffs
 * Fight
 * Players
 * Enemies
 * 
 * 
 */
public class DungeonMaster {

	Player player = new Player();
	Enemy enemy = new Enemy();

	public String BaseFight() {

		// System.out.println("Player takes a punch " + (player.getHealth().getHealth()
		// - 5));
		// System.out.println("Enemy takes a punch " + (enemy.getHealth().getHealth() -
		// 5));

		return player.getHealth().toString();
	}

	public String takeAPunch() {

		if(isAlive(player.getHealth().getHealth())) {
			player.getHealth().setHealth(12);
			return player.getHealth().toString();
		} else {
			return "You're Dead";
		}
	}

	public void resetHealth() {
		player.getHealth().resetHealth();
	}

	public boolean isAlive(int health) {

		if (health == 0) {
			return false;
		} else {
			return true;
		}
	}
}
