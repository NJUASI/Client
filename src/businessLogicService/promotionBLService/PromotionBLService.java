package businessLogicService.promotionBLService;

import java.util.List;

import utilities.ResultMessage;
import vo.PromotionVO;

public interface PromotionBLService {

	public List<PromotionVO> getPromotions (String userID);
	public ResultMessage update (List<PromotionVO> list);
//	public float getDiscout(PreOrder preOrder);
	


	
}
