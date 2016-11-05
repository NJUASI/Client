package vo;

public class GeneralOrderVO {

	//		酒店名
	public String hotelName;
	//		酒店地址
	public String hotelAddress;
	//		预定价格
	public int price;
	//	最晚订单执行时间
	public String expectExecuteTime;	
	//	预计离开时间
	public String expectLeaveTime;	
	//		订单状态
	public String state;
	
	public GeneralOrderVO(String hotelName, String hotelAddress, int price, String expectExecuteTime, String expectLeaveTime,
			String state) {
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.price = price;
		this.expectExecuteTime = expectExecuteTime;
		this.expectLeaveTime = expectLeaveTime;
		this.state = state;
	}
}
