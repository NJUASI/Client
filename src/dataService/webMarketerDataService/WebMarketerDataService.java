package dataService.webMarketerDataService;

import po.WebMarketerPO;
import utilities.ResultMessage;

public interface WebMarketerDataService {

	public WebMarketerPO getSingle (String webMarketID);

	public ResultMessage add(WebMarketerPO newWebMarketerPO);

	public ResultMessage modify (WebMarketerPO webMarketerPO);

	public ResultMessage init();
}
