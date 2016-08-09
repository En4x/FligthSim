package passanger;

public class FrequentFlyer {
	
	private double discountAmmount;
	
	public FrequentFlyer(int status){
		if(status == 1){			// 1 = silver
			this.discountAmmount = 0.98;
		}else if(status == 2){		// 2 = gold
			this.discountAmmount = 0.97;
		}
	}

	public double getDiscountAmmount() {
		return discountAmmount;
	}
}
