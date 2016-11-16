package vo;

import java.time.LocalDate;

import utilities.PromotionType;

public class HotelPromotionVO extends PromotionVO{

	//	折扣酒店编号
	public String hotelID;

	public HotelPromotionVO(PromotionType promotionType, String hotelID, double discount,
			LocalDate startDate, LocalDate endDate) {
		super(promotionType, discount, startDate, endDate);
		this.hotelID = hotelID;
	}

}
