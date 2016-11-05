package vo;

public class HotelGeneralVO {
	//	酒店编号
	public String hotelID;
	//	酒店名称
	public String hotelName;
	//	酒店城市
	public String city;
	//	酒店商圈
	public String cycle;
	//	酒店星级
	public String level;
	//	评分
	public double score;
	
	public HotelGeneralVO(String hotelID, String hotelName, String city, String cycle, String level, int score) {
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.city = city;
		this.cycle = cycle;
		this.level = level;
		this.score = score;
	}
}
