package businessLogic.userBL;

import java.util.List;

import businessLogic.hotelBL.Hotel;
import businessLogic.userBL.userService.Guest;
import businessLogic.userBL.userService.HotelWorker;
import businessLogic.userBL.userService.WebManager;
import businessLogic.userBL.userService.WebMarketer;
import businessLogic.userBL.userService.service.CreditService;
import businessLogic.userBL.userService.service.UserService;
import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.HotelVO;
import vo.UserVO;

public class User {

	private UserService user;
	private CreditService guest;

	public User() {
		guest = new Guest();
	}

	public ResultMessage add(UserVO newUserVO) {

		ResultMessage msg = ResultMessage.USER_INEXISTENCE;
		this.initial(newUserVO.userID.length());

		msg = user.add(newUserVO);

		return msg;
	}

	public ResultMessage modify(UserVO userVO) {

		ResultMessage msg = ResultMessage.USER_INEXISTENCE;
		this.initial(userVO.userID.length());

		msg = user.modify(userVO);

		return msg;
	}

	public UserVO getSingle(String userID, UserType userType) {

		this.initial(userType);

		return user.getSingle(userID);

	}

	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {

		Hotel hotel = new Hotel();
		ResultMessage msg = ResultMessage.HOTEL_EXIST;

		if (hotel.getHotelInfo(hotelID) == null) {
			msg = hotel.addHotel(newHotelVO);
		}

		return msg;
	}

	public ResultMessage modifyCredit(String guestID, float creditNum) {
		return guest.modifyCredit(guestID, creditNum);
	}

	public List<UserVO> getAll(UserType userType) {

		this.initial(userType);

		return user.getAll();

	}

	public List<CreditVO> getAllCreditDetail(String guestID) {
		return guest.getAllCreditDetail(guestID);
	}

	public String getLogInInfo(String userID, UserType userType) {
		this.initial(userType);
		return user.getLogInInfo(userID);
	}

	private void initial(int IDLength) {
		if (Guest.isGuest(IDLength)) {
			user = new Guest();
			return;
		}

		if (HotelWorker.isHotelWorker(IDLength)) {
			user = new HotelWorker();
			return;
		}

		if (WebMarketer.isWebMarketer(IDLength)) {
			user = new WebMarketer();
			return;
		}

		if (WebManager.isWebManager(IDLength)) {
			user = new WebManager();
		}
	}

	private void initial(UserType userType) {
		if (Guest.isGuest(userType)) {
			user = new Guest();
			return;
		}

		if (HotelWorker.isHotelWorker(userType)) {
			user = new HotelWorker();
			return;
		}

		if (WebMarketer.isWebMarketer(userType)) {
			user = new WebMarketer();
			return;
		}

		if (WebManager.isWebManager(userType)) {
			user = new WebManager();
		}
	}
}
