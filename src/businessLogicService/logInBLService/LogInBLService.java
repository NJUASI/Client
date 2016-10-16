package businessLogicService.logInBLService;

import vo.GuestVO;

public interface LogInBLService {

	public boolean guestLogIn (String guest, String password);
	public boolean hotelWorkerLogIn (String hotelWorker, String password);
	public boolean webMarketerLogIn (String webMarketer, String password);
	public boolean webManagerLogIn (String webManager, String password);
	public boolean guestSignUp (GuestVO guestVO);
}
