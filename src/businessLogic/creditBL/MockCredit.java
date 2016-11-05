package businessLogic.creditBL;

import utilities.ResultMessage;
import vo.CreditVO;

public class MockCredit extends Credit{
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
