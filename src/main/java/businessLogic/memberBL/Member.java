package businessLogic.memberBL;

import java.rmi.RemoteException;

import dataService.guestDataService.GuestDataService;
import dataService.guestDataService.GuestDataService_Stub;
import po.MemberPO;
import utilities.MemberType;
import utilities.ResultMessage;
import vo.GuestVO;
import vo.MemberVO;

public class Member {

	private GuestDataService guestDataService;
	private MemberInfo member;

	public Member() {
		guestDataService = new GuestDataService_Stub();
		member = new MemberInfo();
	}

	public ResultMessage add(MemberVO memberVO) {
		return this.addMemberInfo(memberVO);
	}

	public ResultMessage modify(MemberVO memberVO) {
		return this.addMemberInfo(memberVO);
	}

	public MemberVO getMemberInfo(String userID, MemberType memberType) {
		try {
			GuestVO guestVO = new GuestVO(guestDataService.getSingleGuest(userID));
			return new MemberVO(guestVO);
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
	}

	public boolean isMember(String userID, MemberType memberType) {
		try {
			GuestVO guestVO = new GuestVO(guestDataService.getSingleGuest(userID));
			MemberVO memberVO = new MemberVO(guestVO);
			if (member.isCommonMember(memberVO, memberType)) {// 是普通会员，返回true
				return true;
			}
			if (member.isEnterpriseMember(memberVO, memberType)) {// 是企业会员，返回true
				return true;
			}

			if (member.isBothMember(memberVO, memberType)) {// 判断是两种类型会员，返回true
				return true;
			}

			return false;// 不满足上述三种情况，返回false
		} catch (RemoteException e) {
			e.printStackTrace();
			System.out.println("error");// 异常返回错误
			return false;
		}
	}

	public MemberType getMemberType(String userID) {
		try {
			GuestVO guestVO = new GuestVO(guestDataService.getSingleGuest(userID));
			MemberVO memberVO = new MemberVO(guestVO);

			return member.getMemberType(memberVO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	private ResultMessage addMemberInfo(MemberVO memberVO) {
		try {
			MemberPO memberPO = new MemberPO(memberVO);
			return guestDataService.modifyMember(memberPO);
		} catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAIL;
		}
	}
}
