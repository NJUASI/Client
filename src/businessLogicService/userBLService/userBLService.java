package businessLogicService.userBLService;

import java.util.List;

import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.HotelVO;
import vo.UserVO;

public interface UserBLService {

	public List<UserVO> getAll(UserType userType);
	public UserVO getSingle(String userID,UserType userType);
	public List<CreditVO> getAllCreditDetail(String guestID);
	public ResultMessage add(UserVO newUserVO);
	public ResultMessage addHotel(HotelVO  newHotelVO, String hotelID);
	public ResultMessage modify(UserVO userVO);
	public ResultMessage modifyCredit (String guestID, float creditNum);
	public String getLogInInfo(String userID, UserType userType);
	
}
