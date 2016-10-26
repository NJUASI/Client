package dataService.promotionDataService;

import java.util.ArrayList;
import java.util.List;

import po.PromotionPO;

public class PromotionDataService_Stub implements PromotionDataService {

	@Override
	public List<PromotionPO> getPromotions(String userID) {
		// TODO Auto-generated method stub
		ArrayList<PromotionPO> list = new ArrayList<PromotionPO>();
		list.add(new PromotionPO(0.9,"12345678","2016/2/2","2016/3/9"));
		return list;
	}

	@Override
	public boolean setPromotions(String userID, List<PromotionPO> list) {
		// TODO Auto-generated method stub
		return false;
	}

}
