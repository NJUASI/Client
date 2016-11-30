package businessLogic.promotionBL.stub;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import vo.HotelFixedPromotionVO;
import vo.HotelPromotionVO;
import vo.WebPromotionVO;
import utilities.PreOrder;
import utilities.PromotionType;
import utilities.ResultMessage;
import utilities.UserType;
import vo.PromotionVO;
import vo.SpecialSpanPromotionVO;

public class PromotionBLService_Stub implements PromotionBLService{

	
	public PromotionBLService_Stub() {
		// TODO Auto-generated constructor stub
	}

	
	public ResultMessage update(List<PromotionVO> list) {
		// TODO Auto-generated method stub
		return  ResultMessage.SUCCESS;
	}

	
	public double getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return 0.8;
	}


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
		
		list.add(new WebPromotionVO(PromotionType.WEB_HOLIDAY, "ALL_CYCLE", 0.9, 
				LocalDate.of(2016, 11, 1), LocalDate.of(2016, 11, 15)));
		list.add(new WebPromotionVO(PromotionType.WEB__VIP_APPOINTED_CYCLE, "ALL_CYCLE", 0.95, 
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


	@Override
	public Iterator<HotelFixedPromotionVO> getHotelFixedPromotions(String hotelWorkerID) {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public Iterator<SpecialSpanPromotionVO> getSpecialSpanPromotions(String userID) {
		// TODO 自动生成的方法存根
		return null;
	}
	

}
