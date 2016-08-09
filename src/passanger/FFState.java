package passanger;

public class FFState {
		
	public int getCategory(int miles){
		int categoryNumber = 0;
		if(miles < 20000){
			categoryNumber = 0;
		}else if(miles >= 20000 && miles < 50000){
			categoryNumber = 1;
		}else if(miles > 50000){
			categoryNumber = 2;
		}
		return categoryNumber;
	}
	
	public double getDiscountRunner(int stage){
		double discountNumber = 0.00;
		if(stage == 0){
			OccasionalFlyer of = new OccasionalFlyer();
			discountNumber = of.getDiscountAmmount();
		}else if(stage == 1){
			FrequentFlyer ff = new FrequentFlyer(stage);
			discountNumber = ff.getDiscountAmmount();
		}else if(stage == 2){
			FrequentFlyer ff = new FrequentFlyer(stage);
			discountNumber = ff.getDiscountAmmount();
		}
		return discountNumber;
	}
}
