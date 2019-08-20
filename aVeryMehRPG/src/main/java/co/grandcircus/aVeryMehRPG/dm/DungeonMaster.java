package co.grandcircus.aVeryMehRPG.dm;

import java.util.Scanner;

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
	
	public String giveAPunch() {
		int damage = dice.basicDamage(player.getHit_die() + 1);
		
		if(isAlive(enemy.getHealth().getHealth())) {
			enemy.getHealth().setHealth(damage);
			return enemy.getHealth().toString();
		} else {
			return "They're Dead";
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

	public void story() {
		Scanner scnr = new Scanner(System.in);
		String drink = null,decline= null,fight=null,yell=null,craft=null,deeper=null,snarky=null,sock=null,refuse=null,insist=null,love = null;
		System.out.println("We start off in dark and gloomy bar in the heart of Technologica Woods . "
				+ "\nOur hero sits at the bar after another victorious mission. \nThen out of nowhere the bartender David the master of all Java comes over and places a drink in-front of you and exclaims “Hero! This drink was bought for you by that mysterious man over there!” ");
		System.out.println("************************************************************************");
		System.out.println("What do you do? \n 1.Drink the beverage \n 2.Decline the drink and leave the bar");
		scnr.next();
		
		if(drink.equalsIgnoreCase("drink")) {
			System.out.println("You drink the mysterious beverage and immediately feel ill, you vision becomes blurry and you fall to the ground.");
			System.out.println("You wake up several hours in the middle of the woods and realize that your brand-new collectable Batman shoes have been taken" + 
					"\nand you’ve lost 5 points of health.");
			System.out.println("*******************************************************");
			System.out.println("Do you: 1. Craft makeshift pair of shoes out of leaves and walk back towards civilizations"
			+ "\n 2.  Go deeper into the woods and just accept the fact that no one will believe you that a stranger took your shoes so that this is now your home.");
			if(craft.equalsIgnoreCase("craft")) {
				System.out.println("Do you: 1. Craft makeshift pair of shoes out of leaves and walk back towards civilizations"
						+ "\n 2.  Go deeper into the woods and just accept the fact that no one will believe you that a stranger took your shoes so that this is now your home.");
			}
		
		
		}
	
		
		
		
		
		
		
	}













}
