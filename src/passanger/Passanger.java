package passanger;

public class Passanger {
	
	private String name;
	private double ffState;
	private int miles;
	public Passanger(String name, int miles){
		
		this.name = name;
		this.ffState = 0;
		this.miles = miles;
	}
	public double getFfState() {
		return ffState;
	}
	public void setFfState(double ffState) {
		this.ffState = ffState;
	}
	public int getMiles() {
		return miles;
	}
	
	public void runStateWithMiles(){
		
		FFState ffs = new FFState();
		this.ffState = ffs.getDiscountRunner(ffs.getCategory(this.miles));		
	}
	
	
}
