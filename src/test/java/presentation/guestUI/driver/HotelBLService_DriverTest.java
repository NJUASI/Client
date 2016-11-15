package presentation.guestUI.driver;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.hotelBL.stub.HotelBLService_Stub;
import utilities.ResultMessage;
import vo.AddressVO;
import vo.EvaluationVO;
import vo.HotelGeneralVO;
import vo.HotelVO;

public class HotelBLService_DriverTest {

	@Test
	public void test1() {
		//test interface getHotelList
		HotelBLService_Stub stub = new HotelBLService_Stub();
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		HotelGeneralVO hotelGeneralVO1 = driver.hotelBLService.getHotelList(new AddressVO
				("NanJing", "center")).get(0);
		HotelGeneralVO hotelGeneralVO2 = driver.hotelBLService.getHotelList(new AddressVO
				("NanJing", "center")).get(1);
		
		assertEquals("thisHotel", hotelGeneralVO1.hotelName);
		assertEquals("NanJing", hotelGeneralVO1.city);
		assertEquals("center", hotelGeneralVO1.cycle);
		assertEquals("4", hotelGeneralVO1.level);
		assertEquals(5, hotelGeneralVO1.score, 0);
		
		assertEquals("thatHotel", hotelGeneralVO2.hotelName);
		assertEquals("NanJing", hotelGeneralVO2.city);
		assertEquals("center", hotelGeneralVO2.cycle);
		assertEquals("3", hotelGeneralVO2.level);
		assertEquals(5, hotelGeneralVO2.score, 0);
	}

	@Test
	public void test2() {
		//test interface getHotelDetail
		HotelBLService_Stub stub = new HotelBLService_Stub();
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		HotelVO hotelVO = driver.hotelBLService.getHotelDetail("12345678");
				
		assertEquals("12345678", hotelVO.hotelGeneralVO.hotelID);
		assertEquals("thisHotel", hotelVO.hotelGeneralVO.hotelName);
		assertEquals("address", hotelVO.hotelAddress);
		assertEquals("NanJing", hotelVO.hotelGeneralVO.city);
		assertEquals("center", hotelVO.hotelGeneralVO.cycle);
		assertEquals("4", hotelVO.hotelGeneralVO.level);
		assertEquals(5, hotelVO.hotelGeneralVO.score, 0);
		assertEquals("good", hotelVO.introduction);
		assertEquals("allEquipment", hotelVO.equipment);
	}
	
	@Test
	public void test3() {
		//test interface Evaluation
		HotelBLService_Stub stub = new HotelBLService_Stub();
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		
		assertEquals(ResultMessage.SUCCESS, driver.hotelBLService.updateEvaluation(new EvaluationVO(4, "5")));
	}
}
