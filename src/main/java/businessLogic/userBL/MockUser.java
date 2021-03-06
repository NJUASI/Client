package businessLogic.userBL;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import businessLogic.hotelBL.MockHotel;
import businessLogic.hotelBL.hotel.Hotel;
import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.GuestVO;
import vo.UserVO;

public class MockUser extends User{
	
	private Hotel hotel;
	
	public MockUser() {
		hotel = new MockHotel("12345678");
	}
	
	public ResultMessage add(UserVO newUserVO) {
		return ResultMessage.SUCCESS;
	}
	

	public ResultMessage modify(UserVO userVO) {
		return ResultMessage.SUCCESS;
	}
	
	public UserVO getSingle(String userID, UserType userType) {
		UserVO guestVO= new GuestVO("1234567890", LocalDate.of(1996, 4, 1), "school", "zhangsan", "xiaosan",
				"000000", "13523456789", 100 );
		return guestVO;
	}
	
	public ResultMessage modifyCredit(String guestID, float creditNum) {
		return ResultMessage.SUCCESS;
	}
	
	public List<UserVO> getAll(UserType userType) {
		List<UserVO> list = new ArrayList<UserVO>();
		UserVO guestVO1= new GuestVO("1234567890", LocalDate.of(1996, 4, 1), "school", "zhangsan", "xiaosan",
				"000000", "13523456789", 100);
		UserVO guestVO2= new GuestVO("1234567891", LocalDate.of(1996, 4, 7), "school", "zhangsi", "xiaosi",
				"000000", "13523456799", 200);
		list.add(guestVO1);
		list.add(guestVO2);
		return list;
	}
	
	public List<CreditVO> getAllCreditDetail(String userID) {
		List<CreditVO> creditDetailList = new LinkedList<CreditVO>();
		creditDetailList.add(new CreditVO("1234567890", LocalDateTime.of(2016, 10, 2, 18, 12), "123420161002", 100, 100, "undo"));
		creditDetailList.add(new CreditVO("1234567890", LocalDateTime.of(2016, 10, 3, 13, 14), "124520161003", 100, 100, "create"));
		creditDetailList.add(new CreditVO("1234567890", LocalDateTime.of(2016, 10, 4, 15, 22), "244520161004", 100, 300, "executed"));
		return creditDetailList;
	}

	public String getLogInInfo(String userID, UserType userType) {
		return "123456";
	}

}
