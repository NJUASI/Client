package dataService.webManagerDataService;

import po.WebManagerPO;
import utilities.ResultMessage;

public class WebManagerDataService_Stub implements WebManagerDataService{

	@Override
	public ResultMessage getSingle(String webManagerID) {
		return ResultMessage.SUCCESS;
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
