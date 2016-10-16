package businessLogic.hotelBL;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import businessLogicService.hotelBLService.hotelBLService;
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

public class HotelBLService_Stub implements hotelBLService{

	
	
	
	@Override
	public List<HotelGeneralVO> getHotelList(AddressVO addressVO) {
		ArrayList<HotelGeneralVO> list = new ArrayList<HotelGeneralVO>();
		list.add(new HotelGeneralVO("thisHotel", "Nanjing", "Xinjiekou", "4", 8));
		return list;
	}

	@Override
	public List<HotelGeneralVO> getSortedHotels(SortStrategy sortStrategy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HotelGeneralVO> getBookedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HotelVO getHotelDetail(String hotelID) {
		return new HotelVO("00001111", "thisHotel", "Nanjing, China", "Nanjing", "xinjiekou", "4", 8, "Very good", "All eqipment");
	}

	@Override
	public List<HotelGeneralVO> getUncommentedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateEvaluation(EvaluationVO evaluationVO, float mark, String comment) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public HotelVO getHotelInfo(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoomInfoVO getHotelRoomInfo(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateHotelRoomInfo(RoomInfoVO hotelRoomVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateCheckIn(List<String> roomNum, Calendar inTime, Calendar predictedOutTime) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage updateCheckOut(Calendar outTime) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public RemainRoomInfoVO getRemainRoomInfo(String userID) {
		return new RemainRoomInfoVO(RoomType.SINGLEBED, 2, 200);
	}

	@Override
	public ResultMessage updateRemainRoomInfo(Operation operation, Map<RoomType, Integer> roomInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage add(HotelVO hotelVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
