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
		
		damageAmount = (quantity * rand.nextInt(damage.getDiceValue()) + 1);
		
		damageAmount += rand.nextInt(hit);
		
		return damageAmount;
	}
	
	public int basicDamage(int hit) {
		Random rand = new Random();
		damageAmount = (rand.nextInt(hit) + 1);
		return damageAmount;
	}
}
