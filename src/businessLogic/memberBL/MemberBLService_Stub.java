package businessLogic.memberBL;

import businessLogicService.memberBLService.MemberBLService;
import utilities.MemberType;
import utilities.ResultMessage;
import vo.MemberVO;

public class MemberBLService_Stub implements MemberBLService{

	public ResultMessage add(MemberVO memberVO) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage modify(MemberVO memberVO) {
		return null;
	}

	public MemberVO getMemberInfo(String userID, MemberType memberType) {
		return null;
	}

	public boolean isMember(String userID, MemberType memberType) {
		return false;
	}

	public MemberType getMemberType(String userID, MemberType memberType) {
		return null;
	}

}
