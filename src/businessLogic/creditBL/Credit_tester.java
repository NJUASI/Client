package businessLogic.creditBL;

import static org.junit.Assert.*;

import org.junit.Test;

import utilities.ResultMessage;
import vo.CreditVO;

public class Credit_tester {

	@Test
	public void test1() {
		//test method charge(int chargeNum)
		CreditController controller = CreditController.getInstance();
			
	    assertEquals(controller.charge(200) , ResultMessage.SUCCESS);
	}
	
	@Test
	public void test2() {
		//test method getBasicInfo(String ID)
		CreditController controller = CreditController.getInstance();
		CreditVO creditVO = controller.getBasicInfo("1234567890");
			
	    assertEquals(creditVO.guestID , "1234567890");
	    assertEquals(creditVO.time , "2016/1/1");
	    assertEquals(creditVO.orderID , "123456789012");
	    assertEquals(creditVO.credit , 100);
	    assertEquals(creditVO.preCredit , 100);
	    assertEquals(creditVO.reason , "undo");
	    
	}

}
