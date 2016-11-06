package businessLogic.userBL;

import java.util.List;

import businessLogic.hotelBL.Hotel;
import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.HotelVO;
import vo.UserVO;

public class User {

	private Hotel hotel;
	
	public User() {
		hotel = new Hotel();
	}
	
	public List<UserVO> getAll(UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public UserVO getSingle(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<CreditVO> getAllCreditDetail(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage add(UserVO newUserVO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage modify(UserVO userVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage modifyCredit(float creditNum) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage getLogInInfo(String userID, UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}

}
