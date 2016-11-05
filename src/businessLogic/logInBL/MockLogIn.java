package businessLogic.logInBL;

import utilities.ResultMessage;
import vo.GuestVO;

public class MockLogIn extends LogIn {
	
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
