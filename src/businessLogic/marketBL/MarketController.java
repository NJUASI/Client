package businessLogic.marketBL;

import java.util.List;

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
	public List<MarketVO> getMemberFormulation() {
		return market.getMemberFormulation();
	}

	@Override
	public ResultMessage setMemberFormulation(List<MarketVO> marketVOList) {
		return market.setMemberFormulation(marketVOList);
	}

}
