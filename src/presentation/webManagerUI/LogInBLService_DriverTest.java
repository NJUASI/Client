package presentation.webManagerUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.logInBL.stub.LogInBLService_Stub;
import utilities.ResultMessage;

public class LogInBLService_DriverTest {

	@Test
	public void test1() {
		LogInBLService_Stub stub = new LogInBLService_Stub("1234567890","000000");
		LogInBLService_Driver driver = new LogInBLService_Driver(stub);
		assertEquals(driver.logInBLService.webManagerLogIn("1234567890","000000"), ResultMessage.SUCCESS);
	}

}
