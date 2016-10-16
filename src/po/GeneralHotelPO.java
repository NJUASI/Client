package po;

public class GeneralHotelPO {
	//	酒店名称
	private String hotelName;
	//	酒店城市
	private String city;
	//	酒店星级
	private String level;
	//	评分
	private int score;

	public GeneralHotelPO(String hotelName, String city, String level, int score) {
		super();
		this.hotelName = hotelName;
		this.city = city;
		this.level = level;
		this.score = score;
	}
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	
}
