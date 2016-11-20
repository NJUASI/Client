package businessLogic.hotelBL;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.CheckInVO;
import vo.CheckOutVO;
import vo.EvaluationVO;
import vo.HotelVO;
import vo.RemainRoomInfoVO;
import vo.RoomInfoVO;

public class MockHotel extends Hotel {

	public MockHotel() {
		
	}
	
	
	@Override
	public HotelVO getHotelInfo(String hotelWorkerID) {
		return new HotelVO("12345678","thisHotel", "NanJing", "center", "address", "4" ,
				5,123 ,"5", "good", "allEquipment");
	}

	@Override
	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public Iterator<RoomInfoVO> getHotelRoomInfo(String hotelWorkerID) {
		List<RoomInfoVO> list = new LinkedList<RoomInfoVO>();
		list.add(new RoomInfoVO("12345678", RoomType.SINGLE_BED, 20, 200));
		list.add(new RoomInfoVO("12345678", RoomType.DOUBLE_BED, 15, 300));
		return list.iterator();
	}

	@Override
	public ResultMessage updateHotelRoomInfo(List<RoomInfoVO> list) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage updateCheckIn(CheckInVO checkInVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage updateCheckOut(CheckOutVO checkOutVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public Iterator<RemainRoomInfoVO> getRemainRoomInfo(String hotelWorkerID) {
		List<RemainRoomInfoVO> list = new LinkedList<RemainRoomInfoVO>();
		list.add(new RemainRoomInfoVO("12345678", RoomType.SINGLE_BED, 13, 200));
		list.add(new RemainRoomInfoVO("12345678", RoomType.DOUBLE_BED, 6, 300));
		return list.iterator();
	}

	@Override
	public ResultMessage updateRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(HotelVO hotelVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
		return ResultMessage.SUCCESS;
	}
}
