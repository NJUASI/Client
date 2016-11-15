package businessLogic.memberBL;

import businessLogicService.memberBLService.MemberBLService;
import utilities.MemberType;
import utilities.ResultMessage;
import vo.MemberVO;

public class MemberController implements MemberBLService {

	
	private Member member;
	private static MemberController memberController;
	
	private MemberController() {
		//new the mock object
		member = new MockMember();
	}
	
	public static MemberController getInstance(){
		if(memberController == null) memberController = new MemberController();
		return memberController;
	}
	
	public ResultMessage add(MemberVO memberVO) {
		return member.add(memberVO);
	}

	public ResultMessage modify(MemberVO memberVO) {
		return member.modify(memberVO);
	}

	public MemberVO getMemberInfo(String userID, MemberType memberType) {
		return member.getMemberInfo(userID, memberType);
	}

	public boolean isMember(String userID, MemberType memberType) {
		return member.isMember(userID, memberType);
	}

	public MemberType getMemberType(String userID) {
		return member.getMemberType(userID);
	}
	
}
