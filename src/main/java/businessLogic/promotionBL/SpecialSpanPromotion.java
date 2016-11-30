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
		return convertPOListToVOListIterator(specialSpanPromotions);
	}
	
	public ResultMessage updateSpecialSpanPromotions(List<SpecialSpanPromotionVO> list){
		try {
			return promotionDataService.updateSpecialSpanPromotion(convertVOListToPOList(list));
		} catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAIL;
		}
	}
	
	private Iterator<SpecialSpanPromotionVO> convertPOListToVOListIterator(List<SpecialSpanPromotionPO> POList){
		List<SpecialSpanPromotionVO> specialSpanPromotions = new ArrayList<SpecialSpanPromotionVO>();
		for(SpecialSpanPromotionPO specialSpanPromotion: POList){
			specialSpanPromotions.add(new SpecialSpanPromotionVO(specialSpanPromotion));
		}
		return specialSpanPromotions.iterator();
	}

	private List<SpecialSpanPromotionPO> convertVOListToPOList(List<SpecialSpanPromotionVO> VOList){
		specialSpanPromotions.clear();
		for(SpecialSpanPromotionVO specialSpanPromotionVO: VOList){
			specialSpanPromotions.add(new SpecialSpanPromotionPO(specialSpanPromotionVO));
		}
		return specialSpanPromotions;
	}
	
	
}
