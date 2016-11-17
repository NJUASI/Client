package rmi;

import java.rmi.Remote;

import dataService.guestDataService.GuestDataService;
import dataService.hotelDataService.HotelDataService;
import dataService.hotelWorkerDataService.HotelWorkerDataService;
import dataService.marketDataService.MarketDataService;
import dataService.orderDataService.OrderDataService;
import dataService.promotionDataService.PromotionDataService;
import dataService.webManagerDataService.WebManagerDataService;
import dataService.webMarketerDataService.WebMarketerDataService;

public class RemoteHelper {

	private Remote remote;
	private static RemoteHelper remoteHelper = new RemoteHelper();
	public static RemoteHelper getInstance(){
		return remoteHelper;
	}
	
	private RemoteHelper() {
	}
	
	public void setRemote(Remote remote){
		this.remote = remote;
	}
	
	public GuestDataService getGuestDataService(){
		return (GuestDataService)remote;
	}
	
	public HotelDataService getHotelDataService(){
		return (HotelDataService)remote;
	}
	
	public HotelWorkerDataService getHotelWorkerDataService(){
		return (HotelWorkerDataService)remote;
	}
	
	public MarketDataService getMarketDataService(){
		return (MarketDataService)remote;
	}
	
	public OrderDataService getOrderDataService(){
		return (OrderDataService)remote;
	}
	
	public PromotionDataService getPromotionDataService(){
		return (PromotionDataService)remote;
	}
	
	public WebManagerDataService getWebManagerDataService(){
		return (WebManagerDataService)remote;
	}
	
	public WebMarketerDataService getWebMarketerDataService(){
		return (WebMarketerDataService)remote;
	}
}
