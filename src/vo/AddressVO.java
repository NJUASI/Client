package vo;

public class AddressVO {
	//	酒店名
	private String hotelName;
	//	酒店地址
	private String hotelAddress;
	//	酒店城市
	private String city;
	//	酒店商圈
	private String cycle;
	
	public AddressVO(String hotelName, String hotelAddress, String city, String cycle) {
		super();
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.city = city;
		this.cycle = cycle;
	}
	
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
}
