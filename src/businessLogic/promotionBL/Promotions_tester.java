package businessLogic.promotionBL;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import utilities.ResultMessage;
import vo.PromotionVO;

public class Promotions_tester {

	@Test
	public void test1() {
		// test method getPromotions(String userID)
		
		PromotionController controller = PromotionController.getInstance();
//		controller.setHotel("12345678");
		PromotionVO promotionVO  = controller.getPromotions("12345678").get(0);
		
		assertEquals(promotionVO.discount, 0.9, 0);
		assertEquals(promotionVO.hotelID, "12345678");
		assertEquals(promotionVO.startDate, "2016/11/11");
		assertEquals(promotionVO.endDate, "2016/11/12");
	}

	@Test
	public void test2() {
		// test method update(List<PromotionVO> list)
		
		List<PromotionVO> list = new LinkedList<PromotionVO>();
		list.add(new PromotionVO(0.9, "12345678", "2016/11/11", "2016/11/12"));
		
		PromotionController controller = PromotionController.getInstance();
		
		assertEquals(controller.update(list), ResultMessage.SUCCESS);
	}
	
}
