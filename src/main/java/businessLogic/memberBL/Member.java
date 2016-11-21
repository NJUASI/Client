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
	
	public Member(){
		guestDataService= new GuestDataService_Stub();
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
			if(memberType==MemberType.COMMON&&memberVO.birthday==null){//不是普通会员，返回错误
				return false;
			}
			if(memberType==MemberType.ENTERPRISE&&memberVO.enterprise==null){//不是企业会员，返回错误
				return false;
			}
			
			if(memberType==MemberType.BOTH){//判断是两种类型会员，返回正确
				if(memberVO.birthday!=null&&memberVO.enterprise!=null){return true;}
				else return false;
			}
			
			return true;//不满足上述三种情况，返回正确
		} catch (RemoteException e) {
			e.printStackTrace();
			System.out.println("error");//异常返回错误
			return false;
		}
	}

	public MemberType getMemberType(String userID) {
		try {
			GuestVO guestVO = new GuestVO(guestDataService.getSingleGuest(userID));
			MemberVO memberVO = new MemberVO(guestVO);
			
			if(memberVO.birthday!=null&&memberVO.enterprise!=null){
				return MemberType.BOTH;
			}
			
			if(memberVO.birthday!=null){
				return MemberType.COMMON;
			}
			
			if(memberVO.enterprise!=null){
				return MemberType.ENTERPRISE;
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	private ResultMessage addMemberInfo(MemberVO memberVO){
		try {
			MemberPO memberPO = new MemberPO(memberVO);
			 return guestDataService.modifyMember(memberPO);
		} catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAIL;
		}
	}
}
