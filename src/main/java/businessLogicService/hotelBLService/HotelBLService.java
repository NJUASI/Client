package businessLogicService.hotelBLService;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;
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

	public Iterator<RoomInfoVO> getHotelRoomInfo (String hotelWorkerID);
	
	public ResultMessage updateHotelRoomInfo (List<RoomInfoVO> list);
	
	public ResultMessage updateCheckIn (CheckInVO checkInVO);
	
	public ResultMessage updateCheckOut (CheckOutVO checkOutVO);
	
	public Iterator<RemainRoomInfoVO> getRemainRoomInfo (String hotelWorkerID);
	
	public ResultMessage updateRemainRoomInfo (String hotelID, Operation operation, 
			Map<RoomType, Integer> roomInfo);
	
	public ResultMessage add (HotelVO hotelVO);
	
	public Iterator<HotelGeneralVO> getHotelList (AddressVO addressVO);
	
	public Iterator<HotelGeneralVO> getBookedHotels (String userID);
	
	public Iterator<HotelGeneralVO> getUncommentedHotels (String userID);
	
	public ResultMessage updateEvaluation (EvaluationVO evaluationVO);	
	
}
