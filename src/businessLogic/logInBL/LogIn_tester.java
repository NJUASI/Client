package businessLogic.logInBL;

import static org.junit.Assert.*;

import org.junit.Test;

import utilities.ResultMessage;
import vo.GuestVO;

public class LogIn_tester {

	@Test
	public void test1() {
		//test method guestLogIn(String guest, String password)
		LogInController controller = LogInController.getInstance();
			
	assertEquals(controller.guestLogIn("1234567890", "000000") , ResultMessage.SUCCESS);
	}
	
	@Test
	public void test2() {
		//test method hotelWorkerLogIn(String hotelWorker, String password)
		LogInController controller = LogInController.getInstance();
			
	assertEquals(controller.hotelWorkerLogIn("12345678", "000000") , ResultMessage.SUCCESS);
	}
	
	@Test
	public void test3() {
		//test method webMarketerLogIn(String webMarketer, String password)
		LogInController controller = LogInController.getInstance();
			
	assertEquals(controller.hotelWorkerLogIn("123456", "000000") , ResultMessage.SUCCESS);
	}
	
	@Test
	public void test4() {
		//test method webManagerLogIn(String webManager, String password)
		LogInController controller = LogInController.getInstance();
			
	assertEquals(controller.hotelWorkerLogIn("1234", "000000") , ResultMessage.SUCCESS);
	}
	
	@Test
	public void test5() {
		//test method guestSignUp(GuestVO guestVO)
		LogInController controller = LogInController.getInstance();
		GuestVO guestVO = new GuestVO("1234567890", "2016/2/2", "school", "zhangsan", "xiaosan",
				"000000", "13523456789","100");
			
	assertEquals(controller.guestSignUp(guestVO) , ResultMessage.SUCCESS);
	}

}
