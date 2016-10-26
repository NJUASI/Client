package presentation.guestUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.userBL.UserBLService_Stub;
import utilities.ResultMessage;
import utilities.UserType;
import vo.UserVO;

public class UserBLService_DriverTest {

	@Test
	public void test1() {
		// test interface getSingle
		UserBLService_Stub stub = new UserBLService_Stub();
		UserBLService_Driver driver = new UserBLService_Driver(stub);
		assertEquals(driver.userBLService.getSingle("1234567890", UserType.GUEST), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		// test interface getSingle
		UserBLService_Stub stub = new UserBLService_Stub();
		UserBLService_Driver driver = new UserBLService_Driver(stub);
		assertEquals(driver.userBLService.modify(new UserVO("1234567890", "000000")), ResultMessage.SUCCESS);
	}
}
