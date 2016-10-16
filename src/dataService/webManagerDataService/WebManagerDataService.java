package dataService.webManagerDataService;

import po.WebManagerPO;
import utilities.ResultMessage;

public interface WebManagerDataService {

	public WebManagerPO getSingle (String webManagerID);

	public ResultMessage add(WebManagerPO newWebManagerPO);

	public ResultMessage modify (WebManagerPO webManagerPO);
}
