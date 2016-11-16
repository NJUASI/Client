package businessLogic.promotionBL;

import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelPromotionVO;
import vo.WebPromotionVO;

public class PromotionController implements PromotionBLService {


	private Promotion promotion;
	private static PromotionController promotionController;

	private PromotionController() {
		//new the mock object
		promotion = new MockPromotion();
	}

	public static PromotionController getInstance(){
		if(promotionController == null) promotionController = new PromotionController();
		return promotionController;
	}

	public List<HotelPromotionVO> getHotelPromotions(String hotelWorkerID) {
		// TODO Auto-generated method stub
		return promotion.getHotelPromotions(hotelWorkerID);
	}

	public List<WebPromotionVO> getWebPromotions() {
		// TODO Auto-generated method stub
		return promotion.getWebPromotions();
	}

	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list) {
		// TODO Auto-generated method stub
		return promotion.setHotelPromotions(hotelWorkerID, list);
	}

	public ResultMessage setWebPromotions(List<WebPromotionVO> list) {
		// TODO Auto-generated method stub
		return promotion.setWebPromotions(list);
	}

	public double getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return promotion.getDiscout(preOrder);
	}
}
