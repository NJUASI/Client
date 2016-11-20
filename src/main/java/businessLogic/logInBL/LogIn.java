package businessLogic.logInBL;

import businessLogic.userBL.User;
import utilities.ResultMessage;
import utilities.UserType;
import vo.GuestVO;

public class LogIn {

	private User user;
	
	public LogIn() {
		user = new User();
	}
	
	public ResultMessage guestLogIn(String guest, String password) {
		if(password==user.getLogInInfo( guest, UserType.GUEST)){
			return ResultMessage.SUCCESS;
		}else{
			return ResultMessage.FAIL;
		}
	}

	public ResultMessage hotelWorkerLogIn(String hotelWorker, String password) {
		if(password==user.getLogInInfo( hotelWorker, UserType.HOTEL_WORKER)){
			return ResultMessage.SUCCESS;
		}else{
			return ResultMessage.FAIL;
		}
	}

	public ResultMessage webMarketerLogIn(String webMarketer, String password) {
		if(password==user.getLogInInfo(  webMarketer, UserType.WEB_MARKETER)){
			return ResultMessage.SUCCESS;
		}else{
			return ResultMessage.FAIL;
		}
	}

	public ResultMessage webManagerLogIn(String webManager, String password) {
		if(password==user.getLogInInfo(webManager, UserType.WEB_MANAGER)){
			return ResultMessage.SUCCESS;
		}else{
			return ResultMessage.FAIL;
		}
	}

	public ResultMessage guestSignUp(GuestVO guestVO) {
		return user.add(guestVO);
	}

}
