package presentation.guestUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.logInBL.LogInBLService_Stub;
import utilities.ResultMessage;
import vo.GuestVO;

public class LogInBLService_DriverTest {

	@Test
	public void test1() {
		//test interface guestLogIn
		LogInBLService_Stub stub = new LogInBLService_Stub("aa", "123456");
		LogInBLService_Driver driver = new LogInBLService_Driver(stub);
		assertEquals(driver.logInBLService.guestLogIn("aa", "123456"), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		//test interface guestSignUp
		LogInBLService_Stub stub = new LogInBLService_Stub("aa", "123456");
		LogInBLService_Driver driver = new LogInBLService_Driver(stub);
		assertEquals(driver.logInBLService.guestSignUp(new GuestVO
				("", "", "", "", "", "", "", "", "")), ResultMessage.SUCCESS);
	}
}
