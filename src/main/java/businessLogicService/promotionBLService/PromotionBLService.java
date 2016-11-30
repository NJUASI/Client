package businessLogicService.promotionBLService;

import java.util.Iterator;
import java.util.List;

import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelFixedPromotionVO;
import vo.HotelPromotionVO;
import vo.SpecialSpanPromotionVO;
import vo.WebPromotionVO;

public interface PromotionBLService {
	
	//生日特惠折扣、三间及以上预订折扣、合作企业及客户折扣
	public Iterator<HotelFixedPromotionVO> getHotelFixedPromotions(String hotelWorkerID);
	
	//特定的期间
	public Iterator<SpecialSpanPromotionVO> getSpecialSpanPromotions(String userID);
	
	
	
	//原方法
	public Iterator<HotelPromotionVO> getHotelPromotions(String hotelWorkerID);

	public Iterator<WebPromotionVO> getWebPromotions();

	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list);

	public ResultMessage setWebPromotions(List<WebPromotionVO> list);
	
	public double getDiscout(PreOrder preOrder);

}
