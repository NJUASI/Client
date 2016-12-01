package businessLogic.promotionBL.discountCalculation.discountOfPromotions;

import businessLogic.promotionBL.discountCalculation.CalculateDiscount;

public class ThreeAndAboveDiscount implements CalculateDiscount{

	int standardNum = 3;
	int roomNum;
	
	public ThreeAndAboveDiscount(int roomNum) {
		this.roomNum = roomNum;
	}
	
	//需要比对房间数量是否
	@Override
	public double getDiscount() {
		if(roomNum>=standardNum){
			return 0.5;
		}
		else
		{
			return 1;
		}
	}

}
