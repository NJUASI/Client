package businessLogicService.hotelBLService;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;
import utilities.SortStrategy;
import vo.AddressVO;
import vo.EvaluationVO;
import vo.HotelGeneralVO;
import vo.HotelVO;
import vo.RemainRoomInfoVO;
import vo.RoomInfoVO;

public interface HotelBLService {

	public List<HotelGeneralVO> getHotelList(AddressVO addressVO);
	public List<HotelGeneralVO> getSortedHotels(SortStrategy sortStrategy);
	public List<HotelGeneralVO> getBookedHotels(String userID);
	public HotelVO getHotelDetail(String hotelID);
	public List<HotelGeneralVO> getUncommentedHotels(String userID);
	public ResultMessage updateEvaluation(EvaluationVO evaluationVO);
	public HotelVO getHotelInfo(String userID);
	public ResultMessage updateHotelInfo (HotelVO hotelVO);
	public RoomInfoVO getHotelRoomInfo (String userID);
	public ResultMessage updateHotelRoomInfo (RoomInfoVO hotelRoomVO);
	public ResultMessage updateCheckIn (List<String> roomNum,Calendar inTime,Calendar predictedOutTime);
	public ResultMessage updateCheckOut (Calendar outTime);
	public RemainRoomInfoVO getRemainRoomInfo (String userID);
	public ResultMessage updateRemainRoomInfo (Operation operation, Map<RoomType, Integer> roomInfo);
	public ResultMessage add (HotelVO hotelVO);
	
}
