package dataService.hotelWorkerDataService;

import po.HotelWorkerPO;
import utilities.ResultMessage;

public interface HotelWorkerDataService {

	public HotelWorkerPO getSingle (String hotelWorkerID);
	
	public ResultMessage add(HotelWorkerPO newHotelWorkerPO);

	public ResultMessage modify (HotelWorkerPO hotelWorkerPO);
	
	public ResultMessage init();


}