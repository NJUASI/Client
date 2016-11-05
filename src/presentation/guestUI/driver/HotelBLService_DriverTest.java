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

//		Hotel stub = new Hotel("12345678", "thisHotel", "NanJing","center", "address", "4",
//				5, 5, "good","allEquipment");
		HotelBLService_Stub stub = new HotelBLService_Stub();
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		HotelGeneralVO hotelGeneralVO = driver.hotelBLService.getHotelList(new AddressVO("thisHotel", "address", "NanJing", "center")).get(0);
		
		assertEquals(hotelGeneralVO.hotelName, "thisHotel");
		assertEquals(hotelGeneralVO.city, "NanJing");
		assertEquals(hotelGeneralVO.cycle, "center");
		assertEquals(hotelGeneralVO.level, "4");
		assertEquals(hotelGeneralVO.score, 5, 0);
	}

	@Test
	public void test2() {
		//test interface getHotelDetail
		
//		Hotel stub = new Hotel("12345678", "thisHotel", "NanJing","center", "address", "4",
//				5, 5, "good","allEquipment");

		HotelBLService_Stub stub = new HotelBLService_Stub();
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		HotelVO hotelVO = driver.hotelBLService.getHotelDetail("000000");
				
		assertEquals(hotelVO.hotelID, "12345678");
		assertEquals(hotelVO.hotelName, "thisHotel");
		assertEquals(hotelVO.hotelAddress, "address");
		assertEquals(hotelVO.city, "NanJing");
		assertEquals(hotelVO.cycle, "center");
		assertEquals(hotelVO.level, "4");
		assertEquals(hotelVO.score, 5, 0);
		assertEquals(hotelVO.introduction, "good");
		assertEquals(hotelVO.equipment, "allEquipment");
	}
	
	@Test
	public void test3() {
		//test interface Evaluation
		
//		Hotel stub = new Hotel("12345678", "thisHotel", "NanJing","center", "address", "4",
//				5, 5, "good","allEquipment");
		
		HotelBLService_Stub stub = new HotelBLService_Stub();
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		
		assertEquals(driver.hotelBLService.updateEvaluation(new EvaluationVO(4, "5")), ResultMessage.SUCCESS);
	}
	
	
}
