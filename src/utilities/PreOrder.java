package utilities;

import vo.OrderVO;

public class PreOrder {
	// 客户编号
	public String guestID;
	// 酒店编号
	public String hotelID;
	// 入住时间
	public String checkInTime;

	// 房间数
	public int roomNum;
	
	public PreOrder(OrderVO orderVO){
		this.guestID = orderVO.guestID;
		this.hotelID=orderVO.hotelID;
		this.checkInTime =orderVO.checkInTime;
		this.roomNum=orderVO.roomNum;
		
	}

}
