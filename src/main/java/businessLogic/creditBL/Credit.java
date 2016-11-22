package businessLogic.creditBL;

import java.util.List;

import businessLogic.marketBL.Market;
import businessLogic.userBL.User;
import utilities.ResultMessage;
import utilities.UserType;
import vo.BasicInfoVO;
import vo.CreditVO;
import vo.GuestVO;
import vo.MarketVO;

public class Credit {

	private User user;
	private Market market;
	
	public Credit() {
		user = new User();
		market = new Market();
	}
	
	public ResultMessage charge(String guestID, float chargeNum) {
		return 	user.modifyCredit(guestID, chargeNum);
	}

	public BasicInfoVO getBasicInfo(String ID) {
		UserType userType;
		
		if(ID.length()==10){//客户的ID长度为10
			userType=UserType.GUEST;
			GuestVO guestVO = (GuestVO)user.getSingle(ID, userType);
			
			List<MarketVO> memberFormulationList = market.getMemberFormulation();
			for (int i = 0; i < memberFormulationList.size(); i++) {
				if(guestVO.credit < memberFormulationList.get(i).marketCredit){
					return new BasicInfoVO(guestVO,memberFormulationList.get(i).marketName);
				}
			}
			return new BasicInfoVO(guestVO,memberFormulationList.
					get( memberFormulationList.size()-1).marketName);
		}
		
		return null;
		
	}

	public List<CreditVO> getAllCreditDetail(String guestID) {
		return user.getAllCreditDetail(guestID);
	}
	
	public List<MarketVO> getMemberFormulation() {
		return market.getMemberFormulation();
	}
}
