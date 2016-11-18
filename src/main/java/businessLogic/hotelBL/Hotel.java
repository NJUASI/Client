package businessLogic.hotelBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataService.hotelDataService.HotelDataService;
import po.CheckInPO;
import po.CheckOutPO;
import po.EvaluationPO;
import po.HotelPO;
import po.RoomInfoPO;
import rmi.RemoteHelper;
import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;
import utilities.SortStrategy;
import vo.AddressVO;
import vo.CheckInVO;
import vo.CheckOutVO;
import vo.EvaluationVO;
import vo.HotelGeneralVO;
import vo.HotelVO;
import vo.RoomInfoVO;

public class Hotel{

	HotelDataService hotelDataService;

	public Hotel() {
		hotelDataService = RemoteHelper.getInstance().getHotelDataService();
	}

	public HotelVO getHotelInfo(String hotelWorkerID) {

		HotelPO hotelPO = null;
		HotelVO hotelVO = null;
		try {
			hotelPO = hotelDataService.getHotelInfo(hotelWorkerID);
			hotelVO = new HotelVO(hotelPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return hotelVO;
	}

	public ResultMessage updateHotelInfo(HotelVO hotelVO) {

		HotelPO hotelPO = new HotelPO(hotelVO);
		ResultMessage msg = null;
		try {
			msg = hotelDataService.add(hotelPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return msg;
	}

	public List<RoomInfoVO> getHotelRoomInfo(String hotelWorkerID) {
		List<RoomInfoVO> roomInfoVOList = new ArrayList<RoomInfoVO>();
		List<RoomInfoPO> roomInfoPOList = null;
		try {
			roomInfoPOList = hotelDataService.getHotelRoomInfo(hotelWorkerID);
			for(RoomInfoPO roomInfoPO: roomInfoPOList){
				roomInfoVOList.add(new RoomInfoVO(roomInfoPO));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return roomInfoVOList;
	}

	public ResultMessage updateHotelRoomInfo(List<RoomInfoVO> roomInfoVOList) {

		List<RoomInfoPO> roomInfoPOList = new ArrayList<RoomInfoPO>();
		for(RoomInfoVO roomInfoVO: roomInfoVOList){
			roomInfoPOList.add(new RoomInfoPO(roomInfoVO));
		}
		ResultMessage msg = null;
		try {
			msg = hotelDataService.setHotelRoomInfo(roomInfoPOList);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public ResultMessage updateCheckIn(CheckInVO checkInVO) {
		CheckInPO checkInPO = new CheckInPO(checkInVO);
		ResultMessage msg = null;
		try {
			msg = hotelDataService.setCheckInInfo(checkInPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public ResultMessage updateCheckOut(CheckOutVO checkOutVO) {
		CheckOutPO checkOutPO = new CheckOutPO(checkOutVO);
		ResultMessage msg = null;
		try {
			msg = hotelDataService.setCheckOutInfo(checkOutPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}
	
	public List<RoomInfoVO> getRemainRoomInfo(String hotelWorkerID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public ResultMessage updateRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage add(HotelVO hotelVO) {
		HotelPO hotelPO = new HotelPO(hotelVO);
		ResultMessage msg = null;
		try {
			msg = hotelDataService.add(hotelPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	
	public List<HotelGeneralVO> getHotelList(AddressVO addressVO) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<HotelGeneralVO> getSortedHotels(SortStrategy sortStrategy) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HotelGeneralVO> getBookedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public HotelVO getHotelDetail(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HotelGeneralVO> getUncommentedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
		EvaluationPO evaluationPO = new EvaluationPO(evaluationVO);
		
		return null;
	}
}


////	酒店编号
//String hotelID;
////	酒店名称
//String hotelName;
////	酒店城市
//String city;
////	酒店商圈
//String cycle;
////	酒店地址
//String hotelAddress;
////	酒店星级
//String level;
////	评分
//double score;
////	评价
//int comment;
////	简介
//String introduction;	
////	设施服务
//String equipment;
//
//public Hotel(String hotelID, String hotelName, String city, String cycle, String hotelAddress, String level,
//		double score, int comment, String introduction, String equipment) {
//	this.hotelID = hotelID;
//	this.hotelName = hotelName;
//	this.city = city;
//	this.cycle = cycle;
//	this.hotelAddress = hotelAddress;
//	this.level = level;
//	this.score = score;
//	this.comment = comment;
//	this.introduction = introduction;
//	this.equipment = equipment;
//}