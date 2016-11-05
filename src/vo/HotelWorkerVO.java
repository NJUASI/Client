package vo;

public class HotelWorkerVO extends UserVO{
	//	酒店编号
	public String hotelID;
	//	密码
	public String password;
	//	酒店名称
	public String hotelName;
	
	
	public HotelWorkerVO(String hotelID, String password) {
		super(hotelID,password);
		this.hotelID = hotelID;
		this.password = password;
	}
	
	public HotelWorkerVO(String hotelID, String password, String hotelName) {
		super(hotelID,password);
		this.hotelID = hotelID;
		this.password = password;
		this.hotelName = hotelName;
	}
}