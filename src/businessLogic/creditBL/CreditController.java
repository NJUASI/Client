package businessLogic.creditBL;

import businessLogicService.creditBLService.CreditBLService;
import utilities.ResultMessage;
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
		// TODO Auto-generated method stub
		return credit.charge(chargeNum);
	}

	@Override
	public CreditVO getBasicInfo(String ID) {
		// TODO Auto-generated method stub
		return credit.getBasicInfo(ID);
	}

}
