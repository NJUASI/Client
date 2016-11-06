package businessLogic.logInBL;

import businessLogic.userBL.MockUser;
import businessLogic.userBL.User;
import utilities.ResultMessage;
import vo.GuestVO;

public class MockLogIn extends LogIn {
	
	private User user;
	
	public MockLogIn() {
		user = new MockUser();
	}
	
	public ResultMessage guestLogIn(String guest, String password) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage hotelWorkerLogIn(String hotelWorker, String password) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage webMarketerLogIn(String webMarketer, String password) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage webManagerLogIn(String webManager, String password) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage guestSignUp(GuestVO guestVO) {
		return ResultMessage.SUCCESS;
	}

}
