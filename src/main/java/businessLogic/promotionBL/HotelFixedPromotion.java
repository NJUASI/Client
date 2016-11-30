package businessLogic.promotionBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dataService.promotionDataService.PromotionDataService;
import dataService.promotionDataService.PromotionDataService_Stub;
import po.HotelFixedPromotionPO;
import utilities.ResultMessage;
import vo.HotelFixedPromotionVO;

public class HotelFixedPromotion {
	PromotionDataService promotionDataService;
	List<HotelFixedPromotionPO> hotelFixedPromotions;

	public HotelFixedPromotion() {
		promotionDataService = new PromotionDataService_Stub();
	}

	public Iterator<HotelFixedPromotionVO> getHotelFixedPromotions(String hotelWorkerID){
		try {
			hotelFixedPromotions = promotionDataService.getHotelFixedPromotion(hotelWorkerID);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return convertPOListToVOListIterator(hotelFixedPromotions);
	}

	public ResultMessage updateHotelFixedPromotions(List<HotelFixedPromotionVO> hotelFixedPromotionVO){
		try {
			return promotionDataService.updateHotelFixedPromotion(convertVOListToPOListIterator(hotelFixedPromotionVO));
		} catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAIL;
		}
	}

	private Iterator<HotelFixedPromotionVO> convertPOListToVOListIterator(List<HotelFixedPromotionPO> POList){
		List<HotelFixedPromotionVO> hotelFixedPromotionVOList = new ArrayList<HotelFixedPromotionVO>();
		for(HotelFixedPromotionPO hotelFixedPromotion: POList){
			hotelFixedPromotionVOList.add(new HotelFixedPromotionVO(hotelFixedPromotion));
		}
		return hotelFixedPromotionVOList.iterator();
	}

	private List<HotelFixedPromotionPO> convertVOListToPOListIterator(List<HotelFixedPromotionVO> VOList){
		hotelFixedPromotions.clear();
		for(HotelFixedPromotionVO hotelFixedPromotion: VOList){
			hotelFixedPromotions.add(new HotelFixedPromotionPO(hotelFixedPromotion));
		}
		return hotelFixedPromotions;
	}

}
