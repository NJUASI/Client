package presentation.hotelWorkerUI.driver;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import businessLogic.promotionBL.stub.PromotionBLService_Stub;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.HotelPromotionVO;

public class PromotionBLService_DriverTest {

	@Test
	public void test1() {
		//test interface getHotelPromotions
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		List<HotelPromotionVO> list = driver.promotionBLService.getHotelPromotions("12345678");

		HotelPromotionVO promotionVO1=list.get(0);
		HotelPromotionVO promotionVO2=list.get(1);
		
		assertEquals(PromotionType.HOTEL__HOLIDAY, promotionVO1.promotionType);
		assertEquals(0.9, promotionVO1.discount,0);
		assertEquals("12345678", promotionVO1.hotelID);
		assertEquals(LocalDate.of(2016, 11, 1), promotionVO1.startDate);
		assertEquals(LocalDate.of(2016, 11, 15), promotionVO1.endDate);
		
		assertEquals(PromotionType.HOTEL__ENTERPRISE, promotionVO2.promotionType);
		assertEquals(0.95, promotionVO2.discount,0);
		assertEquals("12345678", promotionVO2.hotelID);
		assertEquals(LocalDate.of(2016, 7, 1), promotionVO2.startDate);
		assertEquals(LocalDate.of(2016, 12, 31), promotionVO2.endDate);

	}

	@Test
	public void test2() {
		//test interface setHotelPromotions
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		ArrayList<HotelPromotionVO> list = new ArrayList<HotelPromotionVO>();
		list.add(new HotelPromotionVO(PromotionType.HOTEL__HOLIDAY, "12345678", 0.9, 
				LocalDate.of(2016, 11, 1), LocalDate.of(2016, 11, 15)));

		assertEquals(ResultMessage.SUCCESS, driver.promotionBLService.setHotelPromotions("12345678", list));
	}

}
