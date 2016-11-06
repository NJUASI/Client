package presentation.hotelWorkerUI.driver;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import businessLogic.promotionBL.stub.PromotionBLService_Stub;
import utilities.ResultMessage;
import vo.PromotionVO;

public class PromotionBLService_DriverTest {

	@Test
	public void test1() {
		//test interface getPromotions
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		PromotionVO promotionVO = driver.promotionBLService.getPromotions("12345678").get(0);

		assertEquals(promotionVO.discount, 0.8, 0);
		assertEquals(promotionVO.hotelID, "12345678");
		assertEquals(promotionVO.endDate, "2016/11/12");
		assertEquals(promotionVO.startDate, "2016/11/11");

	}

	@Test
	public void test2() {
		//test interface update
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		ArrayList<PromotionVO> list = new ArrayList<PromotionVO>();
		list.add(new PromotionVO(0.9, "12345678", "2016/11/11", "2016/11/12"));

		assertEquals(driver.promotionBLService.update(list), ResultMessage.SUCCESS);
	}

}
