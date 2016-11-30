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
		List<HotelFixedPromotionVO> hotelFixedPromotionVOList = new ArrayList<HotelFixedPromotionVO>();
		for(HotelFixedPromotionPO hotelFixedPromotion: hotelFixedPromotions){
			hotelFixedPromotionVOList.add(new HotelFixedPromotionVO(hotelFixedPromotion));
		}
		return hotelFixedPromotionVOList.iterator();
	}

	public ResultMessage updateHotelFixedPromotions(List<HotelFixedPromotionVO> hotelFixedPromotionVO){
		return ResultMessage.SUCCESS;
	}

}
