package businessLogic.promotionBL.discountCalculation;

import java.time.LocalDate;

import businessLogic.promotionBL.discountCalculation.discountOfPromotions.EnterpriseMemberDiscount;
import businessLogic.promotionBL.discountCalculation.discountOfPromotions.ThreeAndAboveDiscount;
import businessLogic.promotionBL.discountCalculation.discountOfPromotions.VIPBirthdayDiscount;
import utilities.PreOrder;
import vo.HotelFixedPromotionVO;

/**
 * @Description:创建酒店无特定期间的促销策略的工厂
 * @author:Harvey Gong
 * @time:2016年12月1日 下午3:20:15
 */
public class HotelFixedDiscountFactory {

	PreOrder preOrder;
	LocalDate today;
	

	public HotelFixedDiscountFactory(PreOrder preOrder, LocalDate today) {
		this.preOrder = preOrder;
		this.today = today;
	}

	public CalculateDiscount createCalculateDiscount(HotelFixedPromotionVO promotionVO){
		switch(promotionVO.promotionType){
		case HOTEL__BIRTHDAY:
			return new VIPBirthdayDiscount(promotionVO.discount,preOrder.guestID,today);
		case HOTEL__ROOM_NUM_COUNT_BIGGER_THAN_THREE:
			return new ThreeAndAboveDiscount(promotionVO.discount,preOrder.roomNum);
		case HOTEL__ENTERPRISE:
			return new EnterpriseMemberDiscount(promotionVO.discount,preOrder.guestID);
		default:
			return null;
		}
	}
	
}
