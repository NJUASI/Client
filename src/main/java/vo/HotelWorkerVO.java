package vo;

import po.HotelWorkerPO;

public class HotelWorkerVO extends UserVO{
	
	//	酒店名称
	public String hotelName;
	
	public HotelWorkerVO(String hotelID, String password, String hotelName) {
		super(hotelID,password);
		this.hotelName = hotelName;
	}
	
	public HotelWorkerVO(HotelWorkerPO hotelWorkerPO) {
		super(hotelWorkerPO.getHotelID(),hotelWorkerPO.getPassword());
		this.hotelName = hotelWorkerPO.getHotelName();
	}
}