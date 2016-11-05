package vo;

public class PromotionVO {
	//	折扣率
	public double discount;
	//	折扣酒店
	public String hotelID;
	//	开始日期
	public String startDate;
	//	结束日期
	public String endDate;
	
	public PromotionVO(double discount, String hotelID, String startDate, String endDate) {
		this.discount = discount;
		this.hotelID = hotelID;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
