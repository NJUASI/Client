package businessLogic.hotelBL;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import businessLogicService.hotelBLService.HotelBLService;
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

public class HotelController implements HotelBLService {


	private Hotel hotel;
	private static HotelController hotelController;

	private HotelController() {
		//new the mock object
		hotel = new MockHotel();
	}

	public static HotelController getInstance(){
		if(hotelController == null){
			hotelController = new HotelController();
		}
		return hotelController;
	}


	public HotelVO getHotelInfo(String hotelWorkerID) {
		return hotel.getHotelInfo(hotelWorkerID);
	}

	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		return hotel.updateHotelInfo(hotelVO);
	}

	public Iterator<RoomInfoVO> getHotelRoomInfo(String hotelWorkerID) {
		return hotel.getHotelRoomInfo(hotelWorkerID);
	}

	public ResultMessage updateHotelRoomInfo(List<RoomInfoVO> list) {
		return hotel.updateHotelRoomInfo(list);
	}

	public ResultMessage updateCheckIn(CheckInVO checkInVO) {
		return hotel.updateCheckIn(checkInVO);
	}

	public ResultMessage updateCheckOut(CheckOutVO checkOutVO) {
		return hotel.updateCheckOut(checkOutVO);
	}

	public Iterator<RemainRoomInfoVO> getRemainRoomInfo(String hotelWorkerID) {
		return hotel.getRemainRoomInfo(hotelWorkerID);
	}

	public ResultMessage updateRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) {
		return hotel.updateRemainRoomInfo(hotelID, operation, roomInfo);
	}

	public ResultMessage addHotel(HotelVO hotelVO) {
		return hotel.addHotel(hotelVO);
	}

	public Iterator<HotelGeneralVO> getHotelList(AddressVO addressVO) {
		// TODO
		return null;
	}

	public Iterator<HotelGeneralVO> getBookedHotels(String userID) {
		// TODO
		return null;
	}

	public Iterator<HotelGeneralVO> getUncommentedHotels(String userID) {
		// TODO
		return null;
	}

	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
		return hotel.updateEvaluation(evaluationVO);
	}

	@Override
	public Iterator<EvaluationVO> getEvaluations(String hotelID) {
		return hotel.getEvaluations();
	}

}
