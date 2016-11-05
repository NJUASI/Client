package businessLogic.hotelBL;

import java.time.LocalDateTime;
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
import vo.RoomInfoVO;

/**
 * @author Harvey Gong
 *
 * 上午2:35:25
 */
public class HotelController implements HotelBLService {

	
	private Hotel hotel;
	private static HotelController hotelController;
	
	private HotelController() {
		//new the mock object
		hotel = new MockHotel();
	}
	
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
	public HotelVO getHotelInfo(String hotelWorkerID) {
		return hotel.getHotelDetail(hotelWorkerID);
	}

	@Override
	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		return hotel.updateHotelInfo(hotelVO);
	}

	@Override
	public List<RoomInfoVO> getHotelRoomInfo(String hotelWorkerID) {
		return hotel.getHotelRoomInfo(hotelWorkerID);
	}

	@Override
	public ResultMessage updateHotelRoomInfo(List<RoomInfoVO> list) {
		return hotel.updateHotelRoomInfo(list);
	}

	@Override
	public ResultMessage updateCheckIn(String orderID, List<String> roomNum, LocalDateTime inTime, LocalDateTime expectedLeaveTime) {
		return hotel.updateCheckIn(orderID, roomNum, inTime, expectedLeaveTime);
	}

	@Override
	public ResultMessage updateCheckOut(String orderID, LocalDateTime outTime) {
		return hotel.updateCheckOut(orderID, outTime);
	}

	@Override
	public List<RoomInfoVO> getRemainRoomInfo(String hotelWorkerID) {
		return hotel.getRemainRoomInfo(hotelWorkerID);
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
