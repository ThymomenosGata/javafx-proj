package vote;

public class DataBase {
	
	private String[] namesOfBattlers;
	private String[] yourNames;
	private int[] stats;
	private int[] ids;
	private int[] procOne;
	private int[] procTwo;
	
	
	public String[] getNamesOfBattlers() {
		return namesOfBattlers;
	}
	public void setNamesOfBattlers(String[] namesOfBattlers) {
		this.namesOfBattlers = namesOfBattlers;
	}
	public String[] getYourNames() {
		return yourNames;
	}
	public void setYourNames(String[] yourNames) {
		this.yourNames = yourNames;
	}
	public int[] getStats() {
		return stats;
	}
	public void setStats(int[] stats) {
		this.stats = stats;
	}
	public int[] getIds() {
		return ids;
	}
	public void setIds(int[] ids) {
		this.ids = ids;
	}
	public int[] getProcOne() {
		return procOne;
	}
	public void setProcOne(int[] procOne) {
		this.procOne = procOne;
	}
	public int[] getProcTwo() {
		return procTwo;
	}
	public void setProcTwo(int[] procTwo) {
		this.procTwo = procTwo;
	}
}
