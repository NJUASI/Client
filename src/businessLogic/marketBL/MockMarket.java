package businessLogic.marketBL;

import utilities.ResultMessage;
import vo.MarketVO;

public class MockMarket extends Market {
	
	public MarketVO getMemberFormulation() {
		// TODO Auto-generated method stub
		return new MarketVO("Lv1",500 , "0.9");
	}


	public ResultMessage setMemberFormulation(MarketVO marketVO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}
}
