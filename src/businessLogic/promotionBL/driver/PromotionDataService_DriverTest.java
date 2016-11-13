package businessLogic.promotionBL.driver;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import dataService.promotionDataService.PromotionDataService_Stub;
import po.HotelPromotionPO;
import po.WebPromotionPO;

public class PromotionDataService_DriverTest {

	@Test
	public void test1() {
		//test interface getHotelPromotions
		PromotionDataService_Stub stub = new PromotionDataService_Stub();
		PromotionDataService_Driver driver = new PromotionDataService_Driver(stub);
		HotelPromotionPO hotelPromotionPO =driver.promotionDataService.getHotelPromotions("12345678").get(0);
		
		assertEquals("12345678", hotelPromotionPO.getHotelID());
		assertEquals(LocalDate.of(2016, 2, 2), hotelPromotionPO.getStartDate());		
		assertEquals(LocalDate.of(2016, 3, 9), hotelPromotionPO.getEndDate());		
	}
	
	@Test
	public void test2() {
		//test interface getWebPromotions
		PromotionDataService_Stub stub = new PromotionDataService_Stub();
		PromotionDataService_Driver driver = new PromotionDataService_Driver(stub);
		WebPromotionPO webPromotionPO =driver.promotionDataService.getWebPromotions("123456").get(0);
		
		assertEquals("ALL_CYCLE", webPromotionPO.getCycle());
		assertEquals(LocalDate.of(2016, 2, 2), webPromotionPO.getStartDate());		
		assertEquals(LocalDate.of(2016, 3, 9), webPromotionPO.getEndDate());		
	}

}
