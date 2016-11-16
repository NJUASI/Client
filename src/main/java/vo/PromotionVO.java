package vo;

import java.time.LocalDate;

import utilities.PromotionType;

public abstract class PromotionVO {

	//	折扣类型
	public PromotionType promotionType;
	
	//	折扣率
	public double discount;
	
	//	开始日期
	public LocalDate startDate;
	
	//	结束日期
	public LocalDate endDate;
	
	public PromotionVO(PromotionType promotionType, double discount, 
			LocalDate startDate, LocalDate endDate) {
		this.promotionType = promotionType;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
