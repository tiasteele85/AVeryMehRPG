package co.grandcircus.aVeryMehRPG.dm;

import java.util.Random;

import co.grandcircus.aVeryMehRPG.model.Bar;
import co.grandcircus.aVeryMehRPG.model.Character;
import co.grandcircus.aVeryMehRPG.model.SideOfRoad;
import co.grandcircus.aVeryMehRPG.model.Weapon;
import co.grandcircus.aVeryMehRPG.model.Woods;

/*
 * This guy handles all the stuffs
 * Fight
 * Players
 * Enemies
 * 
 * 
 */
public class DungeonMaster {

	public Player player = new Player();
	public Enemy enemy = new Enemy();
	Dice dice = new Dice();
	public Bar bar;
	public Woods woods;
	public SideOfRoad sideofroad;
	

	/*
	 * Collect data from API to create an enemy in the game
	 * 
	 */
	public void setEnemy(Character character, Weapon weapon) {
		enemy.setName(character.getName());
		enemy.setHit_die(character.getHit_die());
		enemy.setWeapon(weapon);

		// TESTING
		System.out.println("Hello:" + enemy);
		System.out.println("Name: " + enemy.getName());
		System.out.println("Hit Die: " + enemy.getHit_die());
		System.out.println("Weapons: " + enemy.getWeapon());
		System.out.println("E W:" + enemy.getWeapon().getName());
		System.out.println("E W:" + enemy.getWeapon().getDamage());

		System.out.println("W:" + weapon.getName());
		System.out.println("D:" + weapon.getDamage());
		// TESTING
	}

	public void setPlayer(Character character, Weapon weapon) {
		player.setName(character.getName());
		player.setHit_die(character.getHit_die());
		player.setWeapon(weapon);

		// TESTING
		System.out.println("Hello:" + player);
		System.out.println("Name: " + player.getName());
		System.out.println("Hit Die: " + player.getHit_die());
		System.out.println("Weapons: " + player.getWeapon());
		System.out.println("P W:" + player.getWeapon().getName());
		System.out.println("P W:" + player.getWeapon().getDamage());

		System.out.println("W:" + weapon.getName());
		System.out.println("D:" + weapon.getDamage());
		// TESTING
	}

	public String getPlayer() {
		return player.toString();
	}

	public String getEnemy() {
		return enemy.toString();
	}

	public String BaseFight() {
		Random rand = new Random();
		int toggle = rand.nextInt(2)+1;
		
		int eDamage = dice.basicDamage(enemy.getHit_die() + 1);
		System.out.println("Random Fun: "+toggle);
		if(toggle == 1)
		{
			
			if (isAlive(player.getHealth().getHealth())) {
				player.getHealth().setHealth(eDamage);
				return player.getHealth().toString();
			} else {
				return "You're Dead";
			}
		}else {
			int kickMultiplier = (int)(.15 * eDamage);
			if (isAlive(player.getHealth().getHealth())) {
				player.getHealth().setHealth(eDamage + kickMultiplier);
				return player.getHealth().toString();
			} else {
				return "You're Dead";
			}
		}
	}

	public String takeAPunch() {

		System.out.println("Woodblocker");

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
	
	public String takeAKick() {

		System.out.println("KickPluck");

		int pDamage = dice.basicDamage(player.getHit_die() + 1);
		int kickMultiplier = (int)(.15 * pDamage);
		
		if (isAlive(enemy.getHealth().getHealth())) {
			enemy.getHealth().setHealth(pDamage + kickMultiplier);
			return enemy.getHealth().toString();
		} else {
			return "They're Dead";
		}
	}

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

	public void resetHealth() {
		player.getHealth().resetHealth();
	}

	public boolean isAlive(int health) {

		if (health < 1) {
			return false;
		} else {
			return true;
		}
	}
	
	
	

	public void story() {
		bar.BeginningStory();
		
		}
		
		
		
	}
	



//		Scanner scnr = new Scanner(System.in);
//		String drink = "", decline = "", fight = "", yell = "", craft = "", deeper = "", snarky = "", sock = "",
//				refuse = "", insist = "", love = "";
//		System.out.println("We start off in dark and gloomy bar in the heart of Technologica Woods. "
//				+ "\nOur hero sits at the bar after another victorious mission. \nThen out of nowhere the bartender David the master of all Java comes over and places a drink in-front of you and exclaims “Hero! This drink was bought for you by that mysterious man over there!” ");
//		System.out.println("************************************************************************");
//		System.out.println("What do you do? \n 1.DRINK the beverage \n 2.DECLINE the drink and leave the bar");
//		scnr.next();
//
//		if (drink.equalsIgnoreCase("drink")) {
//			System.out.println(
//					"You drink the mysterious beverage and immediately feel ill, you vision becomes blurry and you fall to the ground.");
//			System.out.println(
//					"You wake up several hours in the middle of the woods and realize that your brand-new collectable Batman shoes have been taken"
//							+ "\nand you’ve lost 5 points of health.");
//			player.getHealth().setHealth(5);
//			System.out.println("*******************************************************");
//			scnr.next();
//			System.out.println(
//					"Do you: 1. CRAFT makeshift pair of shoes out of leaves and walk back towards civilizations"
//							+ "\n 2.  Go DEEPER into the woods and just accept the fact that no one will believe you that a stranger took your shoes so that this is now your home.");
//			if (craft.equalsIgnoreCase("craft")) {
//				System.out.println(
//						"You try to create a make-shift pair of shoes but fail and feel your father looking down on you disappointed because he was a cobbler and tried to teach you several times. \"\r\n"
//								+ "\nSo you decide to head back towards the bar to see if you can find the mysterious man");
//				System.out.println(
//						" You walk all the way back to the city and eventually make it to the bar as passing by the entrance you ignore the “shoes are required to enter” sign and push your way into the bar. "
//								+ "\nUpon entering you see the mysterious man still sitting at the bar wearing your shoes and buying rounds of drinks for everyone around him with your rubies.");
//				System.out.println(
//						"*********************************************************************************************************");
//				System.out.println("Do you: 1.Walk up to the stranger and try to FIGHT him without saying a word"
//						+ "\n2. YELL at him for being a big meanie");
//				scnr.next();
//				if (fight.equalsIgnoreCase("fight")) {
//					System.out.println(
//							"You walk up and try to fight the man, he lowers his hood to reveal himself as Kyle the TA."
//									+ "\nHe exclaims “I’m the greatest man alive and you will feel my wrath!”");
//				}
//
//				else if (yell.equalsIgnoreCase("yell")) {
//					System.out.println(
//							"You walk up to the stranger and exclaim “hey man you poisoned me and stole my shoes!! not cool broheim!” "
//									+ "\nThe stranger then revels himself as Kyle the TA and proceeds to respond with kindness in his voice “hey, I’m sorry I got carried away back there let me get you another drink. "
//									+ "\nPoison free this time I promise.” As you turn to head to the bar you feel a sharp pain in your side. "
//									+ "\nKyle has stabbed you and you lose 15 additional points of health. "
//									+ "\nAngry you begin to swing wildly at Kyle and the battle begins.");
//
//					player.getHealth().setHealth(15);
//				}
//
//			} else if (deeper.equalsIgnoreCase("deeper")) {
//				System.out.println(
//						"As you head further into the woods you are confronted by a giant spider and realize that peace may not be in his nature."
//								+ "\nThe spider looks at you and exclaims “hey bro, quick question… where are your shoes?”");
//				System.out.println("*******************************************************");
//				System.out.println("Do you: 1.Respond with a SNARKY comment “wouldn’t you like to know Spider-boy”"
//						+ "Take off your SOCK and chuck it at the Spider to try and scare if off");
//				scnr.next();
//			}
//			if (snarky.equalsIgnoreCase("snarky") || sock.equalsIgnoreCase("sock")) {
//				System.out.println(
//						"The spider sick of everyone always treating him with hostility lunges at you screaming “I’m sick of it lets fight!");
//
//			}
//		} else if (decline.equalsIgnoreCase("decline")) {
//			System.out.println(
//					"You politely decline the mysterious man’s offer for the drink and head out to find your next journey ");
//			System.out.println(
//					"You walk outside and head down the path as you’re walking a bird flying overhead drops a rock on your head and you lose 3 health.\r\n"
//							+ "Woozy and tired you sit down to regain your stability. "
//							+ "\nAs you do a knight comes up to you and requests to search your person as there has been a recent robbery in the area and someone has stolen the queens diamond dragon trophy.");
//			player.getHealth().setHealth(3);
//
//			System.out.println("*********************************************************************************");
//			System.out.println("Do you: 1. Tell the knight that you REFUSE his search and suggest he go elsewhere"
//					+ "/n2. INSIST that you’re the hero of this story and there's no need (but aren’t we all the heroes of our own story?)\r\n"
//					+ "/n3. Tell the Knight you are a lover not a fighter");
//			scnr.next();
//
//			if (refuse.equalsIgnoreCase("refuse") || insist.equalsIgnoreCase("insist")) {
//				System.out.println(
//						"The night sick of your tone then draws his sword and declares “I will retrieve my trophy off your dead body! Scoundrel!”");
//
//			} else if (love.equalsIgnoreCase("love")) {
//				System.out.println(
//						"The Knight draws his sword and cuts you in half, you try to love him to death, but alas your heart is not as powerful as a steel sword.");
//			}
//			scnr.close();
//		}
//		System.out.println(Woods.class);
	
	

