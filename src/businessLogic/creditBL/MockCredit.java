package businessLogic.creditBL;

import java.util.List;

import businessLogic.marketBL.Market;
import businessLogic.marketBL.MockMarket;
import businessLogic.userBL.MockUser;
import businessLogic.userBL.User;
import utilities.ResultMessage;
import utilities.UserType;
import vo.BasicInfoVO;
import vo.CreditVO;
import vo.GuestVO;
import vo.MarketVO;

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
	public BasicInfoVO getBasicInfo(String ID) {
		GuestVO guestVO = (GuestVO)user.getSingle("1234567890", UserType.GUEST);
		List<MarketVO> memberFormulationList = market.getMemberFormulation();
		MarketVO marketVO = memberFormulationList.get(0);
		
		String memberDegree = "Lv0";
		if (guestVO.credit > marketVO.marketCredit) {
			memberDegree = "Lv1";
		}
		return new BasicInfoVO(guestVO, memberDegree);
	}
	
	@Override
	public List<CreditVO> getAllCreditDetail(String guestID) {
		return user.getAllCreditDetail(guestID);
	}

}
