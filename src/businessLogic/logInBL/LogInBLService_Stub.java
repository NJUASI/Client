package businessLogic.logInBL;

import businessLogicService.logInBLService.LogInBLService;
import vo.GuestVO;

public class LogInBLService_Stub implements LogInBLService{

	String guest;
	String hotelWorker;
	String webMarketer;
	String webManager;
	String password;
	
	public LogInBLService_Stub(String ID, String password) {
		this.guest = ID;
		this.password = password;
	}
	
	@Override
	public boolean guestLogIn(String guest, String password) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean hotelWorkerLogIn(String hotelWorker, String password) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean webMarketerLogIn(String webMarketer, String password) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean webManagerLogIn(String webManager, String password) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean guestSignUp(GuestVO guestVO) {
		return true;
	}

}
