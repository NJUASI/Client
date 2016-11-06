package businessLogic.creditBL;

import businessLogic.marketBL.Market;
import businessLogic.marketBL.MockMarket;
import businessLogic.userBL.MockUser;
import businessLogic.userBL.User;
import utilities.ResultMessage;
import vo.CreditVO;

public class MockCredit extends Credit{
	
	private User user;
	private Market market;
	
	public MockCredit() {
		user = new MockUser();
		market = new MockMarket();
	}
	
	@Override
	public ResultMessage charge(int chargeNum) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public CreditVO getBasicInfo(String ID) {
		CreditVO creditVO = new CreditVO("1234567890","2016/1/1","123456789012",100,100, "undo");
		return creditVO;
	}

}
