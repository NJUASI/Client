package businessLogic.userBL;

import java.util.List;

import businessLogicService.userBLService.UserBLService;
import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.HotelVO;
import vo.UserVO;

public class UserController implements UserBLService{

	
	private User user;
	private static UserController userController;
	
	private UserController() {
		//new the mock object
		user = new MockUser();
	}

	public static UserController getInstance(){
		if(userController == null) userController = new UserController();
		return userController;
	}
	
	@Override
	public List<UserVO> getAll(UserType userType) {
		return user.getAll(userType);
	}

	@Override
	public UserVO getSingle(String userID, UserType userType) {
		return user.getSingle(userID, userType);
	}

	@Override
	public List<CreditVO> getAllCreditDetail(String guestID) {
		return user.getAllCreditDetail(guestID);
	}
	
	@Override
	public ResultMessage add(UserVO newUserVO) {
		return user.add(newUserVO);
	}

	@Override
	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {
		return user.addHotel(newHotelVO, hotelID);
	}

	@Override
	public ResultMessage modify(UserVO userVO) {
		return user.modify(userVO);
	}

	@Override
	public ResultMessage modifyCredit(String guestID, float creditNum) {
		return user.modifyCredit(guestID, creditNum);
	}

	@Override
	public ResultMessage getLogInInfo(String userID, UserType userType) {
		return user.getLogInInfo(userID, userType);
	}

}
