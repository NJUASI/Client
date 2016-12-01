package dataService.promotionDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import po.AddressPO;
import po.HotelFixedPromotionPO;
import po.SpecialSpanPromotionPO;
import utilities.ResultMessage;
import vo.AddressVO;

public interface PromotionDataService extends Remote{
	
	public List<HotelFixedPromotionPO> getHotelFixedPromotion(String hotelWorkerID) throws RemoteException;
	
	public ResultMessage updateHotelFixedPromotion(HotelFixedPromotionPO hotelFixedPromotionPO) throws RemoteException;

	
	public List<SpecialSpanPromotionPO> getHotelSpecialSpanPromotion(String hotelID) throws RemoteException;
	
	public List<SpecialSpanPromotionPO> getWebSpecialSpanPromotion() throws RemoteException;
	
	public ResultMessage updateSpecialSpanPromotion(List<SpecialSpanPromotionPO> list) throws RemoteException;

	
	public List<AddressPO> getSpecialCirclePromotion(String city) throws RemoteException;

	public ResultMessage updateSepecialCirclePromotion(AddressVO addressVO) throws RemoteException;

	//根据城市商圈获取vip会员商圈专属折扣
	public double getSpecialCircleDiscount(String city, String cycle) throws RemoteException;

}
