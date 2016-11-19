package businessLogic.hotelBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataService.hotelDataService.HotelDataService;
import dataService.hotelDataService.HotelDataService_Stub;
import po.AddressPO;
import po.CheckInPO;
import po.CheckOutPO;
import po.EvaluationPO;
import po.HotelGeneralPO;
import po.HotelPO;
import po.RemainRoomInfoPO;
import po.RoomInfoPO;
import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.AddressVO;
import vo.CheckInVO;
import vo.CheckOutVO;
import vo.EvaluationVO;
import vo.HotelGeneralVO;
import vo.HotelVO;
import vo.RemainRoomInfoVO;
import vo.RoomInfoVO;

public class Hotel{

	private HotelDataService hotelDataService;
	private List<HotelGeneralVO> currentHotelGeneralList;

	public Hotel() {

	}

	public Hotel(AddressVO addressVO) {
		hotelDataService = new HotelDataService_Stub();
		currentHotelGeneralList = this.getHotelList(addressVO);
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

	public List<RemainRoomInfoVO> getRemainRoomInfo(String hotelWorkerID) {

		List<RemainRoomInfoVO> remainRoomInfoVOList = new ArrayList<RemainRoomInfoVO>();
		List<RemainRoomInfoPO> remainRoomInfoPOList = null;
		try {
			remainRoomInfoPOList = hotelDataService.getRemainRoomInfo(hotelWorkerID);
			for(RemainRoomInfoPO RemainRoomInfoPO: remainRoomInfoPOList){
				remainRoomInfoVOList.add(new RemainRoomInfoVO(RemainRoomInfoPO));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return remainRoomInfoVOList;
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
		List<HotelGeneralVO> hotelGeneralVOList = new ArrayList<HotelGeneralVO>();
		AddressPO addressPO = new AddressPO(addressVO);
		List<HotelGeneralPO> hotelGeneralPOList = null;

		try {
			hotelGeneralPOList = hotelDataService.getHotelList(addressPO);
			for(HotelGeneralPO hotelGeneralPO:hotelGeneralPOList){
				hotelGeneralVOList.add(new HotelGeneralVO(hotelGeneralPO));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return hotelGeneralVOList;
	}

	public List<HotelGeneralVO> getBookedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<HotelGeneralVO> getUncommentedHotels(String userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResultMessage updateEvaluation(EvaluationVO evaluationVO) {
		EvaluationPO evaluationPO = new EvaluationPO(evaluationVO);
		ResultMessage msg = null;
		try {
			msg = hotelDataService.addEvaluation(evaluationPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}
}