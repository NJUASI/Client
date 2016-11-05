package businessLogic.memberBL;

import static org.junit.Assert.*;

import org.junit.Test;

import utilities.MemberType;
import utilities.ResultMessage;
import vo.MemberVO;

public class Member_tester {

	@Test
	public void test1() {
		//test method add(MemberVO memberVO)
			MemberController controller = MemberController.getInstance();
			MemberVO memberVO= new MemberVO("1234567890", "2016/2/2", "school");
				
		assertEquals(controller.add(memberVO) , ResultMessage.SUCCESS);
				
	}
	
	@Test
	public void test2() {
		//test method modify(MemberVO memberVO)
			MemberController controller = MemberController.getInstance();
			MemberVO memberVO= new MemberVO("1234567890", "2016/2/2", "school");
				
		assertEquals(controller.modify(memberVO) , ResultMessage.SUCCESS);
				
	}
	
	@Test
	public void test3() {
		//test method getMemberInfo(String userID, MemberType memberType)
			MemberController controller = MemberController.getInstance();
			MemberVO memberVO= controller.getMemberInfo("1234567890", MemberType.COMMON);
				
		assertEquals(memberVO.guestID , "1234567890");
		assertEquals(memberVO.birthday , "2016/2/2");
		assertEquals(memberVO.enterprise , "school");
				
	}
	
	@Test
	public void test4() {
		//test method isMember(String userID, MemberType memberType)
			MemberController controller = MemberController.getInstance();
				
		assertEquals(controller.isMember("1234567890", MemberType.COMMON), true);
				
	}
	
	@Test
	public void test5() {
		//test method getMemberType(String userID)
			MemberController controller = MemberController.getInstance();
				
		assertEquals(controller.getMemberType("1234567890"), MemberType.COMMON);
				
	}

}
