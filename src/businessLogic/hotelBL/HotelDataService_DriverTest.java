package businessLogic.hotelBL;

import static org.junit.Assert.*;


import org.junit.Test;

import dataService.hotelDataService.HotelDataService_Stub;
import po.HotelPO;
import po.RemainRoomInfoPO;
import utilities.RoomType;

public class HotelDataService_DriverTest {

	

	@Test
	public void test1() {
		//test interface getHotelDetail
		HotelDataService_Stub stub = new HotelDataService_Stub();
		HotelDataService_Driver driver = new HotelDataService_Driver(stub);
		HotelPO hotelPO = driver.hotelDataService.getHotelDetail("000000");
				
		assertEquals(hotelPO.getHotelID(), "00001111");
		assertEquals(hotelPO.getHotelName(), "thisHotel");
		assertEquals(hotelPO.getHotelAddress(), "Nanjing, China");
		assertEquals(hotelPO.getCity(), "Nanjing");
		assertEquals(hotelPO.getLevel(), "4");
		assertEquals(hotelPO.getScore(), 8);
		assertEquals(hotelPO.getIntroduction(), "Very good");
		assertEquals(hotelPO.getEquipment(), "All eqipment");
	}
	
	@Test
	public void test2() {
		//test interface Evaluation
		HotelDataService_Stub stub = new HotelDataService_Stub();
		HotelDataService_Driver driver = new HotelDataService_Driver(stub);
		RemainRoomInfoPO remainRoomInfoPO = driver.hotelDataService.getRemainRoomInfo("");
		
		assertEquals(remainRoomInfoPO.getRoomType(), RoomType.AMBASSADOR);
		assertEquals(remainRoomInfoPO.getRoomNum(),0);
		assertEquals(remainRoomInfoPO.getPrice(), 0);
	}
		
	}

