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
		
		assertEquals(hotelPromotionPO.getHotelID(), "12345678");
		assertEquals(hotelPromotionPO.getStartDate(), LocalDate.of(2016, 2, 2));		
		assertEquals(hotelPromotionPO.getEndDate(), LocalDate.of(2016, 3, 9));		
	}
	
	@Test
	public void test2() {
		//test interface getWebPromotions
		PromotionDataService_Stub stub = new PromotionDataService_Stub();
		PromotionDataService_Driver driver = new PromotionDataService_Driver(stub);
		WebPromotionPO webPromotionPO =driver.promotionDataService.getWebPromotions("123456").get(0);
		
		assertEquals(webPromotionPO.getCycle(), "ALL_CYCLE");
		assertEquals(webPromotionPO.getStartDate(), LocalDate.of(2016, 2, 2));		
		assertEquals(webPromotionPO.getEndDate(), LocalDate.of(2016, 3, 9));		
	}

}
