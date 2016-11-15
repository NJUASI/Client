package businessLogic.creditBL;

import java.util.List;

import businessLogicService.creditBLService.CreditBLService;
import utilities.ResultMessage;
import vo.BasicInfoVO;
import vo.CreditVO;
import vo.MarketVO;

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
	
	public ResultMessage charge(String guestID, int chargeNum) {
		return credit.charge(guestID, chargeNum);
	}

	public BasicInfoVO getBasicInfo(String guestID) {
		return credit.getBasicInfo(guestID);
	}
	
	public List<CreditVO> getAllCreditDetail(String guestID) {
		return credit.getAllCreditDetail(guestID);
	}
	
	public List<MarketVO> getMemberFormulation() {
		return credit.getMemberFormulation();
	}

}