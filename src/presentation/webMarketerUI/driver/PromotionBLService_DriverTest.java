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
		//test interface getPromotions
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		PromotionVO promotionVO =driver.promotionBLService.getPromotions("1234567890").get(0);
		
		assertEquals(0.8, promotionVO.discount, 0);
		assertEquals("12345678", promotionVO.hotelID);
		assertEquals("2016/11/12", promotionVO.endDate);
		assertEquals("2016/11/11", promotionVO.startDate);
		
	}
	
	public void test2() {
		//test interface uupdate
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		ArrayList<PromotionVO> list = new ArrayList<PromotionVO>();
		list.add(new PromotionVO(0.9, "12345678", "2016/11/11", "2016/11/12"));

		assertEquals(ResultMessage.SUCCESS, driver.promotionBLService.update(list));
	}

}
