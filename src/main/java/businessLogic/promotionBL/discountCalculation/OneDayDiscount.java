package businessLogic.promotionBL.discountCalculation;

import java.util.List;

import utilities.PreOrder;

public class OneDayDiscount {

	PreOrder preOrder;
	List<CalculateDiscount>  calculateDiscount;
	double onedayDiscount = 1;
	
	public OneDayDiscount(PreOrder preOrder) {
		this.preOrder = preOrder;
	}

	public Double getDiscount() {
		for(int i = 0;i<calculateDiscount.size();i++){
			onedayDiscount = onedayDiscount * calculateDiscount.get(i).getDiscount();
		}
		return onedayDiscount;
	}
	
	private void initCalculateDiscount(){
		//TODO
	}

}
