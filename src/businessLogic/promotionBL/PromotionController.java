package businessLogic.promotionBL;

import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.PromotionVO;

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
	
	
//	/**
//	 * 给promotion注册一个hotel
//	 * @param hotelID
//	 */
//	public void setHotel(String hotelID){
//		mockPromotion = new MockPromotion(hotelID);
//	}


	@Override
	public List<PromotionVO> getPromotions(String userID) {
		
		return promotion.getPromotions(userID);
	}

	@Override
	public ResultMessage update(List<PromotionVO> list) {
		
		return promotion.update(list);
	}

	@Override
	public float getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return promotion.getDiscout(preOrder);
	}

}
