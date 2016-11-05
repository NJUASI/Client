package businessLogic.promotionBL.driver;

import static org.junit.Assert.*;


import org.junit.Test;

import dataService.promotionDataService.PromotionDataService_Stub;
import po.PromotionPO;

public class PromotionDataService_DriverTest {

	@Test
	public void test1() {
		//test interface Evaluation
		PromotionDataService_Stub stub = new PromotionDataService_Stub();
		PromotionDataService_Driver driver = new PromotionDataService_Driver(stub);
		PromotionPO promotionPO =driver.promotionDataService.getPromotions("1234567890").get(0);
		
		assertEquals(promotionPO.getHotelID(), "12345678");
		assertEquals(promotionPO.getEndDate(), "2016/3/9");
		assertEquals(promotionPO.getStartDate(), "2016/2/2");
		
	}
	
	

}
