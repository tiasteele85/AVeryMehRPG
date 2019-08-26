package co.grandcircus.aVeryMehRPG.dm;

import java.util.Random;

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

	// Give the Dungeon Master access to all the classes needed to run the game
	public Player player = new Player();
	public Enemy enemy = new Enemy();
	private Dice dice = new Dice();

	public Fight fight = new Fight();

	/*
	 * Collect data from API to create an enemy in the game
	 * 
	 */
	// Creates a Enemy object from the controller
	public void setEnemy(Character character, Weapon weapon) {
		enemy.setName(character.getName());
		enemy.setHit_die(character.getHit_die());
		enemy.setWeapon(weapon);

	}

	// Creates a Player object collected in the controller
	public void setPlayer(Character character, Weapon weapon) {
		player.setName(character.getName());
		player.setHit_die(character.getHit_die());
		player.setWeapon(weapon);

	}

	// Returns the player string
	public String getPlayer() {
		return player.toString();
	}

	// Returns the enemy string
	public String getEnemy() {
		return enemy.toString();
	}

	
	
	
	// Method is used to determine what kind of responsive hit the enemy does
	// Also assigns the damage amount based on the parameter passed from controller
	// checks to see if it killed the player
	public String BaseFight(int toggle) {

		int eDamage = dice.basicDamage(enemy.getHit_die() + 1);

		if (toggle == 1) {

			if (isAlive(player.getHealth().getHealth())) {
				player.getHealth().setHealth(eDamage);
				return player.getHealth().toString();
			} else {
				return "You're Dead";
			}
		} else if (toggle == 2) {
			int kickMultiplier = (int) (.15 * eDamage);
			if (isAlive(player.getHealth().getHealth())) {
				player.getHealth().setHealth(eDamage + kickMultiplier);
				return player.getHealth().toString();
			} else {
				return "You're Dead";
			}
		} else {
			int eWDamage = dice.getDamage(enemy.getWeapon().getDamage(), enemy.getHit_die());

			if (isAlive(player.getHealth().getHealth())) {
				player.getHealth().setHealth(eWDamage);
				return player.getHealth().toString();
			} else {
				return "You're Dead";
			}
		}
	}

	// Method to create a random damage amount to apply to the enemy character
	// Then returns the health of that character
	public String takeAPunch() {
		int pDamage = dice.basicDamage(player.getHit_die() + 1);

		if (isAlive(enemy.getHealth().getHealth())) {
			enemy.getHealth().setHealth(pDamage);
			return enemy.getHealth().toString();
		} else {
			return "They're Dead";
		}
	}

//	public String giveAPunch() {
//		int eDamage = dice.basicDamage(player.getHit_die() + 1);
//
//		if (isAlive(enemy.getHealth().getHealth())) {
//			enemy.getHealth().setHealth(eDamage);
//			return enemy.getHealth().toString();
//		} else {
//			return "They're Dead";
//		}
//	}

	// Method to create a random damage amount from the hitdie of the player to the
	// enemy
	// Then returns the enemy's health

	public String takeAKick() {
		Random rand = new Random();
		int success = rand.nextInt(10);
		int pDamage = dice.basicDamage(player.getHit_die() + 1);
		int kickMultiplier = (int) (.15 * pDamage);

		if (success <= 6) {
			if (isAlive(enemy.getHealth().getHealth())) {
				enemy.getHealth().setHealth(pDamage + kickMultiplier);
				return enemy.getHealth().toString();
			} else {
				return "They're Dead";
			}
		} else if (success <= 8) {
			enemy.getHealth().setHealth((pDamage + kickMultiplier) / 2);
			return enemy.getHealth().toString();
		} else {
			return enemy.getHealth().toString();
		}

	}
	
	public String takeAWeaponDamage() {
		 int pWDamage = dice.getDamage(player.getWeapon().getDamage(), player.getHit_die());
		 
		 if(isAlive(enemy.getHealth().getHealth())) {
			 enemy.getHealth().setHealth(pWDamage);
			 return enemy.getHealth().toString();
		 }else {
			 return "They're Dead";
		 }
		
	}

	/*
	 * public String takeAKick() {
	 * 
	 * int pDamage = dice.basicDamage(player.getHit_die() + 1); int kickMultiplier =
	 * * (int)(.15 * pDamage);
	 * 
	 * if (isAlive(enemy.getHealth().getHealth())) {
	 * enemy.getHealth().setHealth(pDamage + kickMultiplier); return
	 * enemy.getHealth().toString(); } else { return "They're Dead"; } }
	 */

//	public String giveAKick() {
//		int eDamage = dice.basicDamage(enemy.getHit_die() + 1);
//		int kickMultiplier = (int)(.25 * eDamage);
//		if (isAlive(enemy.getHealth().getHealth())) {
//			enemy.getHealth().setHealth(eDamage + kickMultiplier);
//			return enemy.getHealth().toString();
//		} else {
//			return "They're Dead";
//		}
//	}

	// Story text on the fight JSP to populate the fight text
	// for colorful wording of the type of punch
	public String punchText() {
		String test = fight.punchie();

		return test;
	}

	// Story text on the fight JSP to populate the fight text
	// for colorful wording of the type of kick
	public String kickText() {
		String test = fight.kickie();

		return test;
	}

	public void resetHealth() {
		player.getHealth().resetHealth();
	}

	// Tests to see if something died
	public boolean isAlive(int health) {

		if (health < 1) {
			return false;
		} else {
			return true;
		}
	}
}
