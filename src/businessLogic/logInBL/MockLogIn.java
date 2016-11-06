package businessLogic.logInBL;

import businessLogic.userBL.MockUser;
import businessLogic.userBL.User;
import utilities.ResultMessage;
import utilities.UserType;
import vo.GuestVO;

public class MockLogIn extends LogIn {
	
	private User user;
	
	public MockLogIn() {
		user = new MockUser();
	}
	
	public ResultMessage guestLogIn(String guest, String password) {
		String realPassword = user.getLogInInfo(guest, UserType.GUEST);
		if (realPassword.equals(password)) return ResultMessage.SUCCESS;
		else return ResultMessage.FAIL;
	}

	public ResultMessage hotelWorkerLogIn(String hotelWorker, String password) {
		String realPassword = user.getLogInInfo(hotelWorker, UserType.HOTELWORKER);
		if (realPassword.equals(password)) return ResultMessage.SUCCESS;
		else return ResultMessage.FAIL;
	}

	public ResultMessage webMarketerLogIn(String webMarketer, String password) {
		String realPassword = user.getLogInInfo(webMarketer, UserType.WEBMARKET);
		if (realPassword.equals(password)) return ResultMessage.SUCCESS;
		else return ResultMessage.FAIL;
	}

	public ResultMessage webManagerLogIn(String webManager, String password) {
		String realPassword = user.getLogInInfo(webManager, UserType.WEBMANAGER);
		if (realPassword.equals(password)) return ResultMessage.SUCCESS;
		else return ResultMessage.FAIL;
	}

	public ResultMessage guestSignUp(GuestVO guestVO) {
		return user.add(guestVO);
	}

}
