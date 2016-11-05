package businessLogic.promotionBL;

import java.util.ArrayList;
import java.util.List;

import utilities.ResultMessage;
import vo.PromotionVO;

public class MockPromotion extends Promotion {
	
	public MockPromotion() {
		super();
	}

	@Override
	public List<PromotionVO> getPromotions(String hotelID) {
		
		List<PromotionVO> list = new ArrayList<PromotionVO>();
		
		list.add(new PromotionVO(0.9, "12345678", "2016/11/11", "2016/11/12"));
		list.add(new PromotionVO(0.8, "12345679", "2016/11/12", "2016/11/13"));
		
		return list;
	}

	@Override
	public ResultMessage update(List<PromotionVO> list) {
		return ResultMessage.SUCCESS;
	}
	
}
