package businessLogic.creditBL;

import businessLogicService.creditBLService.CreditBLService;
import utilities.ResultMessage;
import vo.CreditVO;

public class CreditBLService_Stub implements CreditBLService{
	
	String time;
	String orderID;
	int preCredit;
	String credit;
	String reason;
	
	public CreditBLService_Stub(String time, String orderID, int preCredit, String credit, String reason){
		this.time=time;
		this.orderID=orderID;
		this.preCredit=preCredit;
		this.credit=credit;
		this.reason=reason;
	}

	public ResultMessage charge(int chargeNum) {
		return ResultMessage.Success;
	}

	public CreditVO getBasicInfo(String ID) {
		return new CreditVO(time,orderID,preCredit,credit,reason);
	}

}
