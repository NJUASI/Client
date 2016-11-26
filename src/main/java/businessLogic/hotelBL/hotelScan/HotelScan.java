package businessLogic.hotelBL.hotelScan;

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
	//用以保存处于当前城市商圈的所有酒店概况
	List<HotelGeneralPO> hotelGeneralPOList;
	//用以保存符合当前搜索条件的所有酒店概况
	List<HotelGeneralPO> currentGeneralPOList;
	public HotelScan(AddressVO addressVO) {
		this.city = addressVO.city;
		this.circle = addressVO.cycle;
		hotelDataService = new HotelDataService_Stub();
		initHotelGeneralPOList();
		currentGeneralPOList = hotelGeneralPOList;
	}
	
	private void initHotelGeneralPOList() {
		try {
			hotelGeneralPOList = hotelDataService.getHotelGeneralList(city,circle);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	public Iterator<HotelGeneralVO> getHotelList(ScanStrategy strategy) {
		
		List<HotelGeneralVO> hotelGeneralVOList = new ArrayList<HotelGeneralVO>();
		for(HotelGeneralPO hotelGeneralPO:currentGeneralPOList){
			hotelGeneralVOList.add(new HotelGeneralVO(hotelGeneralPO));
		}
		return hotelGeneralVOList.iterator();
	}
	
	public Iterator<HotelGeneralVO> getBookedList(){
		
		//TODO
		
		return null;
	}

}
