package co.grandcircus.aVeryMehRPG.dm;

import java.util.Random;

/*
 * SHOULD CONTAIN JUST THE VERBAGE FOR FIGHT TEXT 
 * lIKE STORY OF THE FIGHT NOT THE DAMAGE OR PLAYER OR ....
 * 
 * 
 */
public class Fight {

	public Fight() {

	}

	public String punchie() {
		Random rand = new Random();
		int num = rand.nextInt(5) + 1;
		String word = "";

		switch (num) {
		case 1:
			word = "A swift fist to the face";
			break;
		case 2:
			word = "A whipped whooper to the abdomen";
			break;
		case 3:
			word = "Take 3 knuckles and a finger to the eye";
			break;
		case 4:
			word = "Whoop Whoop Whoop Whoop, punch";
			break;
		case 5:
			word = "Ninja fist so fast you don't know where it landed";
			break;
		default:
			word = "Just a simple punch";
			break;
		}
		
		return word;
	}
	
	public String kickie() {
		Random rand = new Random();
		int num = rand.nextInt(5) + 1;
		String word = "";

		switch (num) {
		case 1:
			word = "A major drop kick";
			break;
		case 2:
			word = "A whipped whooper to the abdomen";
			break;
		case 3:
			word = "Take 3 knuckles and a finger to the eye";
			break;
		case 4:
			word = "Whoop Whoop Whoop Whoop, punch";
			break;
		case 5:
			word = "Ninja fist so fast you don't know where it landed";
			break;
		default:
			word = "Just a simple punch";
			break;
		}
		
		return word;
	}

}
