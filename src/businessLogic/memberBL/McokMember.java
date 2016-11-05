package businessLogic.memberBL;

import dataService.guestDataService.GuestDataService_Stub;
import po.MemberPO;
import utilities.MemberType;
import utilities.ResultMessage;
import vo.MemberVO;

public class McokMember extends Member {
	
	public ResultMessage add(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return new GuestDataService_Stub().modifyMember(new MemberPO(memberVO.getGuestID(),
				memberVO.getBirthday(),memberVO.getEnterprise()));
	}

	public ResultMessage modify(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return new GuestDataService_Stub().modifyMember(new MemberPO(memberVO.getGuestID(),
				memberVO.getBirthday(),memberVO.getEnterprise()));
	}

	public MemberVO getMemberInfo(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		GuestDataService_Stub a= new GuestDataService_Stub();
		return  new MemberVO(a.getSingle(userID).getGuestID(),a.getSingle(userID).getBirthday(),
				a.getSingle(userID).getEnterprise());
	}

	public boolean isMember(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		return false;
	}

	public MemberType getMemberType(String userID, MemberType memberType) {
		// TODO Auto-generated method stub
		return MemberType.COMMON;
	}

}
