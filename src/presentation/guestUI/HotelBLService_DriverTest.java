package presentation.guestUI;

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
		HotelBLService_Stub stub = new HotelBLService_Stub("", "", "", "", "", "", "", "", "");
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		HotelGeneralVO hotelGeneralVO = driver.hotelBLService.getHotelList(new AddressVO("", "", "", "")).get(0);
		
		assertEquals(hotelGeneralVO.getHotelName(), "thisHotel");
		assertEquals(hotelGeneralVO.getCity(), "Nanjing");
		assertEquals(hotelGeneralVO.getCycle(), "Xinjiekou");
		assertEquals(hotelGeneralVO.getLevel(), "4");
		assertEquals(hotelGeneralVO.getScore(), 8);
	}

	@Test
	public void test2() {
		//test interface getHotelDetail
		HotelBLService_Stub stub = new HotelBLService_Stub("", "", "", "", "", "", "", "", "");
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		HotelVO hotelVO = driver.hotelBLService.getHotelDetail("000000");
				
		assertEquals(hotelVO.getHotelID(), "00001111");
		assertEquals(hotelVO.getHotelName(), "thisHotel");
		assertEquals(hotelVO.getHotelAddress(), "Nanjing, China");
		assertEquals(hotelVO.getCity(), "Nanjing");
		assertEquals(hotelVO.getCycle(), "xinjiekou");
		assertEquals(hotelVO.getLevel(), "4");
		assertEquals(hotelVO.getScore(), 8);
		assertEquals(hotelVO.getIntroduction(), "Very good");
		assertEquals(hotelVO.getEquipment(), "All eqipment");
	}
	
	@Test
	public void test3() {
		//test interface Evaluation
		HotelBLService_Stub stub = new HotelBLService_Stub("", "", "", "", "", "", "", "", "");
		HotelBLService_Driver driver = new HotelBLService_Driver(stub);
		
		assertEquals(driver.hotelBLService.updateEvaluation(new EvaluationVO(4, "")), ResultMessage.SUCCESS);
	}
	
	
}
