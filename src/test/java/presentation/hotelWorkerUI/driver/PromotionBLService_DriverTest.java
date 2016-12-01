package presentation.hotelWorkerUI.driver;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import businessLogic.promotionBL.stub.PromotionBLService_Stub;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.SpecialSpanPromotionVO;

public class PromotionBLService_DriverTest {

	@Test
	public void test1() {
		//test interface getHotelPromotions
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		Iterator<SpecialSpanPromotionVO> list = driver.promotionBLService.getSpecialSpanPromotions("12345678");

		SpecialSpanPromotionVO promotionVO1=list.next();
		SpecialSpanPromotionVO promotionVO2=list.next();
		
		assertEquals(PromotionType.HOTEL_HOLIDAY, promotionVO1.promotionType);
		assertEquals(0.9, promotionVO1.discount,0);
		assertEquals("12345678", promotionVO1.userID);
		assertEquals(LocalDate.of(2016, 11, 1), promotionVO1.startDay);
		assertEquals(LocalDate.of(2016, 11, 15), promotionVO1.endDay);
		
		assertEquals(PromotionType.HOTEL__ENTERPRISE, promotionVO2.promotionType);
		assertEquals(0.95, promotionVO2.discount,0);
		assertEquals("12345678", promotionVO2.userID);
		assertEquals(LocalDate.of(2016, 7, 1), promotionVO2.startDay);
		assertEquals(LocalDate.of(2016, 12, 31), promotionVO2.endDay);

	}

}
