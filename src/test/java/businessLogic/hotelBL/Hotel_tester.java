package businessLogic.hotelBL;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import vo.HotelGeneralVO;

public class Hotel_tester {
	
	@Test
	public void test1() {
		//test cooperation with class Order
		//test interface getBookedHotels
		HotelController hotelController = HotelController.getInstance();
		List<HotelGeneralVO> list = hotelController.getBookedHotels("1234567890");
		HotelGeneralVO hotelGeneralVO1=list.get(0);
		HotelGeneralVO hotelGeneralVO2=list.get(1);
		
		assertEquals("12345678", hotelGeneralVO1.hotelID);
		assertEquals("thisHotel", hotelGeneralVO1.hotelName);
		assertEquals("NanJing", hotelGeneralVO1.city);
		assertEquals("center", hotelGeneralVO1.cycle);
		assertEquals("4", hotelGeneralVO1.level);
		assertEquals(5, hotelGeneralVO1.score, 0);
		
		assertEquals("12345679", hotelGeneralVO2.hotelID);
		assertEquals("thatHotel", hotelGeneralVO2.hotelName);
		assertEquals("NanJing", hotelGeneralVO2.city);
		assertEquals("center", hotelGeneralVO2.cycle);
		assertEquals("4", hotelGeneralVO2.level);
		assertEquals(5, hotelGeneralVO2.score, 0);
	}
	
}
