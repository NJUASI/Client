package vo;

public final class HotelVO {
	//	酒店编号
	private String hotelID;
	//	酒店名称
	private String hotelName;
	//	酒店城市
	private String city;
	//	酒店商圈
	private String cycle;
	//	酒店地址
	private String hotelAddress;
	//	酒店星级
	private String level;
	//	评分
	private double score;
	//	评价
	private int comment;
	//	简介
	private String introduction;	
	//	设施服务
	private String equipment;
	public HotelVO(String hotelID, String hotelName, String city, String cycle, String hotelAddress, String level,
			double score, int comment, String introduction, String equipment) {
		super();
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
	public String getHotelID() {
		return hotelID;
	}
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
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
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public double getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getComment() {
		return comment;
	}
	public void setComment(int comment) {
		this.comment = comment;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	
}
