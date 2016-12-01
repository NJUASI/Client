package businessLogic.promotionBL;

import java.util.Iterator;
import java.util.List;

import businessLogic.promotionBL.discountCalculation.DiscountCalculator;
import businessLogicService.promotionBLService.PromotionBLService;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelFixedPromotionVO;
import vo.SpecialSpanPromotionVO;

public class PromotionController implements PromotionBLService {


	
	private static PromotionController promotionController = new PromotionController();
	
	private HotelFixedPromotion hotelFixedPromotion;
	private SpecialSpanPromotion specialSpanPromotion; 
	private DiscountCalculator discountCalculator;
	
	private PromotionController() {
		//new the mock object
		hotelFixedPromotion = new HotelFixedPromotion();
		specialSpanPromotion = new SpecialSpanPromotion();
		discountCalculator = new DiscountCalculator();
	}

	public static PromotionController getInstance(){
		return promotionController;
	}

	@Override
	public Iterator<HotelFixedPromotionVO> getHotelFixedPromotions(String hotelWorkerID) {
		return hotelFixedPromotion.getHotelFixedPromotions(hotelWorkerID);
	}

	@Override
	public Iterator<SpecialSpanPromotionVO> getSpecialSpanPromotions(String userID) {
		return specialSpanPromotion.getSpecialSpanPromotions(userID);
	}
	
	@Override
	public double getDiscount(PreOrder preOrder) {
		return discountCalculator.getDiscountOneday(preOrder);
	}

	@Override
	public Iterator<Double> getDiscountInSpan(PreOrder preOrder) {
		return discountCalculator.getDiscountOfEachDay(preOrder);
	}
}
