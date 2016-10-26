package vo;

public class GeneralHotelVO {
	//	酒店名称
	private String hotelName;
	//	酒店城市
	private String city;
	//	酒店商圈
	private String cycle;
	//	酒店星级
	private String level;
	//	评分
	private int score;

	public GeneralHotelVO(String hotelName, String city, String cycle, String level, int score) {
		super();
		this.hotelName = hotelName;
		this.city = city;
		this.cycle = cycle;
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
	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
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
