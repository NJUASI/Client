package dataService.promotionDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import po.HotelFixedPromotionPO;
import po.HotelPromotionPO;
import po.SpecialSpanPromotionPO;
import po.WebPromotionPO;
import utilities.ResultMessage;
import vo.SpecialSpanPromotionVO;

public interface PromotionDataService extends Remote{
	
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID) throws RemoteException;

	public List<WebPromotionPO> getWebPromotions() throws RemoteException;

	public boolean setHotelPromotions(String hotelWorkerID,List<HotelPromotionPO> list) throws RemoteException;

	public boolean setWebPromotions(List<WebPromotionPO> list) throws RemoteException;

	public List<HotelFixedPromotionPO> getHotelFixedPromotion(String hotelWorkerID) throws RemoteException;
	
	public ResultMessage updateHotelFixedPromotion(List<HotelFixedPromotionPO> list) throws RemoteException;

	public List<SpecialSpanPromotionPO> getSpecialSpanPromotion(String userID) throws RemoteException;
	
	public ResultMessage updateSpecialSpanPromotion(List<SpecialSpanPromotionPO> list) throws RemoteException; 

}
