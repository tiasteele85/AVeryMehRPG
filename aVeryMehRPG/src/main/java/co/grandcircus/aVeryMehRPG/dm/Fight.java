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
		int num = rand.nextInt(11) + 1;
		String word = "";

		switch (num) {
		case 1:
			word = "A swift fist to the face";
			break;
		case 2:
			word = "A whipped whopper to the abdomen";
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
		case 6:
			word = "knick knack paddy whack you just got slapped";
			break;
		case 7 : 
			word = "nice punch bro, work out?";
			break;
		case 8 :
			word = "Fist so strong it don't need no man";
			break;
		case 9 :
			word = "puncheroni and cheese";
			break;
		case 10:
			word = "laying the smackdown";
			break;
		default:
			word = "Just a simple punch";
			break;
	
		}
		
		return word;
	}
	
	public String kickie() {
		Random rand = new Random();
		int num = rand.nextInt(11) + 1;
		String word = "";

		switch (num) {
		case 1:
			word = "A major drop kick";
			break;
		case 2:
			word = "A roundkick to the face";
			break;
		case 3:
			word = "That foot knocked spit out of your mouth";
			break;
		case 4:
			word = "That foot hit so hard, I think I tasted toes";
			break;
		case 5:
			word = "Whoooaaack, that kick jiggled the skin on your face";
			break;
		case 6:
			word = "Kick so strong it scared Chuck Norris";
			break;
		case 7 :
			word = "Your kick power proves you've never missed a leg day";
			break;
		case 8:
			word = "Kick heard around the world";
			break;
		case 9:
			word = "Can you kick it? Yeah you can";
			break;
		case 10:
			word = "Chipmunks kick harder than that";
			break;
		default:
			word = "Just a simple kick";
			break;
		
		}
		
		return word;
	}

}
