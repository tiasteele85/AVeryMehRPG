package co.grandcircus.aVeryMehRPG.model;

public class Damage {
	
	private int dice_count;
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
