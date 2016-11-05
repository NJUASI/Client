package businessLogic.marketBL;

import businessLogicService.marketBLService.MarketBLService;
import utilities.ResultMessage;
import vo.MarketVO;

public class MarketController implements MarketBLService{

	
	private Market market;
	private static MarketController marketController;
	
	private MarketController() {
		//new the mock object
		market = new MockMarket();
	}
	
	public static MarketController getInstance() {
		if (marketController == null) marketController = new MarketController();
		return marketController;
	}
	
	@Override
	public MarketVO getMemberFormulation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage setMemberFormulation(MarketVO marketVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
