package businessLogic.hotelBL.stub;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
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

public class HotelBLService_Stub implements HotelBLService{

////	酒店编号
//	 String hotelID;
//	//	酒店名称
//	 String hotelName;
//	//	酒店城市
//	 String city;
//	//	酒店商圈
//	 String cycle;
//	//	酒店地址
//	 String hotelAddress;
//	//	酒店星级
//	 String level;
//	//	评分
//	 double score;
//	//	评价
//	 int comment;
//	//	简介
//	 String introduction;	
//	//	设施服务
//	 String equipment;
	
	
	public HotelBLService_Stub() {
		
	}
	
	@Override
	public List<HotelGeneralVO> getHotelList(AddressVO addressVO) {
		ArrayList<HotelGeneralVO> list = new ArrayList<HotelGeneralVO>();
		list.add(new HotelGeneralVO("12345678", "thisHotel","NanJing","center","4",5));
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
		return new HotelVO("12345678","thisHotel", "NanJing", "center", "address", "4" ,
				5, 5, "good", "allEquipment");
	}

	@Override
	public List<HotelGeneralVO> getUncommentedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
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
	public List<RoomInfoVO> getHotelRoomInfo(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateHotelRoomInfo(List<RoomInfoVO> list) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage updateCheckIn(String orderID, List<String> roomNum, LocalDateTime inTime, LocalDateTime expectedLeaveTime) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage updateCheckOut(String orderID, LocalDateTime outTime) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public List<RoomInfoVO> getRemainRoomInfo(String userID) {
		List<RoomInfoVO> list = new LinkedList<RoomInfoVO>();
		list.add(new RoomInfoVO("12345678", RoomType.SINGLEBED, 13, 200));
		list.add(new RoomInfoVO("12345678", RoomType.DOUBLEBED, 6, 300));
		return list;
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
