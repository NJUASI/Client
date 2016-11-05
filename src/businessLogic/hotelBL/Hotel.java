package businessLogic.hotelBL;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

import businessLogic.promotionBL.Promotion;
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

public class Hotel{
	
	private Promotion promotion;
	
	public Hotel() {
		promotion = new Promotion();
	}

	public List<HotelGeneralVO> getHotelList(AddressVO addressVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HotelGeneralVO> getSortedHotels(SortStrategy sortStrategy) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HotelGeneralVO> getBookedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public HotelVO getHotelDetail(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<HotelGeneralVO> getUncommentedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public HotelVO getHotelInfo(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public RoomInfoVO getHotelRoomInfo(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateHotelRoomInfo(RoomInfoVO hotelRoomVO) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateCheckIn(List<String> roomNum, Calendar inTime, Calendar predictedOutTime) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateCheckOut(Calendar outTime) {
		// TODO Auto-generated method stub
		return null;
	}

	public RemainRoomInfoVO getRemainRoomInfo(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateRemainRoomInfo(Operation operation, Map<RoomType, Integer> roomInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage add(HotelVO hotelVO) {
		// TODO Auto-generated method stub
		return null;
	}
}


////	酒店编号
//String hotelID;
////	酒店名称
//String hotelName;
////	酒店城市
//String city;
////	酒店商圈
//String cycle;
////	酒店地址
//String hotelAddress;
////	酒店星级
//String level;
////	评分
//double score;
////	评价
//int comment;
////	简介
//String introduction;	
////	设施服务
//String equipment;
//
//public Hotel(String hotelID, String hotelName, String city, String cycle, String hotelAddress, String level,
//		double score, int comment, String introduction, String equipment) {
//	this.hotelID = hotelID;
//	this.hotelName = hotelName;
//	this.city = city;
//	this.cycle = cycle;
//	this.hotelAddress = hotelAddress;
//	this.level = level;
//	this.score = score;
//	this.comment = comment;
//	this.introduction = introduction;
//	this.equipment = equipment;
//}