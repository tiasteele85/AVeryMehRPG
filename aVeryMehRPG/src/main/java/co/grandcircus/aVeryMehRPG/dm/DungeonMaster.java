package co.grandcircus.aVeryMehRPG.dm;

import co.grandcircus.aVeryMehRPG.model.Character;
import co.grandcircus.aVeryMehRPG.model.Weapon;
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
	Dice dice = new Dice();
	/*
	 * Collect data from API to create an enemy in the game
	 * 
	 */
	public void setEnemy(Character character, Weapon weapon) {
		enemy.setName(character.getName());
		enemy.setHit_die(character.getHit_die());
		enemy.setWeapon(weapon);
		
		//TESTING
		System.out.println("Hello:" + enemy);
		System.out.println("Name: " + enemy.getName() );
		System.out.println("Hit Die: " + enemy.getHit_die() );	
		System.out.println("Weapons: " + enemy.getWeapon());
		System.out.println("E W:" + enemy.getWeapon().getName());
		System.out.println("E W:" + enemy.getWeapon().getDamage());
		
		System.out.println("W:" + weapon.getName());
		System.out.println("D:" + weapon.getDamage());
		//TESTING
	}
	
	public void setPlayer(Character character, Weapon weapon) {
		player.setName(character.getName());
		player.setHit_die(character.getHit_die());
		player.setWeapon(weapon);
		
		//TESTING
		System.out.println("Hello:" + player);
		System.out.println("Name: " + player.getName() );
		System.out.println("Hit Die: " + player.getHit_die() );	
		System.out.println("Weapons: " + player.getWeapon());
		System.out.println("P W:" + player.getWeapon().getName());
		System.out.println("P W:" + player.getWeapon().getDamage());
		
		System.out.println("W:" + weapon.getName());
		System.out.println("D:" + weapon.getDamage());
		//TESTING
	}
	
	
	public String getPlayer() {
		return player.toString();
	}
	
	public String getEnemy() {
		return enemy.toString();
	}
	
	public void BaseFight() {
		
	}

	public String takeAPunch() {

		System.out.println("Woodblock");
		
		int damage = dice.basicDamage(enemy.getHit_die() + 1);
		
		if(isAlive(player.getHealth().getHealth())) {
			player.getHealth().setHealth(damage);
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
