package businessLogicService.creditBLService;

import utilities.ResultMessage;
import vo.CreditVO;

public interface CreditBLService {

	public ResultMessage charge(int chargeNum);
	public CreditVO getBasicInfo (String ID);
	
}
