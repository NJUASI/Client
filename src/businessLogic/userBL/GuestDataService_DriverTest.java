package businessLogic.userBL;

import static org.junit.Assert.*;

import org.junit.Test;

import dataService.guestDataService.GuestDataService_Stub;
import po.GuestPO;
import utilities.ResultMessage;
import utilities.RoomType;

public class GuestDataService_DriverTest {

	@Test
	public void test1() {
		//test interface getSingle
		GuestDataService_Stub stub = new GuestDataService_Stub();
		GuestDataService_Driver driver = new GuestDataService_Driver(stub);
		GuestPO guestPO = driver.guestDataService.getSingle("0000000001");
		
		assertEquals(guestPO.getGuestID(), "0000000001");
		assertEquals(guestPO.getMemberLevel(), "L2");
		assertEquals(guestPO.getBirthday(), "1995/1/1");
		assertEquals(guestPO.getEnterprise(), "NJU");
		assertEquals(guestPO.getName(), "Charles");
		assertEquals(guestPO.getNickName(), "jfgaj");
		assertEquals(guestPO.getPassword(), "123456");
		assertEquals(guestPO.getPhone(), "13000001111");
		assertEquals(guestPO.getCredit(), "500");
	}

	@Test
	public void test2() {
		//test interface add
		GuestDataService_Stub stub = new GuestDataService_Stub();
		GuestDataService_Driver driver = new GuestDataService_Driver(stub);
		
		assertEquals(driver.guestDataService.add(new GuestPO("0000000001", "L2", "1995/1/1", "NJU", "Charles", "jfgaj", "123456", "13000001111", "500")), ResultMessage.SUCCESS);
	}
}
