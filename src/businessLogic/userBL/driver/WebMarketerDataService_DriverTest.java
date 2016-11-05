package businessLogic.userBL.driver;

import static org.junit.Assert.*;

import org.junit.Test;

import dataService.webMarketerDataService.WebMarketerDataService_Stub;
import po.WebMarketerPO;
import utilities.ResultMessage;

public class WebMarketerDataService_DriverTest {

	@Test
	public void test1() {
			//test interface getSingle
		WebMarketerDataService_Stub stub = new WebMarketerDataService_Stub();
		WebMarketerDataService_Driver driver = new WebMarketerDataService_Driver(stub);
			
			assertEquals(driver.webMarketerDataService.add(new WebMarketerPO("000001", "123456")),ResultMessage.SUCCESS);
	}
	
	@Test
	public void test2() {
		//test interface getSingle
		WebMarketerDataService_Stub stub = new WebMarketerDataService_Stub();
		WebMarketerDataService_Driver driver = new WebMarketerDataService_Driver(stub);
		WebMarketerPO webMarketerPO = driver.webMarketerDataService.getSingle("000001");
		
		assertEquals(webMarketerPO.getUserID(), "000001");
		assertEquals(webMarketerPO.getPassword(), "123456");
	}


}
