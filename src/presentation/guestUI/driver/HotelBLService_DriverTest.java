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
		HotelGeneralVO hotelGeneralVO = driver.hotelBLService.getHotelList(new AddressVO("thisHotel", "address", "NanJing", "center")).get(0);
		
		assertEquals("thisHotel", hotelGeneralVO.hotelName);
		assertEquals("NanJing", hotelGeneralVO.city);
		assertEquals("center", hotelGeneralVO.cycle);
		assertEquals("4", hotelGeneralVO.level);
		assertEquals(5, hotelGeneralVO.score, 0);
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
