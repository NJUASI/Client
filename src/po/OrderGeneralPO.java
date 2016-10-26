package po;

public class OrderGeneralPO {
	// 订单编号
	private String orderID;
	// 客户编号
	private String guestID;
	// 酒店编号
	private String hotelID;
	// 酒店名
	private String hotelName;
	// 酒店地址
	private String hotelAddress;
	// 预定价格
	private int price;
	// 最晚订单执行时间
	private String expectExecuteTime;
	// 预计离开时间
	private String expectLeaveTime;
	// 订单状态
	private String state;

	public OrderGeneralPO(String orderID, String guestID, String hotelID, String hotelName, String hotelAddress,
			int price, String expectExecuteTime, String expectLeaveTime, String state) {
		super();
		this.orderID = orderID;
		this.guestID = guestID;
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.price = price;
		this.expectExecuteTime = expectExecuteTime;
		this.expectLeaveTime = expectLeaveTime;
		this.state = state;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getGuestID() {
		return guestID;
	}

	public void setGuestID(String guestID) {
		this.guestID = guestID;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpectExecuteTime() {
		return expectExecuteTime;
	}

	public void setExpectExecuteTime(String expectExecuteTime) {
		this.expectExecuteTime = expectExecuteTime;
	}

	public String getExpectLeaveTime() {
		return expectLeaveTime;
	}

	public void setExpectLeaveTime(String expectLeaveTime) {
		this.expectLeaveTime = expectLeaveTime;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
