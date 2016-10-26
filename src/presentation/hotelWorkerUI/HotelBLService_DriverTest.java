package presentation.hotelWorkerUI;

import static org.junit.Assert.*;


import org.junit.Test;

import businessLogic.hotelBL.HotelBLService_Stub;
import utilities.ResultMessage;
import vo.AddressVO;
import vo.EvaluationVO;
import vo.HotelGeneralVO;
import vo.HotelVO;

public class HotelBLService_DriverTest {

	@Test
	public void test1() {
		//test interface getHotelList
		HotelBLService_Stub stub = new HotelBLService_Stub("12345678", "thisHotel", "NanJing","center", "address", "4",
				5, 5, "good","allEquipment");
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		HotelGeneralVO hotelGeneralVO = driver.hotelBLService.getHotelList(new AddressVO("thisHotel", "address", "NanJing", "center")).get(0);
		
		assertEquals(hotelGeneralVO.getHotelName(), "thisHotel");
		assertEquals(hotelGeneralVO.getCity(), "NanJing");
		assertEquals(hotelGeneralVO.getCycle(), "center");
		assertEquals(hotelGeneralVO.getLevel(), "4");
		assertEquals(hotelGeneralVO.getScore(), 5);
	}

	@Test
	public void test2() {
		//test interface getHotelDetail
		HotelBLService_Stub stub = new HotelBLService_Stub("12345678", "thisHotel", "NanJing","center", "address", "4",
				5, 5, "good","allEquipment");
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		HotelVO hotelVO = driver.hotelBLService.getHotelDetail("12345678");
				
		assertEquals(hotelVO.getHotelID(), "12345678");
		assertEquals(hotelVO.getHotelName(), "thisHotel");
		assertEquals(hotelVO.getHotelAddress(), "address");
		assertEquals(hotelVO.getCity(), "NanJing");
		assertEquals(hotelVO.getCycle(), "center");
		assertEquals(hotelVO.getLevel(), "4");
		assertEquals(hotelVO.getScore(), 5);
		assertEquals(hotelVO.getIntroduction(), "good");
		assertEquals(hotelVO.getEquipment(), "allEqipment");
	}
	
	@Test
	public void test3() {
		//test interface Evaluation
		HotelBLService_Stub stub = new HotelBLService_Stub("12345678", "thisHotel", "NanJing","center", "address", "4",
				5, 5, "good","allEquipment");
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		
		assertEquals(driver.hotelBLService.updateEvaluation(new EvaluationVO(4, "5")), ResultMessage.SUCCESS);
	}
}
