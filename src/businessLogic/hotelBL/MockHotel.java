package businessLogic.hotelBL;

import java.util.ArrayList;
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

/**
 * @author Harvey Gong
 *
 * 上午2:35:58
 */
public class MockHotel extends Hotel {

	public MockHotel(String hotelID, String hotelName, String city, String cycle, String hotelAddress, String level,
			double score, int comment, String introduction, String equipment) {
		super(hotelID, hotelName, city, cycle, hotelAddress, level, score, comment, introduction, equipment);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public List<HotelGeneralVO> getHotelList(AddressVO addressVO) {
		ArrayList<HotelGeneralVO> list = new ArrayList<HotelGeneralVO>();
		list.add(new HotelGeneralVO("12345678", "thisHotel","NanJing","center","4",5));
		return list;
	}

	@Override
	public List<HotelGeneralVO> getSortedHotels(SortStrategy sortStrategy) {
		ArrayList<HotelGeneralVO> list = new ArrayList<HotelGeneralVO>();
		list.add(new HotelGeneralVO("12345678", "thisHotel","NanJing","center","4",5));
		return list;
	}

	@Override
	public List<HotelGeneralVO> getBookedHotels(String userID) {
		ArrayList<HotelGeneralVO> list = new ArrayList<HotelGeneralVO>();
		list.add(new HotelGeneralVO("12345678", "thisHotel","NanJing","center","4",5));
		return list;
	}

	@Override
	public HotelVO getHotelDetail(String hotelID) {
		return new HotelVO("12345678","thisHotel", "NanJing", "center", "address", "4" ,
				5, 5, "good", "allEquipment");
	}

	@Override
	public List<HotelGeneralVO> getUncommentedHotels(String userID) {
		ArrayList<HotelGeneralVO> list = new ArrayList<HotelGeneralVO>();
		list.add(new HotelGeneralVO("12345678", "thisHotel","NanJing","center","4",5));
		return list;
	}

	@Override
	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public HotelVO getHotelInfo(String userID) {
		return new HotelVO("12345678","thisHotel", "NanJing", "center", "address", "4" ,
				5, 5, "good", "allEquipment");
	}

	@Override
	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public RoomInfoVO getHotelRoomInfo(String userID) {
		return new RoomInfoVO("12345678", RoomType.SINGLEBED, 1, 100);
	}

	@Override
	public ResultMessage updateHotelRoomInfo(RoomInfoVO hotelRoomVO) {
		return ResultMessage.SUCCESS;
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
		return new RemainRoomInfoVO("12345678", RoomType.SINGLEBED, 1, 100);
	}

	@Override
	public ResultMessage updateRemainRoomInfo(Operation operation, Map<RoomType, Integer> roomInfo) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(HotelVO hotelVO) {
		return ResultMessage.SUCCESS;
	}
}
