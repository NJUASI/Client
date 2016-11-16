package vo;

import java.time.LocalDate;

import utilities.PromotionType;

public class WebPromotionVO extends PromotionVO {

	//	指定商圈
	public String cycle;
	
	public WebPromotionVO(PromotionType promotionType, String cycle, double discount, 
			LocalDate startDate, LocalDate endDate) {
		super(promotionType, discount, startDate, endDate);
		this.cycle = cycle;
	}

}
