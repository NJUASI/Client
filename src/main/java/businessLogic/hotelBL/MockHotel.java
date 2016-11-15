package businessLogic.hotelBL;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import businessLogic.orderBL.MockOrder;
import businessLogic.orderBL.Order;
import businessLogic.promotionBL.MockPromotion;
import businessLogic.promotionBL.Promotion;
import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;
import utilities.SortStrategy;
import vo.AddressVO;
import vo.EvaluationVO;
import vo.HotelGeneralVO;
import vo.HotelVO;
import vo.PromotionVO;
import vo.RoomInfoVO;

/**
 * @author Harvey Gong
 *
 * 上午2:35:58
 */
public class MockHotel extends Hotel {


	private Promotion promotion;
	private Order order;
	
	public MockHotel() {
		promotion = new MockPromotion();
		order = new MockOrder();
	}
	
	
	@Override
	public HotelVO getHotelInfo(String hotelWorkerID) {
		return new HotelVO("12345678","thisHotel", "NanJing", "center", "address", "4" ,
				5, "5", "good", "allEquipment");
	}

	@Override
	public ResultMessage updateHotelInfo(HotelVO hotelVO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public List<RoomInfoVO> getHotelRoomInfo(String hotelWorkerID) {
		List<RoomInfoVO> list = new LinkedList<RoomInfoVO>();
		list.add(new RoomInfoVO("12345678", RoomType.SINGLEBED, 20, 200));
		list.add(new RoomInfoVO("12345678", RoomType.DOUBLEBED, 15, 300));
		return list;
	}

	@Override
	public ResultMessage updateHotelRoomInfo(List<RoomInfoVO> list) {
		return ResultMessage.SUCCESS;
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
	public List<RoomInfoVO> getRemainRoomInfo(String hotelWorkerID) {
		List<RoomInfoVO> list = new LinkedList<RoomInfoVO>();
		list.add(new RoomInfoVO("12345678", RoomType.SINGLEBED, 13, 200));
		list.add(new RoomInfoVO("12345678", RoomType.DOUBLEBED, 6, 300));
		return list;
	}

	@Override
	public ResultMessage updateRemainRoomInfo(Operation operation, Map<RoomType, Integer> roomInfo) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(HotelVO hotelVO) {
		return ResultMessage.SUCCESS;
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
		List<HotelGeneralVO> list = new ArrayList<HotelGeneralVO>();
		list.add(new HotelGeneralVO("12345678", "thisHotel","NanJing","center","4",5));
		list.add(new HotelGeneralVO("12345679", "thatHotel","NanJing","center","4",5));
		return list;
	}

	@Override
	public HotelVO getHotelDetail(String hotelID) {
		return new HotelVO("12345678","thisHotel", "NanJing", "center", "address", "4" ,
				5, "5", "good", "allEquipment");
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
	public List<PromotionVO> getPromotions(String hotelID) {
		// TODO Auto-generated method stub
		List<PromotionVO> list = new ArrayList<PromotionVO>();
		list= promotion.getPromotions(hotelID);
		return list;
	}
}