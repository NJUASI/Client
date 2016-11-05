package businessLogic.promotionBL;

import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.ResultMessage;
import vo.PromotionVO;

public class PromotionBLService_Stub implements PromotionBLService{
//	折扣率
	 double discount;
	//	折扣酒店
	 String hotelID;
	//	开始日期
	 String startDate;
	//	结束日期
	 String endDate;
	
	public PromotionBLService_Stub(double discount, String hotelID, String startDate, String endDate) {
		super();
		this.discount = discount;
		this.hotelID = hotelID;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	@Override
	public List<PromotionVO> getPromotions(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage update(List<PromotionVO> list) {
		// TODO Auto-generated method stub
		return  ResultMessage.SUCCESS;
	}
	

}
