package businessLogicService.promotionBLService;

import java.util.List;

import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelPromotionVO;
import vo.WebPromotionVO;

public interface PromotionBLService {

	public List<HotelPromotionVO> getHotelPromotions(String hotelWorkerID);

	public List<WebPromotionVO> getWebPromotions();

	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list);

	public ResultMessage setWebPromotions(List<WebPromotionVO> list);
	
	public float getDiscout(PreOrder preOrder);

}
