package businessLogic.promotionBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import businessLogic.hotelBL.hotel.Hotel;
import businessLogic.memberBL.Member;
import dataService.promotionDataService.PromotionDataService;
import dataService.promotionDataService.PromotionDataService_Stub;
import po.AddressPO;
import utilities.MemberType;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.AddressVO;
import vo.HotelVO;

/**
 * @Description:对于VIP会员特定商圈专属折扣
 * @author:Harvey Gong
 * @time:2016年12月1日 下午9:29:44
 */
public class SpecialCirclePromotion {

	private PromotionDataService promotionDataService;
	private List<AddressPO> specialCirclePromotions;

	public SpecialCirclePromotion() {
		promotionDataService = new PromotionDataService_Stub();
	}
	
	/**
	 * @Description:根据所选城市，返回该城市所有的商圈和对应商圈的vip折扣
	 * @param city
	 * @return
	 * Iterator<AddressVO>
	 * @author: Harvey Gong
	 * @time:2016年12月1日 下午9:41:48
	 */
	public Iterator<AddressVO> getSpecialCirclePromoitons(String city){
		initSpecialCirclePromotions(city);
		return convertPOListToVOListIterator(specialCirclePromotions);
	}
	
	/**
	 * @Description:更新商圈的vip折扣,单条更新
	 * @param addressVO
	 * @return
	 * ResultMessage
	 * @author: Harvey Gong
	 * @time:2016年12月1日 下午9:45:02
	 */
	public ResultMessage updateSpecialCirclePromotion(AddressVO addressVO){
		try {
			return promotionDataService.updateSepecialCirclePromotion(addressVO);
		} catch (RemoteException e) {
			return ResultMessage.FAIL;
		}
	}

	public double getDiscount(PreOrder preOrder){
		if(isVIP(preOrder.guestID)){
			HotelVO currentHotelInfo = new Hotel().getHotelInfo(preOrder.hotelID);
			String city = currentHotelInfo.city;
			String cycle = currentHotelInfo.cycle;
			try {
				return promotionDataService.getSpecialCircleDiscount(city,cycle);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
		}
		return 1;
	}
		
	
	private boolean isVIP(String guestID){
		return new Member().isMember(guestID, MemberType.COMMON);
	}
	
	private Iterator<AddressVO> convertPOListToVOListIterator(List<AddressPO> POList){
		List<AddressVO> specialCirclePromotionVOList = new ArrayList<AddressVO>();
		for(AddressPO specialCirclePromotion: POList){
			specialCirclePromotionVOList.add(new AddressVO(specialCirclePromotion));
		}
		return specialCirclePromotionVOList.iterator();
	}
	
	private void initSpecialCirclePromotions(String city) {
		try {
			specialCirclePromotions = promotionDataService.getSpecialCirclePromotion(city);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
