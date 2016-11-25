package businessLogic.userBL.userService.service;

import java.util.List;

import utilities.ResultMessage;
import vo.CreditVO;

public interface CreditService {
	
	public ResultMessage modifyCredit (String guestID, float creditNum);
	
	public List<CreditVO> getAllCreditDetail(String guestID);

}
