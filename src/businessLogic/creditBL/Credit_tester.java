package businessLogic.creditBL;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.userBL.User;
import utilities.ResultMessage;
import vo.BasicInfoVO;
import vo.CreditVO;
import vo.GuestVO;

public class Credit_tester {

	@Test
	public void test1() {
		//test cooperation with class user
		CreditController controller = CreditController.getInstance();
		
		BasicInfoVO userBasicInfoVO = controller.getBasicInfo("1234567890");
		GuestVO guestVO = userBasicInfoVO.guestVO;
		
		assertEquals(guestVO.guestID, "1234567890");
		assertEquals(guestVO.password, "000000");
		assertEquals(guestVO.birthday, "1996/4/1");
		assertEquals(guestVO.enterprise, "school");
		assertEquals(guestVO.name, "zhangsan" );
		assertEquals(guestVO.nickName, "xiaosan");
		assertEquals(guestVO.credit, "100");
		assertEquals(guestVO.phone, "13523456789");
		
	    assertEquals(userBasicInfoVO.memberDegree, "Lv1");
	}
	
//	@Test
//	public void test2() {
//		//test cooperation with class market
//		CreditController controller = CreditController.getInstance();
//		CreditVO creditVO = controller.getBasicInfo("1234567890");
//			
//	    assertEquals(creditVO.guestID , "1234567890");
//	    assertEquals(creditVO.time , "2016/1/1");
//	    assertEquals(creditVO.orderID , "123456789012");
//	    assertEquals(creditVO.credit , 100);
//	    assertEquals(creditVO.preCredit , 100);
//	    assertEquals(creditVO.reason , "undo");
//	    
//	}
//	
//	@Test
//	public void test1() {
//		//test method charge(int chargeNum)
//		CreditController controller = CreditController.getInstance();
//			
//	    assertEquals(controller.charge(200) , ResultMessage.SUCCESS);
//	}
//	
//	@Test
//	public void test2() {
//		//test method getBasicInfo(String ID)
//		CreditController controller = CreditController.getInstance();
//		CreditVO creditVO = controller.getBasicInfo("1234567890");
//			
//	    assertEquals(creditVO.guestID , "1234567890");
//	    assertEquals(creditVO.time , "2016/1/1");
//	    assertEquals(creditVO.orderID , "123456789012");
//	    assertEquals(creditVO.credit , 100);
//	    assertEquals(creditVO.preCredit , 100);
//	    assertEquals(creditVO.reason , "undo");
//	    
//	}

}
