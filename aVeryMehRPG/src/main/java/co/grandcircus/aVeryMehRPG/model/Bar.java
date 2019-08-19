package co.grandcircus.aVeryMehRPG.model;

public class Bar {
	
	
	// initial story should only be called once per game
	public void BeginningStory() {
		
		System.out.println("We start off in dark and gloomy bar in the heart of Technologica Woods . "
				+ "\nOur hero sits at the bar after another victorious mission. \nThen out of nowhere the bartender David the master of all Java comes over and places a drink in-front of you and exclaims “Hero! This drink was bought for you by that mysterious man over there!” ");
		System.out.println("************************************************************************");
		System.out.println("What do you do? \n 1.Drink the beverage \n 2.Decline the drink and leave the bar");
	}
	
	
	public void Drink() {
		System.out.println("You drink the mysterious beverage and immediately feel ill, you vision becomes blurry and you fall to the ground.");
				
		
		//we need to set it up where this shifts to the woods
	}
	public void Leave() {
		System.out.println("You politely decline the mysterious man’s offer for the drink and head out to find your next journey ");
		// need to shift this to the side of the road class
	
	}
	
	// this class take place post woods
	public void Return() {
		System.out.println(" You walk all the way back to the city and eventually make it to the bar as passing by the entrance you ignore the “shoes are required to enter” sign and push your way into the bar. "
				+ "\nUpon entering you see the mysterious man still sitting at the bar wearing your shoes and buying rounds of drinks for everyone around him with your rubies.");
		System.out.println("*********************************************************************************************************");
		System.out.println("Do you: 1.Walk up to the stranger and try to fight him without saying a word "
				+ " 2. Yell at him for being a big meanie");
	}
	
	// goes to bar fight .jsp
	
	public void NoWords() {
		System.out.println("You walk up and try to fight the man, he lowers his hood to reveal himself as Kyle the TA."
				+ "\nHe exclaims “I’m the greatest man alive and you will feel my wrath!”");
		
	}
	
	// goes to bar fight .jsp
	
	public void Meanie() {
		System.out.println("You walk up to the stranger and exclaim “hey man you poisoned me and stole my shoes!! not cool broheim!” "
				+ "\nThe stranger then revels himself as Kyle the TA and proceeds to respond with kindness in his voice “hey, I’m sorry I got carried away back there let me get you another drink. "
				+ "\nPoison free this time I promise.” As you turn to head to the bar you feel a sharp pain in your side. "
				+ "\nKyle has stabbed you and you lose 15 additional points of health. "
				+ "\nAngry you begin to swing wildly at Kyle and the battle begins.");
	}
	
	
	
	
	
}
