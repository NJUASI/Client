package businessLogic.hotelBL;

import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dataService.hotelDataService.HotelDataService;
import dataService.hotelDataService.HotelDataService_Stub;
import po.HotelPO;
import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.CheckInVO;
import vo.CheckOutVO;
import vo.EvaluationVO;
import vo.HotelVO;
import vo.RemainRoomInfoVO;
import vo.RoomInfoVO;

public class MockHotel extends Hotel {
//	private HotelDataService hotelDataService;
//	private HotelPO hotelPO;
//	private String hotelID;
//	private Rooms rooms;
//	private Evaluations evaluations;
//
//	private void initMockHotel() {
//		initHotelDataService();
//		initHotelPO();
//		initRooms();
//		initEvaluations();
//	}

//	private void initEvaluations() {
//		evaluations = new Evaluations(hotelID,hotelDataService);
//	}
//
//	private void initRooms() {
//		rooms = new Rooms(hotelID,hotelDataService);
//	}
//
//	private void initHotelPO() {
//		try {
//			hotelPO = hotelDataService.getHotelInfo(hotelID);
//		} catch (RemoteException e) {
//			e.printStackTrace();
//		}
//	}
//
//	private void initHotelDataService() {
//		hotelDataService = new HotelDataService_Stub();
//	}
	
	
	public MockHotel(String hotelWorkerID){
		super(hotelWorkerID);
	}

	@Override
	public ResultMessage updateRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage addHotel(HotelVO hotelVO) {
		return ResultMessage.SUCCESS;
	}

}
