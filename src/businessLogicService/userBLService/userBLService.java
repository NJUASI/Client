package businessLogicService.userBLService;

import java.util.List;

import utilities.ResultMessage;

public interface userBLService {
	public List<UserVO> getAll(UserType userType);
	public UserVO getSingle(String userID,UserType userType);
	public ResultMessage add(UserVO newUserVO);
	public ResultMessage addHotel(HotelVO  newHotelVO, String hotelID);
	public ResultMessage modify(UserVO userVO);
	public ResultMessage modifyCredit (float creditNum);
	public ResultMessage getLoginInfo(String userID, UserType userType);
	
}
