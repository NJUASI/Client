package utilities;

import java.io.Serializable;
import java.time.LocalDateTime;

import vo.OrderVO;

public class PreOrder implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8897463302658363464L;

	// 客户编号
	public String guestID;
	
	// 酒店编号
	public String hotelID;
	
	// 入住时间
	public LocalDateTime checkInTime;

	// 房间数
	public int roomNum;
	
	public PreOrder(OrderVO orderVO){
		this.guestID = orderVO.orderGeneralVO.guestID;
		this.hotelID=orderVO.orderGeneralVO.hotelID;
		this.checkInTime =orderVO.checkInTime;
		this.roomNum=orderVO.roomNumCount;
		
	}

}
