package po;

public final class HotelPO {
    //	æ∆µÍ±‡∫≈
	private String hotelID;
	//	æ∆µÍ√˚
	private String hotelName;
	//	æ∆µÍµÿ÷∑
	private String hotelAddress;
	//	æ∆µÍ≥« –
	private String city;
	//	æ∆µÍ–«º∂
	private String level;
	//	∆¿∑÷
	private int score;
	//	ºÚΩÈ
	private String introduction;	
	//	…Ë ©∑˛ŒÒ
	private String equipment;
	
	public HotelPO(String hotelID, String hotelName, String hotelAddress, String city, String level, int score,
			String introduction, String equipment) {
		super();
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.city = city;
		this.level = level;
		this.score = score;
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
	public String getHotelAddress() {
		return hotelAddress;
	}
	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
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
