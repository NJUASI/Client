package presentation.hotelWorkerUI;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import businessLogic.promotionBL.MockPromotion;
import utilities.ResultMessage;
import vo.PromotionVO;

public class PromotionBLService_DriverTest {

	@Test
	public void test1() {
		//test interface Evaluation
		MockPromotion stub = new MockPromotion("12345678");
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		PromotionVO promotionVO =driver.promotionBLService.getPromotions("12345678").get(0);

		assertEquals(promotionVO.getHotelID(), "12345678");
		assertEquals(promotionVO.getEndDate(), "2016/11/12");
		assertEquals(promotionVO.getStartDate(), "2016/11/11");

	}

	@Test
	public void test2() {
		//test interface Evaluation
		MockPromotion stub = new MockPromotion("12345678");
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		ArrayList<PromotionVO> list = new ArrayList<PromotionVO>();
		list.add(new PromotionVO(0.9, "12345678", "2016/11/11", "2016/11/12"));

		assertEquals(driver.promotionBLService.update(list), ResultMessage.SUCCESS);
	}

}
