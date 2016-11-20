package businessLogic.hotelBL.stub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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

public class HotelBLService_Stub implements HotelBLService{

	////酒店编号
	// String hotelID;
	////	酒店名称
	// String hotelName;
	////	酒店城市
	// String city;
	////	酒店商圈
	// String cycle;
	////	酒店地址
	// String hotelAddress;
	////	酒店星级
	// String level;
	////	评分
	// double score;
	////	评价
	// int comment;
	////	简介
	// String introduction;	
	////	设施服务
	// String equipment;


	public HotelBLService_Stub() {

	}


	public Iterator<HotelGeneralVO> getHotelList(AddressVO addressVO) {
		ArrayList<HotelGeneralVO> list = new ArrayList<HotelGeneralVO>();
		list.add(new HotelGeneralVO("12345678", "thisHotel","NanJing","center","4",5,123));
		list.add(new HotelGeneralVO("12345679", "thatHotel","NanJing","center","3",5,234));
		return list.iterator();
	}

	public Iterator<HotelGeneralVO> getBookedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public Iterator<HotelGeneralVO> getUncommentedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
		return ResultMessage.SUCCESS;
	}


	public HotelVO getHotelInfo(String userID) {
		return new HotelVO("12345678","thisHotel", "NanJing", "center", "address", "4" ,
				5,123, "5", "good", "allEquipment");
	}


	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		// TODO Auto-generated method stub
		return null;
	}


	public Iterator<RoomInfoVO> getHotelRoomInfo(String userID) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultMessage updateHotelRoomInfo(List<RoomInfoVO> list) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultMessage updateCheckIn(CheckInVO checkInVO) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultMessage updateCheckOut(CheckOutVO checkOutVO) {
		// TODO Auto-generated method stub
		return null;
	}


	public Iterator<RemainRoomInfoVO> getRemainRoomInfo(String userID) {
		List<RemainRoomInfoVO> list = new LinkedList<RemainRoomInfoVO>();
		list.add(new RemainRoomInfoVO("12345678", RoomType.SINGLE_BED, 13, 200));
		list.add(new RemainRoomInfoVO("12345678", RoomType.DOUBLE_BED, 6, 300));
		return list.iterator();
	}


	public ResultMessage updateRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultMessage add(HotelVO hotelVO) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Iterator<EvaluationVO> getEvaluations(String hotelID) {
		// TODO 自动生成的方法存根
		return null;
	}
}
