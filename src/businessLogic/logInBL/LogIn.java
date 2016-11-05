package businessLogic.logInBL;

import businessLogic.userBL.User;
import utilities.ResultMessage;
import vo.GuestVO;

public class LogIn {

	private User user;
	
	public LogIn() {
		user = new User();
	}
	
	public ResultMessage guestLogIn(String guest, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage hotelWorkerLogIn(String hotelWorker, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage webMarketerLogIn(String webMarketer, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage webManagerLogIn(String webManager, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage guestSignUp(GuestVO guestVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
