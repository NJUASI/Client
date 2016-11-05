package businessLogic.logInBL;

import businessLogicService.logInBLService.LogInBLService;
import utilities.ResultMessage;
import vo.GuestVO;

public class LogInController implements LogInBLService{

	
	private LogIn logIn;
	private static LogInController logInController;
	
	private LogInController() {
		//new the mock object
		logIn = new MockLogIn();
	}
	
	public static LogInController getInstance() {
		if (logInController == null) logInController = new LogInController();
		return logInController;
	}
	
	@Override
	public ResultMessage guestLogIn(String guest, String password) {
		// TODO Auto-generated method stub
		return logIn.guestLogIn(guest, password);
	}

	@Override
	public ResultMessage hotelWorkerLogIn(String hotelWorker, String password) {
		// TODO Auto-generated method stub
		return logIn.hotelWorkerLogIn(hotelWorker, password);
	}

	@Override
	public ResultMessage webMarketerLogIn(String webMarketer, String password) {
		// TODO Auto-generated method stub
		return logIn.webManagerLogIn(webMarketer, password);
	}

	@Override
	public ResultMessage webManagerLogIn(String webManager, String password) {
		// TODO Auto-generated method stub
		return logIn.webManagerLogIn(webManager, password);
	}

	@Override
	public ResultMessage guestSignUp(GuestVO guestVO) {
		// TODO Auto-generated method stub
		return logIn.guestSignUp(guestVO);
	}

}
