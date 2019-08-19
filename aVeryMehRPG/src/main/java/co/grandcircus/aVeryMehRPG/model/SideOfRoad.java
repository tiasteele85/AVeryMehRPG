package co.grandcircus.aVeryMehRPG.model;

public class SideOfRoad {

	public void SideStory() {
		System.out.println(
				"You walk outside and head down the path as you’re walking a bird flying overhead drops a rock on your head and you lose 3 health.\r\n"
						+ "\r\n" + "Woozy and tired you sit down to regain your stability. "
						+ "\nAs you do a knight comes up to you and requests to search your person as there has been a recent robbery in the area and someone has stolen the queens diamond dragon trophy.");
		System.out.println("*********************************************************************************");
		System.out.println("Do you: 1. Tell the knight that you refuse his search and suggest he go elsewhere\r\n"
				+ "2. Insist that you’re the hero of this story and there's no need (but aren’t we all the heroes of our own story?)\r\n"
				+ "3. Tell the Knight you are a lover not a fighter");

	}

	public void Refuse() {

		System.out.println("The night sick of your tone then draws his sword and declares “I will retrieve my trophy off your dead body! Scoundrel!”");
		// we then shift to the knight fight scene regardless of whether the user does 1
		// or 2

	}

	public void Lover() {
		System.out.println(
				"The Knight draws his sword and cuts you in half, you try to love him to death, but alas your heart is not as powerful as a steel sword.");

	}

}
