package businessLogic.memberBL;

import static org.junit.Assert.*;
import java.time.LocalDate;

import org.junit.Test;

import utilities.*;
import vo.MemberVO;

public class MemberTest {
	
	private Member member = new Member();
	
	@Test
	public void testAdd() {
		LocalDate time = LocalDate.of(1995, 01, 01);
		MemberVO memberVO = new MemberVO("1234567890",time,"金鹰");
		
		assertEquals(member.add(memberVO), ResultMessage.SUCCESS);
	}
	
	@Test
	public void testModify() {
		LocalDate time = LocalDate.of(1995, 01, 01);
		MemberVO memberVO = new MemberVO("1234567890",time,"金鹰");
		
		assertEquals(member.modify(memberVO), ResultMessage.SUCCESS);
	}
	
	@Test
	public void testGetMemberInfo() {
		LocalDate time = LocalDate.of(1995, 01, 01);
		MemberVO memberVO = member.getMemberInfo("1234567890", MemberType.BOTH);
		
		assertEquals(memberVO.guestID, "1234567890");
		assertEquals(memberVO.birthday, time);
		assertEquals(memberVO.enterprise, "school");
	}
	
	@Test
	public void testIsMember() {
		assertEquals(member.isMember("1234567890", MemberType.BOTH),true);
	}
	
	@Test
	public void testGetMemberType() {
		assertEquals(member.getMemberType("1234567890"),MemberType.BOTH);
	}

}
