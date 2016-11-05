package dataService.webManagerDataService;

import java.util.ArrayList;
import java.util.List;

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

	@Override
	public List<WebManagerPO> getAllWebManager() {
		// TODO Auto-generated method stub
		 List<WebManagerPO> list = new  ArrayList<WebManagerPO>();
		 WebManagerPO a= new WebManagerPO("0001", "123456");
		 list.add(a);
		return list;
	}

}
