package co.grandcircus.aVeryMehRPG.dm;

public class LeaderBoard {
	private String name;
	private double punches;
	private double kicks;
	private int count;
	
	public LeaderBoard() {
		count = 1;
	}
	
	public LeaderBoard(String name, double punches, double kicks) {
		this.name = name;
		this.punches = punches;
		this.kicks = kicks;
		this.count = 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addPunches(double punches) {
		this.punches += punches;
	}
	
	public double getPunches()
	{
		return (punches/count);
	}
	
	public void addKicks(double kicks) {
		this.kicks += kicks;
	}
	
	public double getKicks()
	{
		return (kicks/count);
	}
	public int getCount() {
		return count;
	}
	public void addCount() {
		count++;
	}

	@Override
	public String toString() {
		return "LeaderBoard [name=" + name + ", punches=" + punches + ", kicks=" + kicks + ", count=" + count + "]";
	}
	
	
	
}
