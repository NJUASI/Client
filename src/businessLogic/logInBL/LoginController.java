package businessLogic.logInBL;

import businessLogicService.logInBLService.LogInBLService;
import utilities.ResultMessage;
import vo.GuestVO;

public class LoginController implements LogInBLService{

	@Override
	public ResultMessage guestLogIn(String guest, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage hotelWorkerLogIn(String hotelWorker, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage webMarketerLogIn(String webMarketer, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage webManagerLogIn(String webManager, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage guestSignUp(GuestVO guestVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
