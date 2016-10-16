package businessLogicService.memberBLService;

import utilities.MemberType;
import utilities.ResultMessage;

public interface MemberBLService {

//	public ResultMessage add(MemberVO memberVO);
//	public ResultMessage modify(MemberVO memberVO);
//	public MemberVO getMemberInfo(String userID, MemberType memberType);
	public boolean isMember(String userID, MemberType memberType);
	public MemberType getMemberType(String userID, MemberType memberType);

}
