package co.grandcircus.aVeryMehRPG.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * 
 * "damage": {
 *	"dice_count": 1,
 *	"dice_value": 6,
 */
public class Damage {
	@JsonProperty("dice_count")
	private int dice_count;
	@JsonProperty("dice_value")
	private int dice_value;
	
	
	public int getDiceCount() {
		return dice_count;
	}
	public void setDiceCount(int dice_count) {
		this.dice_count = dice_count;
	}
	public int getDiceValue() {
		return dice_value;
	}
	public void setDiceValue(int dice_value) {
		this.dice_value = dice_value;
	}
	@Override
	public String toString() {
		return "Damage [dice_count=" + dice_count + ", dice_value=" + dice_value + "]";
	}
	
	
	
	

}
