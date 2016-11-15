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
	
	public ResultMessage guestLogIn(String guest, String password) {
		return logIn.guestLogIn(guest, password);
	}

	public ResultMessage hotelWorkerLogIn(String hotelWorker, String password) {
		return logIn.hotelWorkerLogIn(hotelWorker, password);
	}

	public ResultMessage webMarketerLogIn(String webMarketer, String password) {
		return logIn.webManagerLogIn(webMarketer, password);
	}

	public ResultMessage webManagerLogIn(String webManager, String password) {
		return logIn.webManagerLogIn(webManager, password);
	}

	public ResultMessage guestSignUp(GuestVO guestVO) {
		return logIn.guestSignUp(guestVO);
	}

}
