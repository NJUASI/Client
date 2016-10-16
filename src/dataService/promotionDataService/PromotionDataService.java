package dataService.promotionDataService;

import java.util.List;

import po.PromotionPO;

public interface PromotionDataService {
	public List<PromotionPO> getPromotions(String userID);
	public boolean setPromotions(String userID,List<PromotionPO> list);
}
