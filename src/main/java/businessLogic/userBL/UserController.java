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

	public ResultMessage add(UserVO newUserVO) {
		// TODO Auto-generated method stub
		return user.add(newUserVO);
	}

	public ResultMessage modify(UserVO userVO) {
		// TODO Auto-generated method stub
		return user.modify(userVO);
	}

	public UserVO getSingle(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return user.getSingle(userID, userType);
	}

	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {
		// TODO Auto-generated method stub
		return user.addHotel(newHotelVO, hotelID);
	}

	public ResultMessage modifyCredit(String guestID, float creditNum) {
		// TODO Auto-generated method stub
		return user.modifyCredit(guestID, creditNum);
	}

	public List<UserVO> getAll(UserType userType) {
		// TODO Auto-generated method stub
		return user.getAll(userType);
	}

	public List<CreditVO> getAllCreditDetail(String guestID) {
		// TODO Auto-generated method stub
		return user.getAllCreditDetail(guestID);
	}

	public String getLogInInfo(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return user.getLogInInfo(userID, userType);
	}
	

}