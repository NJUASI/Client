package dataService.hotelDataService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import po.AddressPO;
import po.CheckInPO;
import po.CheckOutPO;
import po.EvaluationPO;
import po.HotelGeneralPO;
import po.HotelPO;
import po.RemainRoomInfoPO;
import po.RoomInfoPO;
import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;

public class HotelDataService_Stub implements HotelDataService  {
	
	
	public HotelPO getHotelInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResultMessage setHotelInfo(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public List<RoomInfoPO> getHotelRoomInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResultMessage setHotelRoomInfo(List<RoomInfoPO> list) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResultMessage setCheckInInfo(CheckInPO checkInInfo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage setCheckOutInfo(CheckOutPO checkOutInfo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public List<RemainRoomInfoPO> getRemainRoomInfo(String hotelID) {
		List<RemainRoomInfoPO> list = new ArrayList<RemainRoomInfoPO>();
		list.add(new RemainRoomInfoPO("12345678", RoomType.AMBASSADOR, 2, 200));
		return list;
	}

	
	public ResultMessage setRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage add(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}
	
	
	
	
	
	public List<HotelGeneralPO> getHotelList(AddressPO addressPO) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public HotelPO getHotelDetail(String hotelID) {
		return new HotelPO("12345678", "thisHotel", "NanJing", "center", "address", "4",
				5,123,"5", "good", "allEquipment");
	}

	
	public ResultMessage addEvaluation(EvaluationPO evaluationPO) {
		return ResultMessage.SUCCESS;
	}

}
