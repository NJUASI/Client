package presentation.webManagerUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.userBL.UserBLService_Stub;
import utilities.ResultMessage;
import utilities.UserType;
import vo.UserVO;

public class UserBLService_DriverTest {

	@Test
	public void test1() {
	UserBLService_Stub stub = new UserBLService_Stub();
	UserBLService_Driver driver = new UserBLService_Driver(stub);
	assertEquals(driver.userBLService.getSingle("",UserType.GUEST), ResultMessage.SUCCESS);
	}
	
	@Test
	public void test2() {
	UserBLService_Stub stub = new UserBLService_Stub();
	UserBLService_Driver driver = new UserBLService_Driver(stub);
	assertEquals(driver.userBLService.modify(new UserVO("","")), ResultMessage.SUCCESS);
	}
	
	@Test
	public void test3() {
	UserBLService_Stub stub = new UserBLService_Stub();
	UserBLService_Driver driver = new UserBLService_Driver(stub);
	assertEquals(driver.userBLService.getLoginInfo("", UserType.GUEST), ResultMessage.SUCCESS);
	}

}
