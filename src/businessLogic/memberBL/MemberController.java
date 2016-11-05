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
	
	@Override
	public ResultMessage add(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage modify(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO getMemberInfo(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMember(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MemberType getMemberType(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
