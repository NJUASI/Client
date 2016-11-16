package businessLogic.userBL.driver;

import static org.junit.Assert.*;

import org.junit.Test;

import dataService.webManagerDataService.WebManagerDataService_Stub;
import po.WebManagerPO;
import utilities.ResultMessage;

public class WebManagerDataService_DriveTest {

	@Test
	public void test1() {
		//test interface getSingle
		WebManagerDataService_Stub stub = new WebManagerDataService_Stub();
		WebManagerDataService_Driver driver = new WebManagerDataService_Driver(stub);
		
		assertEquals(ResultMessage.SUCCESS, driver.webManagerDataService.add(new WebManagerPO("0001", "123456")));
	}
	
	@Test
	public void test2() {
		//test interface getSingle
		WebManagerDataService_Stub stub = new WebManagerDataService_Stub();
		WebManagerDataService_Driver driver = new WebManagerDataService_Driver(stub);
		WebManagerPO webManagerPO = driver.webManagerDataService.getSingle("0001");
		
		assertEquals("123456", webManagerPO.getPassword());
	}

}
