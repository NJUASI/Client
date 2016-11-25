package businessLogic.memberBL;

import utilities.MemberType;
import vo.MemberVO;

public class MemberInfo {

	private MemberType common = MemberType.COMMON;

	private MemberType enterprise = MemberType.ENTERPRISE;

	private MemberType bothMember = MemberType.BOTH;

	public boolean isCommonMember(MemberVO memberVO, MemberType memberType) {
		if (memberType != this.common) {
			return false;
		}
		if (memberVO.birthday == null) {
			return false;
		}
		return true;
	}

	public boolean isEnterpriseMember(MemberVO memberVO, MemberType memberType) {
		if (memberType != this.enterprise) {
			return false;
		}
		if (memberVO.enterprise == null) {
			return false;
		}
		return true;
	}

	public boolean isBothMember(MemberVO memberVO, MemberType memberType) {
		if (memberType != this.bothMember) {
			return false;
		}
		if (memberVO.birthday != null && memberVO.enterprise != null) {
			return true;
		} else
			return false;
	}
	
	public MemberType getMemberType(MemberVO memberVO){
		
		if (memberVO.birthday != null && memberVO.enterprise != null) {
			return this.bothMember;
		}

		if (memberVO.birthday != null) {
			return this.common;
		}

		if (memberVO.enterprise != null) {
			return this.enterprise;
		}
		
		return null;
	}

}
