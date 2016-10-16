package vo;

public class PromotionVO {
	//	折扣率
	private double discount;
	//	折扣酒店
	private String hotelID;
	//	开始日期
	private String startDate;
	//	结束日期
	private String endDate;
	
	public PromotionVO(double discount, String hotelID, String startDate, String endDate) {
		super();
		this.discount = discount;
		this.hotelID = hotelID;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getHotelID() {
		return hotelID;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
