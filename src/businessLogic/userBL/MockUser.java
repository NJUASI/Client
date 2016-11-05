package businessLogic.userBL;

import java.util.ArrayList;
import java.util.List;

import dataService.guestDataService.GuestDataService_Stub;
import utilities.ResultMessage;
import utilities.UserType;
import vo.HotelVO;
import vo.UserVO;

public class MockUser extends User{
	
	public List<UserVO> getAll(UserType userType) {
		// TODO Auto-generated method stub
		GuestDataService_Stub a= new GuestDataService_Stub();
		List<UserVO> list = new ArrayList<UserVO>();
//		UserVO guestVO = new GuestVO(a.getSingle("1234567890").getGuestID(),a.getSingle("1234567890").getBirthday(),
//				a.getSingle("1234567890").getEnterprise(),a.getSingle("1234567890").getName(),
//				a.getSingle("1234567890").getNickName(),a.getSingle("1234567890").getPassword(),
//				a.getSingle("1234567890").getPhone(),a.getSingle("1234567890").getCredit());
////		UserVO vo=guestVO;
		list.add(new UserVO(a.getSingle("1234567890").getGuestID(),a.getSingle("1234567890").getPassword()));
		return list;
	}

	public UserVO getSingle(String userID, UserType userType) {
		// TODO Auto-generated method stub
		GuestDataService_Stub a= new GuestDataService_Stub();
		return  new UserVO(a.getSingle("1234567890").getGuestID(),a.getSingle("1234567890").getPassword());
	}

	public ResultMessage add(UserVO newUserVO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;//等hotelBL实现再具体实现
	}

	public ResultMessage modify(UserVO userVO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	public ResultMessage modifyCredit(float creditNum) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	public ResultMessage getLoginInfo(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

}
