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
	public String BaseFight(int toggle, int eDamage) {		

		if (toggle == 1) {

			if (isAlive(player.getHealth().getHealth())) {
				player.getHealth().setHealth(eDamage);
				return player.getHealth().toString();
			} else {
				return "You're Dead";
			}
		} else if (toggle == 2) {			
			if (isAlive(player.getHealth().getHealth())) {
				player.getHealth().setHealth(eDamage);
				return player.getHealth().toString();
			} else {
				return "You're Dead";
			}
		} else {			
			if (isAlive(player.getHealth().getHealth())) {
				player.getHealth().setHealth(eDamage);
				return player.getHealth().toString();
			} else {
				return "You're Dead";
			}
		}
	}

	// Method to create a random damage amount to apply to the enemy character
	// Then returns the health of that character
	public String takeAPunch(int pDamage) {
		
		if (isAlive(enemy.getHealth().getHealth())) {
			enemy.getHealth().setHealth(pDamage);
			return enemy.getHealth().toString();
		} else {
			return "They're Dead";
		}
	}

	// Method to create a random damage amount from the hitdie of the player to the
	// enemy
	// Then returns the enemy's health

	public String takeAKick(int pDamage) {
		Random rand = new Random();
		int success = rand.nextInt(10);
		
		//int pDamage = dice.basicDamage(player.getHit_die() + 1);
		//int kickMultiplier = (int) (.15 * pDamage);

		if (success <= 4) {
			if (isAlive(enemy.getHealth().getHealth())) {
				enemy.getHealth().setHealth(pDamage);
				return enemy.getHealth().toString();
			} else {
				return "They're Dead";
			}
		} else if (success <= 5) {
			if (isAlive(enemy.getHealth().getHealth())) {
				enemy.getHealth().setHealth((pDamage) / 2);
				return enemy.getHealth().toString();
			} else {
				return "They're Dead";
			}
		} else {
			if (isAlive(enemy.getHealth().getHealth())) {
				return enemy.getHealth().toString();
			} else {
				return "They're Dead";
			}

		}

	}

	public String takeAWeaponDamage(int pWDamage) {
		//int pWDamage = dice.getDamage(player.getWeapon().getDamage(), player.getHit_die());

		if (isAlive(enemy.getHealth().getHealth())) {
			enemy.getHealth().setHealth(pWDamage);
			return enemy.getHealth().toString();
		} else {
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

	
	//Returns the random dice values for punch, kick, and weapon damage
	public int diceRolls(String who, String type, boolean multiplier) {
		if (type.equals("basicDamage")) {
			if (who.equals("player")) {
				int damage = dice.basicDamage(player.getHit_die());
				int bonus = (int) (.15 * dice.basicDamage(player.getHit_die()));
				if (multiplier) {

					return (damage + bonus);
				} else {
					return damage;
				}
			} else {
				int damage = dice.basicDamage(enemy.getHit_die());
				int bonus = (int) (.15 * dice.basicDamage(enemy.getHit_die()));
				if (multiplier) {
					return (damage + bonus);
				} else {
					return damage;
				}				
			}
		} else {
			if (who.equals("player")) {
				int bonus = (int)(1.25 * dice.getDamage(player.getWeapon().getDamage(), player.getHit_die()));
				return bonus;
			} else {
				return dice.getDamage(enemy.getWeapon().getDamage(), enemy.getHit_die() + 1);
			}
		}
	}

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
