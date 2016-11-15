package businessLogic.userBL.driver;

import static org.junit.Assert.*;

import org.junit.Test;

import dataService.hotelWorkerDataService.HotelWorkerDataService_Stub;
import po.HotelWorkerPO;
import utilities.ResultMessage;

public class HotelWorkerDataService_DriverTest {

	@Test
	public void test1() {
		//test interface getSingle
		HotelWorkerDataService_Stub stub = new HotelWorkerDataService_Stub();
		HotelWorkerDataService_Driver driver = new HotelWorkerDataService_Driver(stub);
		HotelWorkerPO hotelWorkerPO = driver.hotelWorkerDataService.getSingle("00001111");
		
		assertEquals("123456", hotelWorkerPO.getPassword());
	}

	@Test
	public void test2() {
		//test interface add
		HotelWorkerDataService_Stub stub = new HotelWorkerDataService_Stub();
		HotelWorkerDataService_Driver driver = new HotelWorkerDataService_Driver(stub);
		
		assertEquals(ResultMessage.SUCCESS, driver.hotelWorkerDataService.add(new HotelWorkerPO("00001111", "123456")));
	}

}