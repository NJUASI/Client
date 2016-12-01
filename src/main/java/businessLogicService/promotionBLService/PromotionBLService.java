package businessLogicService.promotionBLService;

import java.util.Iterator;

import utilities.PreOrder;
import vo.HotelFixedPromotionVO;
import vo.SpecialSpanPromotionVO;

public interface PromotionBLService {
	
	//获取生日特惠折扣、三间及以上预订折扣、合作企业及客户折扣
	public Iterator<HotelFixedPromotionVO> getHotelFixedPromotions(String hotelWorkerID);
	
	//获取特定期间的折扣
	public Iterator<SpecialSpanPromotionVO> getSpecialSpanPromotions(String userID);

	//当预订天数为一天时调用该方法
	public double getDiscount(PreOrder preOrder);
	
	//当预订天数大于一天时调用该方法
	public Iterator<Double> getDiscountInSpan(PreOrder preOrder);

}
