package businessLogicService.hotelBLService;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import utilities.ResultMessage;

public interface hotelBLService {
	public List<hotelGeneralVO> getHotelList(AddressVO addressVO);
	public List<hotelGeneralVO> getSortedHotels(SortStrategy sortStrategy);
	public List<hotelGeneralVO> getBookedHotels(String userID);
	public hotelVO getHotelDetail(String hotelID);
	public List<hotelGeneralVO> getUncommentedHotels(String userID);
	public ResultMessage updateEvaluation(EvaluationVO evaluationVO, float mark,String comment);
	public hotelVO getHotelInfo(String userID);
	public ResultMessage updateHotelInfo (hotelVO hotelVO);
	public hotelRoomVO getHotelRoomInfo (String userID);
	public ResultMessage updateHotelRoomInfo (hotelRoomVO hotelRoomVO);
	public ResultMessage updateCheckIn (List<String> roomNum,Calendar inTime,Calendar predictedOutTime);
	public ResultMessage updateCheckOut (Calendar outTime);
	public RemainRoomInfoVO getRemainRoomInfo (String userID);
	public ResultMessage updateRemainRoomInfo (Operation operation, Map<RoomType, Integer> roomInfo);
	public add (HotelInfo hotelInfo);
	
	

	

}
