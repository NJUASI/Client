package businessLogicService.hotelBLService;

import java.time.LocalDateTime;
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
import vo.PromotionVO;
import vo.RoomInfoVO;

public interface HotelBLService {

	public HotelVO getHotelInfo (String hotelWorkerID);
	
	public ResultMessage updateHotelInfo (HotelVO hotelVO);

	public List<RoomInfoVO> getHotelRoomInfo (String hotelWorkerID);
	
	public ResultMessage updateHotelRoomInfo (List<RoomInfoVO> list);
	
	public ResultMessage updateCheckIn (String orderID, List<String> roomNum, LocalDateTime inTime, LocalDateTime expectedLeaveTime);
	
	public ResultMessage updateCheckOut (String orderID, LocalDateTime outTime);
	
	public List<RoomInfoVO> getRemainRoomInfo (String hotelWorkerID);
	
	public ResultMessage updateRemainRoomInfo (Operation operation, Map<RoomType, Integer> roomInfo);
	
	public ResultMessage add (HotelVO hotelVO);
	
	
	
	public List<HotelGeneralVO> getHotelList (AddressVO addressVO);
	
	public List<HotelGeneralVO> getSortedHotels (SortStrategy sortStrategy);
	
	public List<HotelGeneralVO> getBookedHotels (String userID);
	
	public HotelVO getHotelDetail (String hotelID);
	
	public List<HotelGeneralVO> getUncommentedHotels (String userID);
	
	public ResultMessage updateEvaluation (EvaluationVO evaluationVO);	
	
}
