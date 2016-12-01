package businessLogic.promotionBL.discountCalculation.discountOfPromotions;

import businessLogic.promotionBL.discountCalculation.CalculateDiscount;

public class CollaboratorsDiscount implements CalculateDiscount{

	boolean isCollaborators;
	
	public CollaboratorsDiscount(boolean isCollaborators) {
		this.isCollaborators =  isCollaborators;
	}
	
	@Override
	public double getDiscount() {
		if(isCollaborators){
			return 0.5;
		}
		return 1;
	}
	
}
