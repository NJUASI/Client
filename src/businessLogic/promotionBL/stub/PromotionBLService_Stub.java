package businessLogic.promotionBL.stub;

import java.util.LinkedList;
import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.PromotionVO;

public class PromotionBLService_Stub implements PromotionBLService{

	
//	//	折扣率
//	 double discount;
//	//	折扣酒店
//	 String hotelID;
//	//	开始日期
//	 String startDate;
//	//	结束日期
//	 String endDate;
//	
//	public PromotionBLService_Stub() {
//		
//	}
	
	public PromotionBLService_Stub() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<PromotionVO> getPromotions(String userID) {
		// TODO Auto-generated method stub
		List<PromotionVO> list = new LinkedList<PromotionVO>();
		list.add(new PromotionVO(0.8, "12345678", "2016/11/11", "2016/11/12"));
		return list;
	}

	@Override
	public ResultMessage update(List<PromotionVO> list) {
		// TODO Auto-generated method stub
		return  ResultMessage.SUCCESS;
	}

	@Override
	public float getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return (float)0.8;
	}
	

}
