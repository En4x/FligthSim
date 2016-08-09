import fligth.*;
import passanger.*;


public class Trip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selected = 2;
		int miles = 10000;
		
		System.out.println("FlightSimulator: ");
		Itinerary i = new Itinerary();
		i.listFligths();
		System.out.println("\r\nSelected Fligth: ");
		i.selectFligth(selected);
		Passanger pax = new Passanger("Bon Jovi", miles);
		pax.runStateWithMiles();
		double discountedPrice =  i.getPrice(selected) * pax.getFfState();
		System.out.println("Final price is: " +  String.valueOf(discountedPrice) + "€");
	}

}
