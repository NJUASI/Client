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
				
		assertEquals(hotelPO.getHotelID(), "12345678");
		assertEquals(hotelPO.getHotelName(), "thisHotel");
		assertEquals(hotelPO.getHotelAddress(), "address");
		assertEquals(hotelPO.getCity(), "NanJing");
		assertEquals(hotelPO.getLevel(), "4");
		assertEquals(hotelPO.getScore(), 5, 0);
		assertEquals(hotelPO.getComment(), 5);
		assertEquals(hotelPO.getIntroduction(), "good");
		assertEquals(hotelPO.getEquipment(), "allEquipment");
	}
	
	@Test
	public void test2() {
		//test interface Evaluation
		HotelDataService_Stub stub = new HotelDataService_Stub();
		HotelDataService_Driver driver = new HotelDataService_Driver(stub);
		RoomInfoPO remainRoomInfoPO = driver.hotelDataService.getRemainRoomInfo("12345678");
		
		assertEquals(remainRoomInfoPO.getRoomType(), RoomType.AMBASSADOR);
		assertEquals(remainRoomInfoPO.getRoomNum(),2);
		assertEquals(remainRoomInfoPO.getPrice(), 200);
	}
	
}

