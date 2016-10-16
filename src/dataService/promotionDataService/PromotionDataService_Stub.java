package dataService.promotionDataService;

import java.util.ArrayList;
import java.util.List;

import po.PromotionPO;

public class PromotionDataService_Stub implements PromotionDataService {

	@Override
	public List<PromotionPO> getPromotions(String userID) {
		// TODO Auto-generated method stub
		ArrayList<PromotionPO> list = new ArrayList<PromotionPO>();
		list.add(new PromotionPO(0,"","",""));
		return list;
	}

	@Override
	public boolean setPromotions(String userID, List<PromotionPO> list) {
		// TODO Auto-generated method stub
		return false;
	}

}
