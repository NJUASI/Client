package dataService.webMarketerDataService;

import po.WebMarketerPO;
import utilities.ResultMessage;

public class WebMarketerDataService_Stub implements WebMarketerDataService{

	@Override
	public WebMarketerPO getSingle(String webMarketID) {
		return new WebMarketerPO("000001", "123456");
	}

	@Override
	public ResultMessage add(WebMarketerPO newWebMarketerPO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage modify(WebMarketerPO webMarketerPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage init() {
		// TODO Auto-generated method stub
		return null;
	}

}
