package fligth;

public class Itinerary {
	Fligth[] fligths = {
			new Fligth("2016.09.11.", "102A", "Budapest", "London"),
			new Fligth("2016.09.17.", "502A", "Tokio", "Dubaj"),
			new Fligth("2016.08.29.", "602C", "New York", "London")
			};
	int[] prices;
	
	String getTicketPrice(Fligth f) {
		FligthTicket ft = new FligthTicket(f);
		String price = String.valueOf(ft.getPrice());
		return price;
	}
	
	public void listFligths() {
		for (Fligth f : fligths) {
			System.out.println(f.toString() + " price: " +getTicketPrice(f) );
		}
	}
	
	public void selectFligth(int in) {
		System.out.println(fligths[in-1].toString() + " price: " + getTicketPrice(fligths[in-1]));
	}
	
	public int getPrice(int in){
		return Integer.parseInt(getTicketPrice(fligths[in-1]));
	}
	
}
