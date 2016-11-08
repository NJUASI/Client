package businessLogic.userBL.driver;

import static org.junit.Assert.*;

import org.junit.Test;

import dataService.guestDataService.GuestDataService_Stub;
import po.GuestPO;
import utilities.ResultMessage;

public class GuestDataService_DriverTest {

	@Test
	public void test1() {
		//test interface getSingle
		GuestDataService_Stub stub = new GuestDataService_Stub();
		GuestDataService_Driver driver = new GuestDataService_Driver(stub);
		GuestPO guestPO = driver.guestDataService.getSingle("1234567890");
		
		assertEquals(guestPO.getGuestID(), "1234567890");
		assertEquals(guestPO.getBirthday(), "2016/2/2");
		assertEquals(guestPO.getEnterprise(), "school");
		assertEquals(guestPO.getName(), "zhangsan");
		assertEquals(guestPO.getNickName(), "xiaosan");
		assertEquals(guestPO.getPassword(), "000000");
		assertEquals(guestPO.getPhone(), "13523456789");
		assertEquals(guestPO.getCredit(), "100");
	}

	@Test
	public void test2() {
		//test interface add
		GuestDataService_Stub stub = new GuestDataService_Stub();
		GuestDataService_Driver driver = new GuestDataService_Driver(stub);
		
		assertEquals(driver.guestDataService.add(new GuestPO("1234567890", "2016/2/2", "school", "zhangsan", "xiaosan",
				"000000", "13523456789",100)), ResultMessage.SUCCESS);
	}
}
