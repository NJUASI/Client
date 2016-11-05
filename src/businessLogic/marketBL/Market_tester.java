package businessLogic.marketBL;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import utilities.ResultMessage;
import vo.MarketVO;

public class Market_tester {

	@Test
	public void test1() {
		//test method getMemberFormulation()
		MarketController controller = MarketController.getInstance();
		List<MarketVO> list =controller.getMemberFormulation();
		MarketVO marketVO =list.get(0);
			
		assertEquals(marketVO.marketName , "Lv1");
		assertEquals(marketVO.marketCredit , 500);
		assertEquals(marketVO.marketBenefit , "0.9");
	}
	
	@Test
	public void test2() {
		//test method setMemberFormulation(List<MarketVO> marketVOList)
		MarketController controller = MarketController.getInstance();
		List<MarketVO> list = new LinkedList<MarketVO>();
		list.add(new MarketVO("Lv1",500 , "0.9"));
			
		assertEquals(controller.setMemberFormulation(list) , ResultMessage.SUCCESS);
	}

}
