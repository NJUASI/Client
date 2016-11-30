package businessLogic.promotionBL;

import java.util.Iterator;
import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.PreOrder;
import utilities.ResultMessage;
import utilities.UserType;
import vo.HotelFixedPromotionVO;
import vo.HotelPromotionVO;
import vo.SpecialSpanPromotionVO;
import vo.WebPromotionVO;

public class PromotionController implements PromotionBLService {


	private Promotion promotion;
	private static PromotionController promotionController = new PromotionController();

	private PromotionController() {
		//new the mock object
		promotion = new MockPromotion();
	}

	public static PromotionController getInstance(){
		return promotionController;
	}


	// 对酒店策略的操作，get，set
	public Iterator<HotelPromotionVO> getHotelPromotions(String hotelWorkerID) {
		// TODO Auto-generated method stub
		return promotion.getHotelPromotions(hotelWorkerID);
	}
	
	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list) {
		// TODO Auto-generated method stub
		return promotion.setHotelPromotions(hotelWorkerID, list);
	}
	
	
	//对网站营销策略的操作，get，set
	public Iterator<WebPromotionVO> getWebPromotions() {
		// TODO Auto-generated method stub
		return promotion.getWebPromotions();
	}

	public ResultMessage setWebPromotions(List<WebPromotionVO> list) {
		// TODO Auto-generated method stub
		return promotion.setWebPromotions(list);
	}

	public double getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return promotion.getDiscout(preOrder);
	}

	@Override
	public Iterator<HotelFixedPromotionVO> getHotelFixedPromotions(String hotelWorkerID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Iterator<SpecialSpanPromotionVO> getSpecialSpanPromotions(String userID) {
		// TODO 自动生成的方法存根
		return null;
	}
}
