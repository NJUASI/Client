package vo;

public final class HotelVO {
	//	酒店编号
	public String hotelID;
	//	酒店名称
	public String hotelName;
	//	酒店城市
	public String city;
	//	酒店商圈
	public String cycle;
	//	酒店地址
	public String hotelAddress;
	//	酒店星级
	public String level;
	//	评分
	public double score;
	//	评价
	public int comment;
	//	简介
	public String introduction;	
	//	设施服务
	public String equipment;
	
	public HotelVO(String hotelID, String hotelName, String city, String cycle, String hotelAddress, String level,
			double score, int comment, String introduction, String equipment) {
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.city = city;
		this.cycle = cycle;
		this.hotelAddress = hotelAddress;
		this.level = level;
		this.score = score;
		this.comment = comment;
		this.introduction = introduction;
		this.equipment = equipment;
	}
}
