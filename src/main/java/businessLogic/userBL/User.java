package businessLogic.userBL;

import java.util.List;

import businessLogic.hotelBL.Hotel;
import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.HotelVO;
import vo.UserVO;

public class User {

	private Guest guest;
	private HotelWorker hotelWorker;
	private WebMarketer webMarketer;
	private WebManager webManager;

	public User() {
		guest = new Guest();
		hotelWorker = new HotelWorker();
		webMarketer = new WebMarketer();
		webManager = new WebManager();

	}

	public ResultMessage add(UserVO newUserVO) {

		ResultMessage msg = ResultMessage.USER_INEXISTENCE;

		if (guest.isGuest(newUserVO.userID.length())) {
			msg = guest.add(newUserVO);
		}

		if (hotelWorker.isHotelWorker(newUserVO.userID.length())) {
			msg = hotelWorker.add(newUserVO);
		}

		if (webMarketer.isWebMarketer(newUserVO.userID.length())) {
			msg = webMarketer.add(newUserVO);
		}

		if (webManager.isWebManager(newUserVO.userID.length())) {
			msg = webManager.add(newUserVO);
		}
		return msg;
	}

	public ResultMessage modify(UserVO userVO) {

		ResultMessage msg = ResultMessage.USER_INEXISTENCE;

		if (guest.isGuest(userVO.userID.length())) {
			msg = guest.modify(userVO);
		}

		if (hotelWorker.isHotelWorker(userVO.userID.length())) {
			msg = hotelWorker.modify(userVO);
		}

		if (webMarketer.isWebMarketer(userVO.userID.length())) {
			msg = webMarketer.modify(userVO);
		}

		if (webManager.isWebManager(userVO.userID.length())) {
			msg = webManager.modify(userVO);
		}
		return msg;
	}

	public UserVO getSingle(String userID, UserType userType) {
		if (guest.isGuest(userType)) {
			return guest.getSingle(userID);
		}

		if (hotelWorker.isHotelWorker(userType)) {
			return hotelWorker.getSingle(userID);
		}

		if (webMarketer.isWebMarketer(userType)) {
			return webMarketer.getSingle(userID);
		}

		if (webManager.isWebManager(userType)) {
			return webManager.getSingle(userID);
		}

		return null;
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
		if (guest.isGuest(userType)) {
			return guest.getAll();
		}

		if (hotelWorker.isHotelWorker(userType)) {
			return hotelWorker.getAll();
		}

		if (webMarketer.isWebMarketer(userType)) {
			return webMarketer.getAll();
		}

		if (webManager.isWebManager(userType)) {
			return webManager.getAll();
		}

		return null;
	}

	public List<CreditVO> getAllCreditDetail(String guestID) {
		return guest.getAllCreditDetail(guestID);
	}

	public String getLogInInfo(String userID, UserType userType) {
		if (guest.isGuest(userType)) {
			return guest.getLogInInfo(userID);
		}

		if (hotelWorker.isHotelWorker(userType)) {
			return hotelWorker.getLogInInfo(userID);
		}

		if (webMarketer.isWebMarketer(userType)) {
			return webMarketer.getLogInInfo(userID);
		}

		if (webManager.isWebManager(userType)) {
			return webManager.getLogInInfo(userID);
		}
		return null;
	}

}
