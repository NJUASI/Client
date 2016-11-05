package businessLogic.promotionBL;

import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.ResultMessage;
import vo.PromotionVO;

/**
 * @author Harvey Gong
 *
 * 上午2:35:54
 */
public class Promotion{

	String hotelID;
	
	public Promotion(String hotelID) {
		this.hotelID = hotelID;
	}

	public List<PromotionVO> getPromotions(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage update(List<PromotionVO> list) {
		// TODO Auto-generated method stub
		return  null;
	}


}
