package dataService.hotelDataService;

import java.util.List;

import po.AddressPO;
import po.CheckInPO;
import po.CheckOutPO;
import po.EvaluationPO;
import po.HotelGeneralPO;
import po.HotelPO;
import po.RoomInfoPO;
import utilities.RoomType;

public class HotelDataService_Stub implements HotelDataService  {

	
	public List<HotelGeneralPO> getHotelList(AddressPO addressPO) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public HotelPO getHotelDetail(String hotelID) {
		// TODO Auto-generated method stub
		return new HotelPO("12345678", "thisHotel", "NanJing", "center", "address", "4",
				5,"5", "good", "allEquipment");
	}

	
	public boolean addEvaluation(EvaluationPO evaluationPO) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public HotelPO getHotelInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean setHotelInfo(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public RoomInfoPO getHotelRoomInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean setHotelRoomInfo(RoomInfoPO hotelRoomInfoPO) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean setCheckInInfo(CheckInPO checkInInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean setCheckOutInfo(CheckOutPO checkOutInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public RoomInfoPO getRemainRoomInfo(String hotelID) {
		// TODO Auto-generated method stub
		return new RoomInfoPO("12345678", RoomType.AMBASSADOR, 2, 200);
	}

	
	public boolean setRemainRoomInfo(RoomInfoPO remainRoomInfoPO) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean add(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
