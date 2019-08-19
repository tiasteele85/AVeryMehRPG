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
		 
		//System.out.println("Player takes a punch " + (player.getHealth().getHealth() - 5));
		//System.out.println("Enemy takes a punch " + (enemy.getHealth().getHealth() - 5));
		player.getHealth().setHealth(5);
		return  player.getHealth().toString();
	}
}
