package presentation.webMarketerUI.driver;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import businessLogic.promotionBL.stub.PromotionBLService_Stub;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.WebPromotionVO;

public class PromotionBLService_DriverTest {

	@Test
	public void test1() {
		//test interface getWebPromotions
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		Iterator<WebPromotionVO> list = driver.promotionBLService.getWebPromotions();

		WebPromotionVO promotionVO1=list.next();
		WebPromotionVO promotionVO2=list.next();
		
		assertEquals(PromotionType.WEB_HOLIDAY, promotionVO1.promotionType);
		assertEquals(0.9, promotionVO1.discount,0);
		assertEquals("ALL_CYCLE", promotionVO1.cycle);
		assertEquals(LocalDate.of(2016, 11, 1), promotionVO1.startDate);
		assertEquals(LocalDate.of(2016, 11, 15), promotionVO1.endDate);
		
		assertEquals(PromotionType.WEB__VIP_APPOINTED_CYCLE, promotionVO2.promotionType);
		assertEquals(0.95, promotionVO2.discount,0);
		assertEquals("ALL_CYCLE", promotionVO2.cycle);
		assertEquals(LocalDate.of(2016, 7, 1), promotionVO2.startDate);
		assertEquals(LocalDate.of(2016, 12, 31), promotionVO2.endDate);

	}

	@Test
	public void test2() {
		//test interface setWebPromotions
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		ArrayList<WebPromotionVO> list = new ArrayList<WebPromotionVO>();
		list.add(new WebPromotionVO(PromotionType.WEB_HOLIDAY, "ALL_CYCLE", 0.9, 
				LocalDate.of(2016, 11, 1), LocalDate.of(2016, 11, 15)));

		assertEquals(ResultMessage.SUCCESS, driver.promotionBLService.setWebPromotions(list));
	}

}
