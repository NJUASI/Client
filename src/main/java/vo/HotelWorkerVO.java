package vo;

public class HotelWorkerVO extends UserVO{
	
	//	酒店名称
	public String hotelName;
	
	public HotelWorkerVO(String hotelID, String password, String hotelName) {
		super(hotelID,password);
		this.hotelName = hotelName;
	}
}