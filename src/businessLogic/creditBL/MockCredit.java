package businessLogic.creditBL;

import utilities.ResultMessage;
import vo.CreditVO;

public class MockCredit extends Credit{
	@Override
	public ResultMessage charge(int chargeNum) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public CreditVO getBasicInfo(String ID) {
		// TODO Auto-generated method stub
		CreditVO creditVO = new CreditVO("1234567890","2016/1/1","123456789012",100,100, "undo");
		return creditVO;
	}

}
