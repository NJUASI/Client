package vo;

public class AddressVO {
	
	//	酒店名
	public String hotelName;
	
	//	酒店地址
	public String hotelAddress;
	
	//	酒店城市
	public String city;
	
	//	酒店商圈
	public String cycle;
	
	public AddressVO(String hotelName, String hotelAddress, String city, String cycle) {
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.city = city;
		this.cycle = cycle;
	}
}
