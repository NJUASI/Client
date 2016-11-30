package businessLogic.promotionBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dataService.promotionDataService.PromotionDataService;
import dataService.promotionDataService.PromotionDataService_Stub;
import po.HotelPromotionPO;
import po.WebPromotionPO;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.HotelFixedPromotionVO;
import vo.HotelPromotionVO;
import vo.SpecialSpanPromotionVO;
import vo.WebPromotionVO;

public class Promotion{

	private PromotionDataService promotionDataService;
	private List<HotelPromotionPO> hotelPromotionPOList;
	private List<WebPromotionPO> webPromotionPOList;
	private HotelFixedPromotion hotelFixedPromotion;
	private SpecialSpanPromotion specialSpanPromotion;

	public Promotion() {
		promotionDataService = new PromotionDataService_Stub();
		hotelFixedPromotion = new HotelFixedPromotion();
		specialSpanPromotion = new SpecialSpanPromotion();
	}



	public Iterator<HotelPromotionVO> getHotelPromotions(String hotelWorkerID) {
		List<HotelPromotionVO> hotelPromotionList = new ArrayList<HotelPromotionVO>();
		try {
			hotelPromotionPOList = promotionDataService.getHotelPromotions(hotelWorkerID);
			for(HotelPromotionPO hotelPromotionPO: hotelPromotionPOList){
				hotelPromotionList.add(new HotelPromotionVO(hotelPromotionPO));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return hotelPromotionList.iterator();
	}

	public ResultMessage setHotelPromotions(String hotelWorkerID, List<HotelPromotionVO> list) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	public Iterator<WebPromotionVO> getWebPromotions() {
		List<WebPromotionVO> webPromotionList = new ArrayList<WebPromotionVO>();
		try {
			webPromotionPOList = promotionDataService.getWebPromotions();
			for(WebPromotionPO webPromotionPO: webPromotionPOList){
				webPromotionList.add(new WebPromotionVO(webPromotionPO));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return webPromotionList.iterator();
	}

	public ResultMessage setWebPromotions(List<WebPromotionVO> list) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	//新添加的方法
	
	public Iterator<HotelFixedPromotionVO> getHotelFixedPromotions(String hotelWorkerID){
		return hotelFixedPromotion.getHotelFixedPromotions(hotelWorkerID);
	}
	
	public Iterator<SpecialSpanPromotionVO> getSpecialSpanPromotions(String userID){
		return specialSpanPromotion.getSpecialSpanPromotions(userID);
	}
	
	public double getDiscout(PreOrder preOrder) {
		// TODO Auto-generated method stub
		return 0;
	}

}
