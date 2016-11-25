package vo;

import java.time.LocalDate;

import po.HotelPromotionPO;
import utilities.PromotionType;

public class HotelPromotionVO extends PromotionVO{

	//	折扣酒店编号
	public String hotelID;

	public HotelPromotionVO(PromotionType promotionType, String hotelID, double discount,
			LocalDate startDate, LocalDate endDate) {
		super(promotionType, discount, startDate, endDate);
		this.hotelID = hotelID;
	}

	public HotelPromotionVO(HotelPromotionPO hotelPromotionPO) {
		super();
		this.hotelID = hotelPromotionPO.getHotelID();
		this.promotionType = hotelPromotionPO.getPromotionType();
		this.discount = hotelPromotionPO.getDiscount();
		this.startDate = hotelPromotionPO.getStartDate();
		this.endDate = hotelPromotionPO.getEndDate();
	}

}
