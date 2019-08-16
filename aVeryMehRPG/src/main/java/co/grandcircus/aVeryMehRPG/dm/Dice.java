package co.grandcircus.aVeryMehRPG.dm;

import java.util.Random;

import co.grandcircus.aVeryMehRPG.model.Damage;

/*
 * Class to determine damage for characters
 */
public class Dice {
	
	
	private int damageAmount;
	
	public int getDamage(Damage damage, int hit) {
		Random rand = new Random();
		int quantity = damage.getDiceCount();
		
		damageAmount = (quantity * rand.nextInt(damage.getDiceValue()));
		
		damageAmount += rand.nextInt(hit);
		
		return damageAmount;
	}
}
