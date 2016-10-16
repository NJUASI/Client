package dataService.webManagerDataService;

import po.WebManagerPO;
import utilities.ResultMessage;

public class WebManagerDataService_Stub implements WebManagerDataService{

	@Override
	public WebManagerPO getSingle(String webManagerID) {
		return new WebManagerPO("0001", "123456");
	}

	@Override
	public ResultMessage add(WebManagerPO newWebManagerPO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage modify(WebManagerPO webManagerPO) {
		// TODO Auto-generated method stub
		return null;
	}

}
