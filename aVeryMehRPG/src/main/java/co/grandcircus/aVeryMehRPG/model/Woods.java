package co.grandcircus.aVeryMehRPG.model;

public class Woods {

	public void WoodsIntro() {
		System.out.println("You wake up several hours in the middle of the woods and realize that your brand-new collectable Batman shoes have been taken \"\r\n" + 
				"				+ \nand you’ve lost 5 points of health.");
		
		System.out.println("*******************************************************");
		System.out.println("Do you: 1. Craft makeshift pair of shoes out of leaves and walk back towards civilizations"
				+ "\n 2.  Go deeper into the woods and just accept the fact that no one will believe you that a stranger took your shoes so that this is now your home.");
	}
	
	public void CraftShoe() {
		System.out.println("You try to create a make-shift pair of shoes but fail and feel your father looking down on you disappointed because he was a cobbler and tried to teach you several times. "
				+ "\nSo you decide to head back towards the bar to see if you can find the mysterious man");
	// this will shift back to the bar
	
	}
	
	public void Deeper() {
		System.out.println("As you head further into the woods you are confronted by a giant spider and realize that peace may not be in his nature. "
			+ "\nThe spider looks at you and exclaims “hey bro, quick question… where are your shoes?”");
		System.out.println("******************************************************");
		System.out.println("Do you: 1.Respond with a snarky comment “wouldn’t you like to know Spider-boy”"
				+ "Take off your sock and chuck it at the Spider to try and scare if off");
	 
	// Choice 1 and 2 lead to the same fight so this maps to the .jsp fight 
	
	}
	
	
}
