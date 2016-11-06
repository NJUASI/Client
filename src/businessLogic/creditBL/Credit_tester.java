package businessLogic.creditBL;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import businessLogic.userBL.User;
import utilities.ResultMessage;
import vo.BasicInfoVO;
import vo.CreditVO;
import vo.GuestVO;
import vo.MarketVO;

public class Credit_tester {

	@Test
	public void test1() {
		//test cooperation with class user & market
		CreditController controller = CreditController.getInstance();
		
		BasicInfoVO userBasicInfoVO = controller.getBasicInfo("1234567890");
		GuestVO guestVO = userBasicInfoVO.guestVO;
		
		assertEquals(guestVO.guestID, "1234567890");
		assertEquals(guestVO.password, "000000");
		assertEquals(guestVO.birthday, "1996/4/1");
		assertEquals(guestVO.enterprise, "school");
		assertEquals(guestVO.name, "zhangsan" );
		assertEquals(guestVO.nickName, "xiaosan");
		assertEquals(guestVO.credit, 100);
		assertEquals(guestVO.phone, "13523456789");
		
	    assertEquals(userBasicInfoVO.memberDegree, "Lv1");
	}
	
	@Test
	public void test2() {
		//test cooperation with class user
		CreditController controller = CreditController.getInstance();
	    
	    assertEquals(controller.charge("1234567890", 100), ResultMessage.SUCCESS);
	}
	
	@Test
	public void test3() {
		//test cooperation with class user
		CreditController controller = CreditController.getInstance();
		List<CreditVO> list = controller.getAllCreditDetail("1234567890");
		CreditVO creditVO1 = list.get(0);
		CreditVO creditVO2 = list.get(1);
		CreditVO creditVO3 = list.get(2);
	
	    assertEquals(creditVO1.guestID , "1234567890");
	    assertEquals(creditVO1.time , "2016/10/2");
	    assertEquals(creditVO1.orderID , "123420161002");
	    assertEquals(creditVO1.credit , 100);
	    assertEquals(creditVO1.preCredit , 100);
	    assertEquals(creditVO1.reason , "undo");
	    
	    assertEquals(creditVO2.guestID , "1234567890");
	    assertEquals(creditVO2.time , "2016/10/3");
	    assertEquals(creditVO2.orderID , "124520161003");
	    assertEquals(creditVO2.credit , 100);
	    assertEquals(creditVO2.preCredit , 100);
	    assertEquals(creditVO2.reason , "create");
	    
	    assertEquals(creditVO3.guestID , "1234567890");
	    assertEquals(creditVO3.time , "2016/10/4");
	    assertEquals(creditVO3.orderID , "244520161004");
	    assertEquals(creditVO3.preCredit , 100);
	    assertEquals(creditVO3.credit , 300);
	    assertEquals(creditVO3.reason , "executed");
	    
	}
	
	@Test
	public void test4() {
		//test cooperation with class market
		CreditController controller = CreditController.getInstance();
	    
	    List<MarketVO> memberFormulationList = controller.getMemberFormulation();
	    MarketVO marketVO = memberFormulationList.get(0);
	    
	    assertEquals(marketVO.marketName , "Lv1");
	    assertEquals(marketVO.marketCredit, 50);
	    assertEquals(marketVO.marketBenefit, 0.9, 0);    
	}
	
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
