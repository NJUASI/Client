package businessLogic.marketBL.stub;

import businessLogicService.marketBLService.MarketBLService;
import utilities.ResultMessage;
import vo.MarketVO;

public class MarketBLService_Stub implements MarketBLService {
	String marketName;
	int marketCredit;
	String marketBenefit;

	public MarketBLService_Stub(String marketName, int marketCredit, String marketBenefit) {
		this.marketName = marketName;
		this.marketCredit = marketCredit;
		this.marketBenefit = marketBenefit;
	}

	public MarketVO getMemberFormulation() {
		return new MarketVO(marketName, marketCredit, marketBenefit);
	}

	public ResultMessage setMemberFormulation(MarketVO marketVO) {
		return ResultMessage.SUCCESS;
	}

}
