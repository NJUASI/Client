package businessLogicService.marketBLService;

import utilities.ResultMessage;
import vo.MarketVO;

public interface MarketBLService {

	public MarketVO getMemberFormulation ();
	public ResultMessage setMemberFormulation (MarketVO marketVO);


}
