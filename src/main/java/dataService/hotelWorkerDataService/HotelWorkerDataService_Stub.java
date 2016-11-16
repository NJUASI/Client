package dataService.hotelWorkerDataService;

import java.util.ArrayList;
import java.util.List;

import po.HotelWorkerPO;
import utilities.ResultMessage;

public class HotelWorkerDataService_Stub implements HotelWorkerDataService{

	
	public HotelWorkerPO getSingle(String hotelWorkerID) {
		return new HotelWorkerPO("00001111", "123456");
	}

	
	public List<HotelWorkerPO> getAllHotelWorker() {
		List<HotelWorkerPO>  list= new ArrayList<HotelWorkerPO>();
		HotelWorkerPO b= new HotelWorkerPO("00001111", "123456");
		list.add(b);
		return list;
	}
	
	
	public ResultMessage add(HotelWorkerPO newHotelWorkerPO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage modify(HotelWorkerPO hotelWorkerPO) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResultMessage init() {
		// TODO Auto-generated method stub
		return null;
	}

}
