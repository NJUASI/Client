package businessLogic.promotionBL.discountCalculation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import utilities.PreOrder;

public class DiscountCalculator {
	
	List<OneDayDiscount> discountOflastDays;
	
	public DiscountCalculator() {
		discountOflastDays = new ArrayList<OneDayDiscount>();
	}
	
	public Iterator<Double> getDiscountOfEachDay(PreOrder preOrder){
		for(int i = 0;i < preOrder.lastDays;i++){
			discountOflastDays.add(new OneDayDiscount(preOrder));
		}
		List<Double> discountOfEachDay = new ArrayList<Double>();
		for(int i = 0;i < preOrder.lastDays;i++){
			discountOfEachDay.add(discountOflastDays.get(i).getDiscount());
		}
		return discountOfEachDay.iterator();
	}

	public double getDiscountOneday(PreOrder preOrder) {
		return new OneDayDiscount(preOrder).getDiscount();
	}
}
