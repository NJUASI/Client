package businessLogic.marketBL.stub;

import java.util.LinkedList;
import java.util.List;

import businessLogicService.marketBLService.MarketBLService;
import utilities.ResultMessage;
import vo.MarketVO;

public class MarketBLService_Stub implements MarketBLService {
//	String marketName;
//	int marketCredit;
//	String marketBenefit;
//
//	public MarketBLService_Stub(String marketName, int marketCredit, String marketBenefit) {
//		this.marketName = marketName;
//		this.marketCredit = marketCredit;
//		this.marketBenefit = marketBenefit;
//	}

	public List<MarketVO> getMemberFormulation() {
		List<MarketVO> list = new LinkedList<MarketVO>();
		list.add(new MarketVO("Lv1",500 , 0.9));
		return list;
	}

	public ResultMessage setMemberFormulation(List<MarketVO> marketVOList) {
		return ResultMessage.SUCCESS;
	}

}
