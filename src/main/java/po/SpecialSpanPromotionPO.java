package po;

import java.time.LocalDate;

import utilities.PromotionType;
import vo.SpecialSpanPromotionVO;

public class SpecialSpanPromotionPO {

	private String userID;
	private PromotionType promotionType;
	private double discount;
	private LocalDate startDay;
	private LocalDate endDay;
	
	public SpecialSpanPromotionPO(SpecialSpanPromotionVO specialSpanPromotionVO) {
		this.userID = specialSpanPromotionVO.userID;
		this.promotionType = specialSpanPromotionVO.promotionType;
		this.discount = specialSpanPromotionVO.discount;
		this.startDay = specialSpanPromotionVO.startDay;
		this.endDay = specialSpanPromotionVO.endDay;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public PromotionType getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(PromotionType promotionType) {
		this.promotionType = promotionType;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public LocalDate getStartDay() {
		return startDay;
	}

	public void setStartDay(LocalDate startDay) {
		this.startDay = startDay;
	}

	public LocalDate getEndDay() {
		return endDay;
	}

	public void setEndDay(LocalDate endDay) {
		this.endDay = endDay;
	}

}
