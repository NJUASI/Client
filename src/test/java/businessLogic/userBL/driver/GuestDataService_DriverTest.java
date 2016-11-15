package businessLogic.userBL.driver;

import static org.junit.Assert.*;

import java.time.LocalDate;

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
		
		assertEquals(LocalDate.of(1995, 1, 1), guestPO.getBirthday());
		assertEquals("school", guestPO.getEnterprise());
		assertEquals("zhangsan", guestPO.getName());
		assertEquals("xiaosan", guestPO.getNickName());
		assertEquals("000000", guestPO.getPassword());
		assertEquals("13523456789", guestPO.getPhone());
		assertEquals(100, guestPO.getCredit(), 0);
	}

	@Test
	public void test2() {
		//test interface add
		GuestDataService_Stub stub = new GuestDataService_Stub();
		GuestDataService_Driver driver = new GuestDataService_Driver(stub);
		
		assertEquals(ResultMessage.SUCCESS, driver.guestDataService.add(new GuestPO("1234567890", 
				LocalDate.of(1995, 1, 1), "school", "zhangsan", "xiaosan", "000000", "13523456789",100)));
	}
}