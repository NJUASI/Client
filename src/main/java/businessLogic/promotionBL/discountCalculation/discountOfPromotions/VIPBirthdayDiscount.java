package businessLogic.promotionBL.discountCalculation.discountOfPromotions;

import java.time.LocalDate;

import businessLogic.promotionBL.discountCalculation.CalculateDiscount;

public class VIPBirthdayDiscount implements CalculateDiscount{

	LocalDate date;
	LocalDate birthDay;
	
	public VIPBirthdayDiscount(LocalDate birthDay) {
		date = LocalDate.now();
		this.birthDay = birthDay;
	}
	
	@Override
	public double getDiscount() {
		if(isSameDay()){
			return 0.5; 
		}
		return 1;
	}
	
	
	private boolean isSameDay(){
		if(birthDay.getMonth()==date.getMonth())
		{
			if(birthDay.getDayOfMonth()==date.getDayOfMonth()){
				return true;
			}
		}
		return false;
	}
}
