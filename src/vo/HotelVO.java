package vo;

public final class HotelVO {

	//	酒店编号 酒店名称 酒店城市 酒店商圈 酒店星级 评分
	public HotelGeneralVO hotelGeneralVO;
	
	//	酒店地址
	public String hotelAddress;
	
	//	评价
	public String comment;
	
	//	简介
	public String introduction;	
	
	//	设施服务
	public String equipment;
	
	public HotelVO(String hotelID, String hotelName, String city, String cycle, String hotelAddress, 
			String level, double score, String comment, String introduction, String equipment) {
		this.hotelGeneralVO = new HotelGeneralVO(hotelID, hotelName, city, cycle, level, score);
		
		this.hotelAddress = hotelAddress;
		this.comment = comment;
		this.introduction = introduction;
		this.equipment = equipment;
	}
	
	public HotelVO(HotelGeneralVO hotelGeneralVO, String hotelAddress, String comment, 
			String introduction, String equipment) {
		this.hotelGeneralVO = hotelGeneralVO;
		
		this.hotelAddress = hotelAddress;
		this.comment = comment;
		this.introduction = introduction;
		this.equipment = equipment;
	}
}
