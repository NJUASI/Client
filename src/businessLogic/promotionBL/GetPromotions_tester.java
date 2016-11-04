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
		
		assertEquals(promotionVO.getHotelID(), "12345679");
		assertEquals(promotionVO.getStartDate(), "2016/11/12");
		assertEquals(promotionVO.getEndDate(), "2016/11/13");
		assertEquals(promotionVO.getDiscount(), 0.8 ,0.1);
	}

}
