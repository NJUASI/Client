package businessLogic.creditBL;

import java.util.List;

import businessLogicService.creditBLService.CreditBLService;
import utilities.ResultMessage;
import vo.BasicInfoVO;
import vo.CreditVO;

public class CreditController implements CreditBLService{

	
	private Credit credit;
	private static CreditController creditController;
	
	private CreditController() {
		//new the mock object
		credit = new MockCredit();
	}
	
	public static CreditController getInstance() {
		if (creditController == null) creditController = new CreditController();
		return creditController;
	}
	
	@Override
	public ResultMessage charge(int chargeNum) {
		return credit.charge(chargeNum);
	}

	@Override
	public BasicInfoVO getBasicInfo(String ID) {
		return credit.getBasicInfo(ID);
	}
	
	@Override
	public List<CreditVO> getAllCreditDetail(String guestID) {
		return credit.getAllCreditDetail(guestID);
	}

}
