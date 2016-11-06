package presentation.webMarketerUI.driver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import businessLogic.promotionBL.stub.PromotionBLService_Stub;
import utilities.ResultMessage;
import vo.PromotionVO;

public class PromotionBLService_DriverTest {

	@Test
	public void test1() {
		//test interface Evaluation
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		PromotionVO promotionVO =driver.promotionBLService.getPromotions("1234567890").get(0);
		
		assertEquals(promotionVO.hotelID, "12345678");
		assertEquals(promotionVO.endDate, "2016/3/9");
		assertEquals(promotionVO.startDate, "2016/2/2");
		
	}
	
	public void test2() {
		//test interface Evaluation
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		ArrayList<PromotionVO> list = new ArrayList<PromotionVO>();
		list.add(new PromotionVO(0.9, "12345678", "2016/2/2", "2016/3/9"));
		
		assertEquals(driver.promotionBLService.update(list), ResultMessage.SUCCESS);
	}

}
