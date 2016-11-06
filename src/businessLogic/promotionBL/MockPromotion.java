package businessLogic.promotionBL;

import java.util.ArrayList;
import java.util.List;

import utilities.PreOrder;
import utilities.ResultMessage;
import vo.PromotionVO;

public class MockPromotion extends Promotion {
	
	@Override
	public List<PromotionVO> getPromotions(String hotelID) {
		List<PromotionVO> list = new ArrayList<PromotionVO>();
		list.add(new PromotionVO(0.9, "12345678", "2016/11/11", "2016/11/12"));
		return list;
	}

	@Override
	public ResultMessage update(List<PromotionVO> list) {
		return ResultMessage.SUCCESS;
	}
	
	public float getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
