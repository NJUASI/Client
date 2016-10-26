package presentation.signUpUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.logInBL.LogInBLService_Stub;
import utilities.ResultMessage;
import vo.GuestVO;

public class LogInBLService_DriverTest {

	@Test
	public void test1() {
		//test interface guestSignUp
		LogInBLService_Stub stub = new LogInBLService_Stub("1234567890","000000");
		LogInBLService_Driver driver = new LogInBLService_Driver(stub);
		assertEquals(driver.logInBLService.guestSignUp(new GuestVO
				("1234567890", "2016/2/2", "school","zhangsan", "xiaosan",
						"000000", "13568792345", "100")), ResultMessage.SUCCESS);
	}
}
