package businessLogic.promotionBL.stub;

import java.util.Iterator;
import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import vo.HotelFixedPromotionVO;
import utilities.PreOrder;
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
	public ResultMessage updateHotelFixedPromotions(List<HotelFixedPromotionVO> hotelFixedPromotionVO) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Iterator<SpecialSpanPromotionVO> getHotelSpecialSpanPromotions(String userID) {
		// TODO 自动生成的方法存根
		return null;
	}
	
	@Override
	public Iterator<SpecialSpanPromotionVO> getWebSpecialSpanPromotions() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage updateSpecialSpanPromotions(List<SpecialSpanPromotionVO> list) {
		// TODO 自动生成的方法存根
		return null;
	}
	
	@Override
	public Iterator<Double> getDiscountInSpan(PreOrder preOrder) {
		// TODO 自动生成的方法存根
		return null;
	}

}
