package vo;

public class HotelWorkerVO {
	//	酒店编号
	private String hotelID;
	//	密码
	private String password;
	//	酒店名称
	private String hotelName;
	
	
	public HotelWorkerVO(String hotelID, String password) {
		super();
		this.hotelID = hotelID;
		this.password = password;
	}
	
	public HotelWorkerVO(String hotelID, String password, String hotelName) {
		super();
		this.hotelID = hotelID;
		this.password = password;
		this.hotelName = hotelName;
	}

	public String getHotelID() {
		return hotelID;
	}
//	public void setHotelID(String hotelID) {
//		this.hotelID = hotelID;
//	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
}
