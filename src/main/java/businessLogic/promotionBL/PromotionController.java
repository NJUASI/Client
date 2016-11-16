package businessLogic.promotionBL;

import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelPromotionVO;
import vo.PromotionVO;
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
	
	
//	/**
//	 * 缁檖romotion娉ㄥ唽涓�涓猦otel
//	 * @param hotelID
//	 */
//	public void setHotel(String hotelID){
//		mockPromotion = new MockPromotion(hotelID);
//	}


	public ResultMessage update(List<PromotionVO> list) {
		
		return promotion.update(list);
	}

	public float getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return promotion.getDiscout(preOrder);
	}

	public List<HotelPromotionVO> getHotelPromotions(String hotelWorkerID) {
		// TODO Auto-generated method stub
		return promotion.getHotelPromotions(hotelWorkerID);
	}

	public List<WebPromotionVO> getWebPromotions() {
		// TODO Auto-generated method stub
		return getWebPromotions();
	}

	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list) {
		// TODO Auto-generated method stub
		return setHotelPromotions(hotelWorkerID, list);
	}

	public ResultMessage setWebPromotions(List<WebPromotionVO> list) {
		// TODO Auto-generated method stub
		return setWebPromotions(list);
	}

}
