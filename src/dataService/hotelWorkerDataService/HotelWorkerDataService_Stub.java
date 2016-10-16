package dataService.hotelWorkerDataService;

import po.HotelWorkerPO;
import utilities.ResultMessage;

public class HotelWorkerDataService_Stub implements HotelWorkerDataService{

	@Override
	public ResultMessage getSingle(String hotelWorkerID) {
		return ResultMessage.SUCCESS;
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
