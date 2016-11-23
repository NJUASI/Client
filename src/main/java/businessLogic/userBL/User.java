package businessLogic.userBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import businessLogic.hotelBL.Hotel;
import dataService.guestDataService.GuestDataService;
import dataService.guestDataService.GuestDataService_Stub;
import dataService.hotelWorkerDataService.HotelWorkerDataService;
import dataService.hotelWorkerDataService.HotelWorkerDataService_Stub;
import dataService.webManagerDataService.WebManagerDataService;
import dataService.webManagerDataService.WebManagerDataService_Stub;
import dataService.webMarketerDataService.WebMarketerDataService;
import dataService.webMarketerDataService.WebMarketerDataService_Stub;
import po.CreditPO;
import po.GuestPO;
import po.HotelWorkerPO;
import po.WebManagerPO;
import po.WebMarketerPO;
import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.GuestVO;
import vo.HotelVO;
import vo.HotelWorkerVO;
import vo.UserVO;
import vo.WebManagerVO;
import vo.WebMarketerVO;

public class User {
	
	private GuestDataService guestDataService;
	private HotelWorkerDataService hotelWorkerDataService;
	private WebMarketerDataService webMarketerDataService;
	private WebManagerDataService webManagerDataService;
	
	public User() {
		guestDataService = new GuestDataService_Stub();
		hotelWorkerDataService = new HotelWorkerDataService_Stub();
		webMarketerDataService= new WebMarketerDataService_Stub();
		webManagerDataService = new WebManagerDataService_Stub();
	}
	
	public ResultMessage add(UserVO newUserVO) {
			try {
				if(newUserVO.userID.length()==10){//客户的ID长度为10
					GuestPO guestPO = new GuestPO((GuestVO)newUserVO);
					 return guestDataService.add(guestPO);
				}
				
				if(newUserVO.userID.length()==8){//酒店工作人员的ID长度为8
					HotelWorkerPO hotelWorkerPO = new HotelWorkerPO((HotelWorkerVO)newUserVO);
					 return hotelWorkerDataService.add(hotelWorkerPO);
				}	
				
				if(newUserVO.userID.length()==6){//营销人员的ID长度为6
					WebMarketerPO webMarketerPO = new WebMarketerPO((WebMarketerVO)newUserVO);
					 return webMarketerDataService.add(webMarketerPO);
				}	
				
				if(newUserVO.userID.length()==4){//网站管理人员的ID长度为4
					WebManagerPO webManagerPO = new WebManagerPO((WebManagerVO)newUserVO);
					 return webManagerDataService.add(webManagerPO);
				}	
			} catch (RemoteException e) {
				e.printStackTrace();
				return ResultMessage.USER_ADD_FAILURE;
			}
		return null;
	}

	public ResultMessage modify(UserVO userVO) {
		try {
			if(userVO.userID.length()==10){//客户的ID长度为10
				GuestPO guestPO = new GuestPO((GuestVO)userVO);
				 return guestDataService.modify(guestPO);
			}
			
			if(userVO.userID.length()==8){//酒店工作人员的ID长度为8
				HotelWorkerPO hotelWorkerPO = new HotelWorkerPO((HotelWorkerVO)userVO);
				 return hotelWorkerDataService.modify(hotelWorkerPO);
			}	
			
			if(userVO.userID.length()==6){//营销人员的ID长度为6
				WebMarketerPO webMarketerPO = new WebMarketerPO((WebMarketerVO)userVO);
				 return webMarketerDataService.modify(webMarketerPO);
			}	
			
			if(userVO.userID.length()==4){//网站管理人员的ID长度为4
				WebManagerPO webManagerPO = new WebManagerPO((WebManagerVO)userVO);
				 return webManagerDataService.modify(webManagerPO);
			}	
		} catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.USER_INFO_UPDATE_FAILURE;
		}
		return null;
	}

	public UserVO getSingle(String userID, UserType userType) {
		try {
			if(userType==UserType.GUEST){
				return new GuestVO(guestDataService.getSingleGuest(userID));
			}
				
			if(userType==UserType.HOTEL_WORKER){
				return new HotelWorkerVO(hotelWorkerDataService.getSingleHotelWorker(userID));
			}
				
			if(userType==UserType.WEB_MARKETER){
				return new WebMarketerVO(webMarketerDataService.getSingleWebMarketer(userID));
			}
				
			if(userType==UserType.WEB_MANAGER){
				return new WebManagerVO(webManagerDataService.getSingleWebManager(userID));
			}
				
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage addHotel(HotelVO newHotelVO, String hotelID) {
	    Hotel hotel = new Hotel();
	    
		if(hotel.getHotelInfo(hotelID)==null){
			return hotel.addHotel(newHotelVO);
		}
		else{
			return ResultMessage.HOTEL_EXIST;
		}
	}

	public ResultMessage modifyCredit(String guestID, float creditNum) {
		try {
			GuestPO guestPO =guestDataService.getSingleGuest(guestID);
			guestPO.setCredit(creditNum);
			return guestDataService.modify(guestPO);
		} catch (RemoteException e) {
			e.printStackTrace();
			return ResultMessage.FAIL;
		}
	}

	public List<UserVO> getAll(UserType userType) {
		try {
			if(userType==UserType.GUEST){
				return  this.convertGuest(guestDataService.getAllGuest());
			}
				
			if(userType==UserType.HOTEL_WORKER){
				return this.convertHotelWorker(hotelWorkerDataService.getAllHotelWorker());
			}
				
			if(userType==UserType.WEB_MARKETER){
				return this.convertWebMarketer(webMarketerDataService.getAllWebMarketer());
			}
				
			if(userType==UserType.WEB_MANAGER){
				return this.convertWebManager(webManagerDataService.getAllWebManager());
			}
				
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public List<CreditVO> getAllCreditDetail(String guestID) {
		List<CreditVO> result = new ArrayList<CreditVO>();
		try {
			List<CreditPO> list = guestDataService.getAllCreditDetail(guestID);
			for(int i=0;i<list.size();i++){
				result.add(new CreditVO(list.get(i)));
			}
			return result;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getLogInInfo(String userID, UserType userType) {
		try {
			if(userType==UserType.GUEST){
				return guestDataService.getSingleGuest(userID).getPassword();
			}
				
			if(userType==UserType.HOTEL_WORKER){
				return hotelWorkerDataService.getSingleHotelWorker(userID).getPassword();
			}
				
			if(userType==UserType.WEB_MARKETER){
				return webMarketerDataService.getSingleWebMarketer(userID).getPassword();
			}
				
			if(userType==UserType.WEB_MANAGER){
				return webManagerDataService.getSingleWebManager(userID).getPassword();
			}
		} catch (RemoteException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	private List<UserVO> convertGuest(List<GuestPO> list){
		List<UserVO> result = new ArrayList<UserVO>();
		for(int i=0;i<list.size();i++){
			result.add(new GuestVO(list.get(i)));
		}
		return result;
	}
	
	private List<UserVO> convertHotelWorker(List<HotelWorkerPO> list){
		List<UserVO> result = new ArrayList<UserVO>();
		for(int i=0;i<list.size();i++){
			result.add(new HotelWorkerVO(list.get(i)));
		}
		return result;
	}
	
	private List<UserVO> convertWebMarketer(List<WebMarketerPO> list){
		List<UserVO> result = new ArrayList<UserVO>();
		for(int i=0;i<list.size();i++){
			result.add(new WebMarketerVO(list.get(i)));
		}
		return result;
	}
	
	private List<UserVO> convertWebManager(List<WebManagerPO> list){
		List<UserVO> result = new ArrayList<UserVO>();
		for(int i=0;i<list.size();i++){
			result.add(new WebManagerVO(list.get(i)));
		}
		return result;
	}
	
}
