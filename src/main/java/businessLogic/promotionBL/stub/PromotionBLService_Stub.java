package businessLogic.promotionBL.stub;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import vo.HotelFixedPromotionVO;
import utilities.PreOrder;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.SpecialSpanPromotionVO;

public class PromotionBLService_Stub implements PromotionBLService{

	
	public PromotionBLService_Stub() {
		// TODO Auto-generated constructor stub
	}

	public double getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return 0.8;
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


	@Override
	public double getDiscount(PreOrder preOrder) {
		// TODO 自动生成的方法存根
		return 0;
	}


	@Override
	public Iterator<Double> getDiscountInSpan(PreOrder preOrder) {
		// TODO 自动生成的方法存根
		return null;
	}
	

}
