package presentation.webMarketerUI;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import businessLogic.promotionBL.PromotionBLService_Stub;
import utilities.ResultMessage;
import vo.PromotionVO;

public class PromotionBLService_DriverTest {

	@Test
	public void test1() {
		//test interface Evaluation
		PromotionBLService_Stub stub = new PromotionBLService_Stub(0, "", "", "");
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		PromotionVO promotionVO =driver.promotionBLService.getPromotions("").get(0);
		
		assertEquals(promotionVO.getHotelID(), "");
		assertEquals(promotionVO.getEndDate(), "");
		assertEquals(promotionVO.getStartDate(), "");
		
	}
	
	public void test2() {
		//test interface Evaluation
		PromotionBLService_Stub stub = new PromotionBLService_Stub(0, "", "", "");
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		ArrayList<PromotionVO> list = new ArrayList<PromotionVO>();
		
		assertEquals(driver.promotionBLService.update(list), ResultMessage.SUCCESS);
	}

}
