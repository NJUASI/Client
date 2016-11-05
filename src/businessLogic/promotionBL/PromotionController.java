package businessLogic.promotionBL;

import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.ResultMessage;
import vo.PromotionVO;

/**
 * @author Harvey Gong
 *
 * 上午2:36:11
 */
public class PromotionController implements PromotionBLService {


	private Promotion promotion;

	private static PromotionController promotionController;

	private PromotionController() {
		promotion = new MockPromotion();
	}

	/**
	 * @return 返回PromotionController对象，单例
	 */
	public static PromotionController getInstance(){
		if(promotionController == null) promotionController = new PromotionController();
		return promotionController;
	}
	
	
	/**
	 * 给promotion注册一个hotel
	 * @param hotelID
	 */
	public void setHotel(String hotelID){
//		mockPromotion = new MockPromotion(hotelID);
	}


	@Override
	public List<PromotionVO> getPromotions(String userID) {
		// TODO 自动生成的方法存根
		return promotion.getPromotions(userID);
	}

	@Override
	public ResultMessage update(List<PromotionVO> list) {
		// TODO 自动生成的方法存根
		return promotion.update(list);
	}

}
