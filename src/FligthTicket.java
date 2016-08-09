
public class FligthTicket {
	String departure;
	String arrival;
	String fligthDate;
	
	public FligthTicket(Fligth fligth) {
		this.departure = fligth.getDeparture();
		this.arrival = fligth.getArrival();
		this.fligthDate = fligth.getFligthDate();
	}
	
	int getPrice() {
		int price = 0;
		if (departure.equals("Budapest") && arrival.equals("London"))
			price = 100;
		else if (departure.equals("Tokio") && arrival.equals("Dubaj"))
			price = 300;
		else if (departure.equals("New York") && arrival.equals("London"))
			price = 400;
		else 
			price = -1;
		return price;
	}
	
}
