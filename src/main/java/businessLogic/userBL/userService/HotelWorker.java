package businessLogic.userBL.userService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import businessLogic.userBL.userService.service.UserService;
import dataService.hotelWorkerDataService.HotelWorkerDataService;
import dataService.hotelWorkerDataService.HotelWorkerDataService_Stub;
import po.HotelWorkerPO;
import utilities.ResultMessage;
import utilities.UserType;
import vo.HotelWorkerVO;
import vo.UserVO;

public class HotelWorker implements UserService{

	// 酒店工作人员的ID长度为8
	private static int IDLength = 8;

	private static UserType type = UserType.HOTEL_WORKER;

	private HotelWorkerDataService hotelWorkerDataService;

	public HotelWorker() {
		hotelWorkerDataService = new HotelWorkerDataService_Stub();
	}

	public ResultMessage add(UserVO newUserVO) {

		ResultMessage msg = ResultMessage.USER_ADD_FAILURE;

		try {
			HotelWorkerPO hotelWorkerPO = this.convert(newUserVO);
			msg = hotelWorkerDataService.add(hotelWorkerPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public ResultMessage modify(UserVO userVO) {

		ResultMessage msg = ResultMessage.USER_INFO_UPDATE_FAILURE;

		try {
			HotelWorkerPO hotelWorkerPO = this.convert(userVO);
			msg = hotelWorkerDataService.modify(hotelWorkerPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public UserVO getSingle(String userID) {

		try {
			return this.convert(hotelWorkerDataService.getSingleHotelWorker(userID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<UserVO> getAll() {

		try {
			return this.convert(hotelWorkerDataService.getAllHotelWorker());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getLogInInfo(String userID) {

		try {
			return hotelWorkerDataService.getSingleHotelWorker(userID).getPassword();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean isHotelWorker(int length) {
		if (HotelWorker.IDLength == length) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isHotelWorker(UserType type) {
		if (HotelWorker.type == type) {
			return true;
		} else {
			return false;
		}
	}

	private UserVO convert(HotelWorkerPO hotelWorkerPO) {
		return new HotelWorkerVO(hotelWorkerPO);
	}

	private HotelWorkerPO convert(UserVO userVO) {
		return new HotelWorkerPO((HotelWorkerVO) userVO);
	}

	private List<UserVO> convert(List<HotelWorkerPO> list) {
		List<UserVO> result = new ArrayList<UserVO>();
		for (int i = 0; i < list.size(); i++) {
			result.add(new HotelWorkerVO(list.get(i)));
		}
		return result;
	}

}
