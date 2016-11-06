package businessLogic.userBL;

import java.util.ArrayList;
import java.util.List;

import businessLogic.hotelBL.Hotel;
import businessLogic.hotelBL.MockHotel;
import utilities.ResultMessage;
import utilities.UserType;
import vo.GuestVO;
import vo.HotelVO;
import vo.UserVO;

public class MockUser extends User{
	
	private Hotel hotel;
	
	public MockUser() {
		hotel = new MockHotel();
	}
	
	public List<UserVO> getAll(UserType userType) {
		List<UserVO> list = new ArrayList<UserVO>();
		UserVO guestVO1= new GuestVO("1234567890", "2016/2/2", "school", "zhangsan", "xiaosan",
				"000000", "13523456789","100");
		UserVO guestVO2= new GuestVO("1234567891", "2016/2/2", "school", "zhangsi", "xiaosi",
				"000000", "13523456799","200");
		list.add(guestVO1);
		list.add(guestVO2);
		return list;
	}

	public UserVO getSingle(String userID, UserType userType) {
		UserVO guestVO= new GuestVO("1234567890", "2016/2/2", "school", "zhangsan", "xiaosan",
				"000000", "13523456789","100");
		return guestVO;
	}

	public ResultMessage add(UserVO newUserVO) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage modify(UserVO userVO) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage modifyCredit(float creditNum) {
		return ResultMessage.SUCCESS;
	}

	public ResultMessage getLogInInfo(String userID, UserType userType) {
		return ResultMessage.SUCCESS;
	}

}
