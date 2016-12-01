package vo;

import java.time.LocalDate;

import po.SpecialSpanPromotionPO;
import utilities.PromotionType;

public class SpecialSpanPromotionVO{

	public String userID;
	public PromotionType promotionType;
	public double discount;
	public LocalDate startDate;
	public LocalDate endDate;
	
	public SpecialSpanPromotionVO(SpecialSpanPromotionPO specialSpanPromotionVO) {
		this.userID = specialSpanPromotionVO.getUserID();
		this.promotionType = specialSpanPromotionVO.getPromotionType();
		this.discount = specialSpanPromotionVO.getDiscount();
		this.startDate = specialSpanPromotionVO.getStartDate();
		this.endDate = specialSpanPromotionVO.getEndDate();
	}

}
