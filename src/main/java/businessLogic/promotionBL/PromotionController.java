package businessLogic.promotionBL;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelFixedPromotionVO;
import vo.SpecialSpanPromotionVO;

public class PromotionController implements PromotionBLService {

	private static PromotionController promotionController = new PromotionController();
	
	private HotelFixedPromotion hotelFixedPromotion;
	private SpecialSpanPromotion specialSpanPromotion; 
	
	private PromotionController() {
		hotelFixedPromotion = new HotelFixedPromotion();
		specialSpanPromotion = new SpecialSpanPromotion();
	}

	public static PromotionController getInstance(){
		return promotionController;
	}

	@Override
	public Iterator<HotelFixedPromotionVO> getHotelFixedPromotions(String hotelWorkerID) {
		return hotelFixedPromotion.getHotelFixedPromotions(hotelWorkerID);
	}

	@Override
	public ResultMessage updateHotelFixedPromotions(List<HotelFixedPromotionVO> list) {
		return hotelFixedPromotion.updateHotelFixedPromotions(list);
	}
	
	@Override
	public Iterator<SpecialSpanPromotionVO> getHotelSpecialSpanPromotions(String hotelID) {
		return specialSpanPromotion.getHotelSpecialSpanPromotions(hotelID);
	}
	
	@Override
	public Iterator<SpecialSpanPromotionVO> getWebSpecialSpanPromotions() {
		return specialSpanPromotion.getWebSpecialSpanPromotions();
	}
	
	@Override
	public ResultMessage updateSpecialSpanPromotions(List<SpecialSpanPromotionVO> list) {
		return specialSpanPromotion.updateSpecialSpanPromotions(list);
	}
	
	@Override
	public Iterator<Double> getDiscountInSpan(PreOrder preOrder) {
		List<Double> discountsInSpan = new ArrayList<Double>();
		LocalDate today = preOrder.checkInDate;
		for(int i = 0;i<preOrder.lastDays;i++){
			discountsInSpan.add(hotelFixedPromotion.getDiscountOneday(preOrder,today)
					*specialSpanPromotion.getDiscountOneday(preOrder,today));
			//TODO 还差一个vip特定商圈的折扣和会员等级折扣
		}
		return discountsInSpan.iterator();
	}

}
