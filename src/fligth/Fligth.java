package fligth;

public class Fligth {
	private String fligthDate;
	private String fligthNumber;
	private String departure;
	private String arrival;
	
	public Fligth(String fligthDate, String fligthNumber, String departure, String arrival) {
		this.fligthDate = fligthDate;
		this.fligthNumber = fligthNumber;
		this.departure = departure;
		this.arrival = arrival;
	}

	public String getFligthDate() {
		return fligthDate;
	}

	public String getFligthNumber() {
		return fligthNumber;
	}

	public String getDeparture() {
		return departure;
	}

	public String getArrival() {
		return arrival;
	}

	@Override
	public String toString() {
		return "Fligth [fligthDate=" + fligthDate + ", fligthNumber=" + fligthNumber + ", departure=" + departure
				+ ", arrival=" + arrival + "]";
	}
	
	
}
