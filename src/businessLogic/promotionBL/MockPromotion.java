package businessLogic.promotionBL;

import java.util.ArrayList;
import java.util.List;

import utilities.ResultMessage;
import vo.PromotionVO;

public class MockPromotion extends Promotion {
	
	public MockPromotion(String hotelID) {
		super(hotelID);
	}

	@Override
	public List<PromotionVO> getPromotions(String hotelID) {
		// TODO 自动生成的方法存根
		
		List<PromotionVO> list = new ArrayList<PromotionVO>();
		
		list.add(new PromotionVO(0.9, "12345678", "2016/11/11", "2016/11/12"));
		list.add(new PromotionVO(0.8, "12345679", "2016/11/12", "2016/11/13"));
		
		return list;
	}

	@Override
	public ResultMessage update(List<PromotionVO> list) {
		// TODO 自动生成的方法存根
		return ResultMessage.SUCCESS;
	}
	
}
