package dataService.webMarketerDataService;

import po.WebMarketerPO;
import utilities.ResultMessage;

public interface WebMarketerDataService {

	public ResultMessage getSingle (String webMarketID);

	public ResultMessage add(WebMarketerPO newWebMarketerPO);

	public ResultMessage modify (WebMarketerPO webMarketerPO);

	public ResultMessage init();
}
