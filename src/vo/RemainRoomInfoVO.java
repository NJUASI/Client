package vo;

import utilities.RoomType;

public class RemainRoomInfoVO {

	// 酒店编号
	public String hotelID;
	// 房间类型
	public RoomType roomType;
	// 房间数
	public int roomNum;
	// 价格
	public int price;
	
	public RemainRoomInfoVO(String hotelID, RoomType roomType, int roomNum, int price) {
		this.hotelID = hotelID;
		this.roomType = roomType;
		this.roomNum = roomNum;
		this.price = price;
	}
}
