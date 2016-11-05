package businessLogic.creditBL.stub;

import businessLogicService.creditBLService.CreditBLService;
import utilities.ResultMessage;
import vo.CreditVO;

public class CreditBLService_Stub implements CreditBLService {
	String guestID;
	int credit;
	String time;
	String orderID;
	int preCredit;
	String reason;

	public CreditBLService_Stub(String guestID, String time, String orderID, int preCredit,int credit, String reason) {
		this.guestID = guestID;
		this.credit = credit;
		this.time = time;
		this.orderID = orderID;
		this.preCredit = preCredit;
		this.reason = reason;
	}

	public ResultMessage charge(int chargeNum) {
		return ResultMessage.SUCCESS;
	}

	public CreditVO getBasicInfo(String ID) {
		return new CreditVO("1234567890","2016/1/1","123456789012",100,100, "undo");
	}

}
