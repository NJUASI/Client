package businessLogicService.promotionBLService;

import java.util.Iterator;
import java.util.List;

import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelPromotionVO;
import vo.WebPromotionVO;

public interface PromotionBLService {

	public Iterator<HotelPromotionVO> getHotelPromotions(String hotelWorkerID);

	public Iterator<WebPromotionVO> getWebPromotions();

	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list);

	public ResultMessage setWebPromotions(List<WebPromotionVO> list);
	
	public double getDiscout(PreOrder preOrder);

}
