package businessLogic.promotionBL.stub;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import businessLogicService.promotionBLService.PromotionBLService;
import vo.HotelPromotionVO;
import vo.WebPromotionVO;
import utilities.PreOrder;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.PromotionVO;

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


	public List<HotelPromotionVO> getHotelPromotions(String hotelWorkerID) {
		// TODO Auto-generated method stub
		List<HotelPromotionVO> list = new LinkedList<HotelPromotionVO>();
		
		list.add(new HotelPromotionVO(PromotionType.HOTEL__HOLIDAY, hotelWorkerID, 0.9, 
				LocalDate.of(2016, 11, 1), LocalDate.of(2016, 11, 15)));
		list.add(new HotelPromotionVO(PromotionType.HOTEL__ENTERPRISE, hotelWorkerID, 0.95, 
				LocalDate.of(2016, 7, 1), LocalDate.of(2016, 12, 31)));
		
		return list;
	}


	public List<WebPromotionVO> getWebPromotions() {
		// TODO Auto-generated method stub
		List<WebPromotionVO> list = new LinkedList<WebPromotionVO>();
		
		list.add(new WebPromotionVO(PromotionType.WEB__HOLIDAY, "ALL_CYCLE", 0.9, 
				LocalDate.of(2016, 11, 1), LocalDate.of(2016, 11, 15)));
		list.add(new WebPromotionVO(PromotionType.WEB__VIP_APPOINTED_CYCLE, "ALL_CYCLE", 0.95, 
				LocalDate.of(2016, 7, 1), LocalDate.of(2016, 12, 31)));
		
		return list;
	}


	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}


	public ResultMessage setWebPromotions(List<WebPromotionVO> list) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}
	

}
