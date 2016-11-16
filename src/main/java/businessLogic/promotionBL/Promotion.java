package businessLogic.promotionBL;

import java.util.List;

import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelPromotionVO;
import vo.PromotionVO;
import vo.WebPromotionVO;

public class Promotion{

	public ResultMessage update(List<PromotionVO> list) {
		// TODO Auto-generated method stub
		return  null;
	}

	public List<HotelPromotionVO> getHotelPromotions(String hotelWorkerID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WebPromotionVO> getWebPromotions() {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	public ResultMessage setWebPromotions(List<WebPromotionVO> list) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}
	
	public float getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return 0;
	}
}
