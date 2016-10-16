package vo;

public class RemainRoomInfoVO {
	//	房间类型
	private String roomType;
	//	房间数
	private int roomNum;
	//	价格
	private int price;
	
	public RemainRoomInfoVO(String roomType, int roomNum, int price) {
		super();
		this.roomType = roomType;
		this.roomNum = roomNum;
		this.price = price;
	}
	
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
