package businessLogic.logInBL.stub;

import businessLogicService.logInBLService.LogInBLService;
import utilities.ResultMessage;
import vo.GuestVO;

public class LogInBLService_Stub implements LogInBLService{

//	String guest;
//	String hotelWorker;
//	String webMarketer;
//	String webManager;
//	String password;
//	
//	public LogInBLService_Stub(String ID, String password) {
//		this.guest = ID;
//		this.password = password;
//	}
	
	
	public ResultMessage guestLogIn(String guest, String password) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage hotelWorkerLogIn(String hotelWorker, String password) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage webMarketerLogIn(String webMarketer, String password) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage webManagerLogIn(String webManager, String password) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage guestSignUp(GuestVO guestVO) {
		return ResultMessage.SUCCESS;
	}

}
