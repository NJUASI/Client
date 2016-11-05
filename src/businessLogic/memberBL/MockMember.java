package businessLogic.memberBL;

import utilities.MemberType;
import utilities.ResultMessage;
import vo.MemberVO;

public class MockMember extends Member {
	
	public ResultMessage add(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	public ResultMessage modify(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	public MemberVO getMemberInfo(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		return  new MemberVO("1234567890", "2016/2/2", "school");
	}

	public boolean isMember(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		return true;
	}

	public MemberType getMemberType(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		return MemberType.COMMON;
	}

}
