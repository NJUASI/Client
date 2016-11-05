package businessLogic.hotelBL;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import businessLogicService.hotelBLService.HotelBLService;
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
 * 上午2:35:25
 */
public class HotelController implements HotelBLService {

	
	public Hotel hotel;
	
	private static HotelController hotelController;
	
	//new the mock object
	private HotelController() {
		hotel = new MockHotel();
	}
	
	/**
	 * @return 返回HotelController对象，单例
	 */
	public static HotelController getInstance(){
		if(hotelController == null) hotelController = new HotelController();
		return hotelController;
	}
	
	
	@Override
	public List<HotelGeneralVO> getHotelList(AddressVO addressVO) {
		return hotel.getHotelList(addressVO);
	}

	@Override
	public List<HotelGeneralVO> getSortedHotels(SortStrategy sortStrategy) {
		return hotel.getSortedHotels(sortStrategy);
	}

	@Override
	public List<HotelGeneralVO> getBookedHotels(String userID) {
		return hotel.getBookedHotels(userID);
	}

	@Override
	public HotelVO getHotelDetail(String hotelID) {
		return hotel.getHotelDetail(hotelID);
	}

	@Override
	public List<HotelGeneralVO> getUncommentedHotels(String userID) {
		return hotel.getUncommentedHotels(userID);
	}

	@Override
	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
		return hotel.updateEvaluation(evaluationVO);
	}

	@Override
	public HotelVO getHotelInfo(String userID) {
		return hotel.getHotelDetail(userID);
	}

	@Override
	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		return hotel.updateHotelInfo(hotelVO);
	}

	@Override
	public RoomInfoVO getHotelRoomInfo(String userID) {
		return hotel.getHotelRoomInfo(userID);
	}

	@Override
	public ResultMessage updateHotelRoomInfo(RoomInfoVO hotelRoomVO) {
		return hotel.updateHotelRoomInfo(hotelRoomVO);
	}

	@Override
	public ResultMessage updateCheckIn(List<String> roomNum, Calendar inTime, Calendar predictedOutTime) {
		return hotel.updateCheckIn(roomNum, inTime, predictedOutTime);
	}

	@Override
	public ResultMessage updateCheckOut(Calendar outTime) {
		return hotel.updateCheckOut(outTime);
	}

	@Override
	public RemainRoomInfoVO getRemainRoomInfo(String userID) {
		return hotel.getRemainRoomInfo(userID);
	}

	@Override
	public ResultMessage updateRemainRoomInfo(Operation operation, Map<RoomType, Integer> roomInfo) {
		return hotel.updateRemainRoomInfo(operation, roomInfo);
	}

	@Override
	public ResultMessage add(HotelVO hotelVO) {
		return hotel.add(hotelVO);
	}

}
