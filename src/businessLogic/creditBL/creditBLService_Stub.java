package businessLogic.creditBL;

import businessLogicService.creditBLService.CreditBLService;
import utilities.ResultMessage;
import vo.CreditVO;

public class CreditBLService_Stub implements CreditBLService {
	String guestID;
	String memberLevel;
	String birthday;
	String enterprise;
	String name;
	String nickName;
	String password;
	String phone;
	String credit;
	String time;
	String orderID;
	int preCredit;
	String reason;

	public CreditBLService_Stub(String guestID, String memberLevel, String birthday, String enterprise, String name,
			String nickName, String password, String phone, String credit, String time, String orderID, int preCredit,
			String reason) {
		this.guestID = guestID;
		this.memberLevel = memberLevel;
		this.birthday = birthday;
		this.enterprise = enterprise;
		this.name = name;
		this.nickName = nickName;
		this.password = password;
		this.phone = phone;
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
		return new CreditVO(guestID, memberLevel, birthday, enterprise, name, nickName, password, phone, credit, time,
				orderID, preCredit, reason);
	}

}
