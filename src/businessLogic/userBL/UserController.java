package businessLogic.userBL;

import java.util.List;

import businessLogicService.userBLService.UserBLService;
import utilities.ResultMessage;
import utilities.UserType;
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
		// TODO Auto-generated method stub
		return user.getAll(userType);
	}

	@Override
	public UserVO getSingle(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return user.getSingle(userID, userType);
	}

	@Override
	public ResultMessage add(UserVO newUserVO) {
		// TODO Auto-generated method stub
		return user.add(newUserVO);
	}

	@Override
	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {
		// TODO Auto-generated method stub
		return user.addHotel(newHotelVO, hotelID);
	}

	@Override
	public ResultMessage modify(UserVO userVO) {
		// TODO Auto-generated method stub
		return user.modify(userVO);
	}

	@Override
	public ResultMessage modifyCredit(float creditNum) {
		// TODO Auto-generated method stub
		return user.modifyCredit(creditNum);
	}

	@Override
	public ResultMessage getLoginInfo(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return user.getLoginInfo(userID, userType);
	}

}
