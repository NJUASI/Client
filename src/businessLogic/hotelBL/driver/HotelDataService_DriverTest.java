package businessLogic.hotelBL.driver;

import static org.junit.Assert.*;


import org.junit.Test;

import dataService.hotelDataService.HotelDataService_Stub;
import po.HotelPO;
import po.RoomInfoPO;
import utilities.RoomType;

public class HotelDataService_DriverTest {

	

	@Test
	public void test1() {
		//test interface getHotelDetail
		HotelDataService_Stub stub = new HotelDataService_Stub();
		HotelDataService_Driver driver = new HotelDataService_Driver(stub);
		HotelPO hotelPO = driver.hotelDataService.getHotelDetail("12345678");
				
		assertEquals("12345678", hotelPO.getHotelID());
		assertEquals("thisHotel", hotelPO.getHotelName());
		assertEquals("address", hotelPO.getHotelAddress());
		assertEquals("NanJing", hotelPO.getCity());
		assertEquals("4", hotelPO.getLevel());
		assertEquals(5, hotelPO.getScore(), 0);
		assertEquals("5", hotelPO.getComment());
		assertEquals("good", hotelPO.getIntroduction());
		assertEquals("allEquipment", hotelPO.getEquipment());
	}
	
	@Test
	public void test2() {
		//test interface Evaluation
		HotelDataService_Stub stub = new HotelDataService_Stub();
		HotelDataService_Driver driver = new HotelDataService_Driver(stub);
		RoomInfoPO remainRoomInfoPO = driver.hotelDataService.getRemainRoomInfo("12345678");
		
		assertEquals(RoomType.AMBASSADOR, remainRoomInfoPO.getRoomType());
		assertEquals(2, remainRoomInfoPO.getRoomNumCount());
		assertEquals(200, remainRoomInfoPO.getPrice(), 0);
	}
	
}

