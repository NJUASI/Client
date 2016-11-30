package businessLogic.promotionBL;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import utilities.PreOrder;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.HotelPromotionVO;
import vo.WebPromotionVO;

public class MockPromotion extends Promotion {

	public Iterator<HotelPromotionVO> getHotelPromotions(String hotelWorkerID) {
		// TODO Auto-generated method stub
		List<HotelPromotionVO> list = new LinkedList<HotelPromotionVO>();
		
		list.add(new HotelPromotionVO(PromotionType.HOTEL_HOLIDAY, hotelWorkerID, 0.9, 
				LocalDate.of(2016, 11, 1), LocalDate.of(2016, 11, 15)));
		list.add(new HotelPromotionVO(PromotionType.HOTEL__ENTERPRISE, hotelWorkerID, 0.95, 
				LocalDate.of(2016, 7, 1), LocalDate.of(2016, 12, 31)));
		
		return list.iterator();	
	}

	public Iterator<WebPromotionVO> getWebPromotions() {
		// TODO Auto-generated method stub
		List<WebPromotionVO> list = new LinkedList<WebPromotionVO>();
		
		list.add(new WebPromotionVO(PromotionType.HOTEL_HOLIDAY, "ALL_CYCLE", 0.9, 
				LocalDate.of(2016, 11, 1), LocalDate.of(2016, 11, 15)));
		list.add(new WebPromotionVO(PromotionType.HOTEL__ENTERPRISE, "ALL_CYCLE", 0.95, 
				LocalDate.of(2016, 7, 1), LocalDate.of(2016, 12, 31)));
		
		return list.iterator();
	}

	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	public ResultMessage setWebPromotions(List<WebPromotionVO> list) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}
	
	public double getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return 0.8;
	}
	
}
