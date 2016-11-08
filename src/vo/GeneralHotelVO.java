package vo;

public class GeneralHotelVO {
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

	public GeneralHotelVO(String hotelName, String city, String cycle, String level, double score) {
		this.hotelName = hotelName;
		this.city = city;
		this.cycle = cycle;
		this.level = level;
		this.score = score;
	}
}
