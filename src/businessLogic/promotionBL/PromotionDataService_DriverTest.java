package businessLogic.promotionBL;

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
		PromotionPO promotionPO =driver.promotionDataService.getPromotions("").get(0);
		
		assertEquals(promotionPO.getHotelID(), "");
		assertEquals(promotionPO.getEndDate(), "");
		assertEquals(promotionPO.getStartDate(), "");
		
	}
	
	

}
