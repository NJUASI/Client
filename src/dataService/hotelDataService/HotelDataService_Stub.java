package dataService.hotelDataService;

import po.CheckInPO;
import po.CheckOutPO;
import po.HotelPO;
import po.RemainRoomInfoPO;
import po.RoomInfoPO;
import utilities.RoomType;

public class HotelDataService_Stub implements HotelDataService  {

	@Override
	public HotelPO getHotelDetail(String hotelID) {
		// TODO Auto-generated method stub
		return new HotelPO("12345678", "thisHotel", "NanJing", "center", "address", "4",
				5,5, "good", "allEquipment");
	}

	@Override
	public HotelPO getHotelInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setHotelInfo(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RoomInfoPO getHotelRoomInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setHotelRoomInfo(RoomInfoPO hotelRoomInfoPO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setCheckInInfo(CheckInPO checkInInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean setCheckOutInfo(CheckOutPO checkOutInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RemainRoomInfoPO getRemainRoomInfo(String hotelID) {
		// TODO Auto-generated method stub
		return new RemainRoomInfoPO("12345678", RoomType.AMBASSADOR, 2, 200, "2016/2/2");
	}

	@Override
	public boolean setRemainRoomInfo(RemainRoomInfoPO remainRoomInfoPO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return false;
	}

}
