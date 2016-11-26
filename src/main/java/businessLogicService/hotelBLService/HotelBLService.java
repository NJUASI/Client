package businessLogicService.hotelBLService;

import java.util.Iterator;
import java.util.List;

import businessLogic.hotelBL.hotelScan.ScanStrategy;
import utilities.ResultMessage;
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
	
	public Iterator<EvaluationVO> getEvaluations (String hotelID);

	public ResultMessage updateEvaluation (EvaluationVO evaluationVO);	

	public Iterator<HotelGeneralVO> getHotels(ScanStrategy strategy);
	
	public Iterator<HotelGeneralVO> getBookedHotels();
	
}
