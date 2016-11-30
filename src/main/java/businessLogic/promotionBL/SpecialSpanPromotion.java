package businessLogic.promotionBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dataService.promotionDataService.PromotionDataService;
import dataService.promotionDataService.PromotionDataService_Stub;
import po.SpecialSpanPromotionPO;
import utilities.ResultMessage;
import vo.SpecialSpanPromotionVO;

public class SpecialSpanPromotion {
	
	PromotionDataService promotionDataService;
	List<SpecialSpanPromotionPO> specialSpanPromotions;
	
	public SpecialSpanPromotion() {
		promotionDataService = new PromotionDataService_Stub();
	}
	
	public Iterator<SpecialSpanPromotionVO> getSpecialSpanPromotions(String hotelWorkerID){
		try {
			specialSpanPromotions = promotionDataService.getSpecialSpanPromotion(hotelWorkerID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		List<SpecialSpanPromotionVO> specialSpanPromotionVOList = new ArrayList<SpecialSpanPromotionVO>();
		for(SpecialSpanPromotionPO specialSpanPromotion: specialSpanPromotions){
			specialSpanPromotionVOList.add(new SpecialSpanPromotionVO(specialSpanPromotion));
		}
		return specialSpanPromotionVOList.iterator();
	}
	
	public ResultMessage updateSpecialSpanPromotions(List<SpecialSpanPromotionVO> list){
		return ResultMessage.SUCCESS;
	}
	
	
}
