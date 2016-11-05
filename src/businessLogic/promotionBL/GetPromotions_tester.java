package businessLogic.promotionBL;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import vo.PromotionVO;

public class GetPromotions_tester {

	@Test
	public void testGetPromotions() {
		
		PromotionController controller = PromotionController.getInstance();
		controller.setHotel("12345678");
		List<PromotionVO> list = controller.mockPromotion.getPromotions(controller.mockPromotion.hotelID);
		PromotionVO promotionVO = list.get(1);
		
		assertEquals(promotionVO.hotelID, "12345679");
		assertEquals(promotionVO.startDate, "2016/11/12");
		assertEquals(promotionVO.endDate, "2016/11/13");
		assertEquals(promotionVO.discount, 0.8 ,0.1);
	}

}
