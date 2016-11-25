package businessLogic.hotelBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dataService.hotelDataService.HotelDataService;
import dataService.hotelDataService.HotelDataService_Stub;
import po.HotelGeneralPO;
import vo.AddressVO;
import vo.HotelGeneralVO;

public class HotelScan {

	String city;
	String circle;
	HotelDataService hotelDataService;
	List<HotelGeneralPO> hotelGeneralPOList;
	public HotelScan(AddressVO addressVO) {
		this.city = addressVO.city;
		this.circle = addressVO.cycle;
		hotelDataService = new HotelDataService_Stub();
		initHotelGeneralPOList();
	}
	
	private void initHotelGeneralPOList() {
		try {
			hotelGeneralPOList = hotelDataService.getHotelGeneralList(city,circle);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public Iterator<HotelGeneralVO> getHotelList() {
		List<HotelGeneralVO> hotelGeneralVOList = new ArrayList<HotelGeneralVO>();
		for(HotelGeneralPO hotelGeneralPO:hotelGeneralPOList){
			hotelGeneralVOList.add(new HotelGeneralVO(hotelGeneralPO));
		}
		return hotelGeneralVOList.iterator();
	}

}
