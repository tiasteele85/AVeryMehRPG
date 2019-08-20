package co.grandcircus.aVeryMehRPG.model;

import co.grandcircus.aVeryMehRPG.dm.Player;

public class SideOfRoad {

	public String SideStory(Player playie) {
		String sideStory =
				"You walk outside and head down the path as you’re walking a bird flying overhead drops a rock on your head and you lose 3 health."
						+ "\nWoozy and tired you sit down to regain your stability. "
						+ "\nAs you do a knight comes up to you and requests to search your person as there has been a recent robbery in the area and someone has stolen the queens diamond dragon trophy"
						+ "\n*********************************************************************************"
						+"\nDo you: 1. Tell the knight that you refuse his search and suggest he go elsewhere"
						+ "\n2. Insist that you’re the hero of this story and there's no need (but aren’t we all the heroes of our own story?)\r\n"
						+ "\n3. Tell the Knight you are a lover not a fighter";
		playie.getHealth().setHealth(3);		
		return sideStory;

	}

	public String Refuse() {
		String refuse="The night sick of your tone then draws his sword and declares “I will retrieve my trophy off your dead body! Scoundrel!”";
		return refuse;
		
		// we then shift to the knight fight scene regardless of whether the user does 1
		// or 2

	}

	public String Lover() {
		String lover = "The Knight draws his sword and cuts you in half, you try to love him to death, but alas your heart is not as powerful as a steel sword.";
		// this goes to the only death screen that should occur by natural selection
		return lover;
	}

}
