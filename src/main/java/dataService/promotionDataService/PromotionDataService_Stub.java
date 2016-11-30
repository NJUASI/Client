package dataService.promotionDataService;

import java.rmi.RemoteException;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import po.HotelFixedPromotionPO;
import po.HotelPromotionPO;
import po.SpecialSpanPromotionPO;
import po.WebPromotionPO;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.SpecialSpanPromotionVO;

public class PromotionDataService_Stub implements PromotionDataService {

	
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID) {
		List<HotelPromotionPO> list = new ArrayList<HotelPromotionPO>();
		list.add(new HotelPromotionPO(PromotionType.HOTEL__BIRTHDAY, "12345678", 0.9, 
				LocalDate.of(2016, 2, 2), LocalDate.of(2016, 3, 9)));
		return list;
	}

	
	public List<WebPromotionPO> getWebPromotions() {
		List<WebPromotionPO> list = new ArrayList<WebPromotionPO>();
		list.add(new WebPromotionPO(PromotionType.WEB_HOLIDAY, "ALL_CYCLE", 0.9, 
				LocalDate.of(2016, 2, 2), LocalDate.of(2016, 3, 9)));
		return list;
	}

	
	public boolean setHotelPromotions(String hotelWorkerID, List<HotelPromotionPO> list) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean setWebPromotions(List<WebPromotionPO> list) {
		// TODO Auto-generated method stub
		return false;
	}


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
	public ResultMessage updateSpecialSpanPromotion(List<SpecialSpanPromotionVO> list) throws RemoteException {
		// TODO 自动生成的方法存根
		return null;
	}

}
