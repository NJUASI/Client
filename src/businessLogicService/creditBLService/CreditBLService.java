package businessLogicService.creditBLService;

import java.util.List;

import utilities.ResultMessage;
import vo.BasicInfoVO;
import vo.CreditVO;

public interface CreditBLService {

	public ResultMessage charge(int chargeNum);
	public BasicInfoVO getBasicInfo (String ID);
	public List<CreditVO> getAllCreditDetail(String guestID);
	
}
