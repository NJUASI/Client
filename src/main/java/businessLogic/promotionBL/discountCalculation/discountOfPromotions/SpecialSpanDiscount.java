package businessLogic.promotionBL.discountCalculation.discountOfPromotions;

import java.time.LocalDate;

import businessLogic.promotionBL.discountCalculation.CalculateDiscount;

public class SpecialSpanDiscount implements CalculateDiscount{

	LocalDate today;
	LocalDate startDay;
	LocalDate endDay;

	public SpecialSpanDiscount(LocalDate startDay,LocalDate endDay) {
		today = LocalDate.now();
		this.startDay = startDay;
		this.endDay = endDay;
	}
	@Override
	public double getDiscount() {
		if(isInSpan()){
			return 0.5;
		}
		return 1;
	}

	private boolean isInSpan(){
		if(today.isAfter(startDay)&&today.isBefore(endDay)){
			return true;
		}
		return false;
	}

}
