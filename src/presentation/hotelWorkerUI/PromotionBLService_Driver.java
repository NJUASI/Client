package presentation.hotelWorkerUI;

import businessLogic.promotionBL.MockPromotion;
import businessLogic.promotionBL.Promotion;
import businessLogicService.promotionBLService.PromotionBLService;

public class PromotionBLService_Driver {
	Promotion promotionBLService;
	
	public PromotionBLService_Driver(MockPromotion stub) {
		this.promotionBLService = stub;
	}
}
