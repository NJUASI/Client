package businessLogic.promotionBL.driver;

import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;
import java.time.LocalDate;

import org.junit.Test;

import dataService.promotionDataService.PromotionDataService_Stub;
import po.SpecialSpanPromotionPO;

public class PromotionDataService_DriverTest {

	@Test
	public void test1() {
		//test interface getHotelPromotions
		PromotionDataService_Stub stub = new PromotionDataService_Stub();
		PromotionDataService_Driver driver = new PromotionDataService_Driver(stub);
		SpecialSpanPromotionPO specialSpanPromotionPO;
		try {
			specialSpanPromotionPO = driver.promotionDataService.getSpecialSpanPromotion("12345678").get(0);
			assertEquals("12345678", specialSpanPromotionPO.getUserID());
			assertEquals(LocalDate.of(2016, 2, 2), specialSpanPromotionPO.getStartDay());		
			assertEquals(LocalDate.of(2016, 3, 9), specialSpanPromotionPO.getEndDay());	} catch (RemoteException e) {
			e.printStackTrace();
		}
		
			
	}
			
}
