package businessLogic.userBL.stub;

import java.util.List;

import businessLogicService.userBLService.UserBLService;
import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.HotelVO;
import vo.UserVO;

public class UserBLService_Stub implements UserBLService {

	@Override
	public List<UserVO> getAll(UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO getSingle(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CreditVO> getAllCreditDetail(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ResultMessage add(UserVO newUserVO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage modify(UserVO userVO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage modifyCredit(String guestID, float creditNum) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	@Override
	public String getLogInInfo(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}
}
