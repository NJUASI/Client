package dataService.hotelWorkerDataService;

import po.HotelWorkerPO;
import utilities.ResultMessage;

public class HotelWorkerDataService_Stub implements HotelWorkerDataService{

	@Override
	public HotelWorkerPO getSingle(String hotelWorkerID) {
		return new HotelWorkerPO("00001111", "123456");
	}

	@Override
	public ResultMessage add(HotelWorkerPO newHotelWorkerPO) {
		
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage modify(HotelWorkerPO hotelWorkerPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage init() {
		// TODO Auto-generated method stub
		return null;
	}

}
