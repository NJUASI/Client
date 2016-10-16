package po;

public class OrderGeneralPO {

	//		酒店名
	private String hotelName;
	//		酒店地址
	private String hotelAddress;
	//		预定价格
	private int price;
	//	最晚订单执行时间
	private String expectExecuteTime;	
	//	预计离开时间
	private String expectLeaveTime;	
	//		订单状态
	private String state;
	
	public OrderGeneralPO(String hotelName, String hotelAddress, int price, String expectExecuteTime, String expectLeaveTime,
			String state) {
		super();
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.price = price;
		this.expectExecuteTime = expectExecuteTime;
		this.expectLeaveTime = expectLeaveTime;
		this.state = state;
	}
	
	
	public String getHotelName() {
		return hotelName;
	}
	
	public String getHotelAddress() {
		return hotelAddress;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getExpectExecuteTime() {
		return expectExecuteTime;
	}


	public String getExpectLeaveTime() {
		return expectLeaveTime;
	}


	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
