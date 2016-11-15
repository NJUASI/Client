package businessLogic.creditBL;

import java.util.List;

import businessLogic.marketBL.Market;
import businessLogic.userBL.User;
import utilities.ResultMessage;
import vo.BasicInfoVO;
import vo.CreditVO;
import vo.MarketVO;

public class Credit {

	private User user;
	private Market market;
	
	public Credit() {
		user = new User();
		market = new Market();
	}
	
	public ResultMessage charge(String guestID, int chargeNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public BasicInfoVO getBasicInfo(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<CreditVO> getAllCreditDetail(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<MarketVO> getMemberFormulation() {
		// TODO Auto-generated method stub
		return null;
	}
}
