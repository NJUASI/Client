package businessLogicService.hotelBLService;

import java.util.List;
import java.util.Map;

import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;
import utilities.SortStrategy;
import vo.AddressVO;
import vo.CheckInVO;
import vo.CheckOutVO;
import vo.EvaluationVO;
import vo.HotelGeneralVO;
import vo.HotelVO;
import vo.RemainRoomInfoVO;
import vo.RoomInfoVO;

public interface HotelBLService {

	public HotelVO getHotelInfo (String hotelWorkerID);
	
	public ResultMessage updateHotelInfo (HotelVO hotelVO);

	public List<RoomInfoVO> getHotelRoomInfo (String hotelWorkerID);
	
	public ResultMessage updateHotelRoomInfo (List<RoomInfoVO> list);
	
	public ResultMessage updateCheckIn (CheckInVO checkInVO);
	
	public ResultMessage updateCheckOut (CheckOutVO checkOutVO);
	
	public List<RemainRoomInfoVO> getRemainRoomInfo (String hotelWorkerID);
	
	public ResultMessage updateRemainRoomInfo (String hotelID, Operation operation, 
			Map<RoomType, Integer> roomInfo);
	
	public ResultMessage add (HotelVO hotelVO);
	
	public List<HotelGeneralVO> getHotelList (AddressVO addressVO);
	
	public List<HotelGeneralVO> getSortedHotels (SortStrategy sortStrategy);
	
	public List<HotelGeneralVO> getBookedHotels (String userID);
	
	public List<HotelGeneralVO> getUncommentedHotels (String userID);
	
	public ResultMessage updateEvaluation (EvaluationVO evaluationVO);	
	
}
