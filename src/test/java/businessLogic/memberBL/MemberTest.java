package businessLogic.memberBL;

import static org.junit.Assert.*;
import java.time.LocalDate;

import org.junit.Test;

import utilities.*;
import vo.MemberVO;

public class MemberTest {
	
	private Member member;
	
	@Test
	public void testAdd() {
		LocalDate time = LocalDate.of(2016, 2, 13);
		MemberVO memberVO = new MemberVO("1234567890",time,"金鹰");
//		assert(member.add(memberVO), ResultMessage.SUCCESS);
	}
	
	@Test
	public void testModify() {
	}
	
	@Test
	public void testGetMemberInfo() {
	}
	
	@Test
	public void testIsMember() {
	}
	
	@Test
	public void testGetMemberType() {
	}

}
