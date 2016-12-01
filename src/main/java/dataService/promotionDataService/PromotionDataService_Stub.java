package dataService.promotionDataService;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import po.HotelFixedPromotionPO;
import po.SpecialSpanPromotionPO;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.SpecialSpanPromotionVO;

public class PromotionDataService_Stub implements PromotionDataService {


	@Override
	public List<HotelFixedPromotionPO> getHotelFixedPromotion(String hotelWorkerID) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}


	@Override
	public ResultMessage updateHotelFixedPromotion(List<HotelFixedPromotionPO> list) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public List<SpecialSpanPromotionPO> getSpecialSpanPromotion(String userID) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public ResultMessage updateSpecialSpanPromotion(List<SpecialSpanPromotionPO> list) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

}
