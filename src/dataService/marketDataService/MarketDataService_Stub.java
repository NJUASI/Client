package dataService.marketDataService;

import po.HotelPO;
import po.MarketPO;
import utilities.ResultMessage;

public class MarketDataService_Stub implements MarketDataService {

	@Override
	public MarketPO getMemberFormulation() {
		// TODO Auto-generated method stub
		return new MarketPO("aa",0,"0.9");
	}

	@Override
	public ResultMessage setMemberFormulation(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return null;
	}

}
