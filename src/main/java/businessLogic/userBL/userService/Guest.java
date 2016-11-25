package businessLogic.userBL.userService;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import businessLogic.userBL.userService.service.CreditService;
import businessLogic.userBL.userService.service.UserService;
import dataService.guestDataService.GuestDataService;
import dataService.guestDataService.GuestDataService_Stub;
import po.CreditPO;
import po.GuestPO;
import utilities.ResultMessage;
import utilities.UserType;
import vo.CreditVO;
import vo.GuestVO;
import vo.UserVO;

public class Guest implements UserService ,CreditService{

	// 客户的ID长度为10
	private static int IDLength = 10;

	private static UserType type = UserType.GUEST;

	private GuestDataService guestDataService;

	public Guest() {
		guestDataService = new GuestDataService_Stub();
	}

	public ResultMessage add(UserVO newUserVO) {

		ResultMessage msg = ResultMessage.USER_ADD_FAILURE;

		try {
			GuestPO guestPO = this.convert(newUserVO);
			msg = guestDataService.add(guestPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public ResultMessage modify(UserVO userVO) {

		ResultMessage msg = ResultMessage.USER_INFO_UPDATE_FAILURE;

		try {
			GuestPO guestPO = this.convert(userVO);
			msg = guestDataService.modify(guestPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public UserVO getSingle(String userID) {

		try {
			return this.convert(guestDataService.getSingleGuest(userID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<UserVO> getAll() {

		try {
			return this.convert(guestDataService.getAllGuest());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getLogInInfo(String userID) {

		try {
			return guestDataService.getSingleGuest(userID).getPassword();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ResultMessage modifyCredit(String guestID, float creditNum) {

		ResultMessage msg = ResultMessage.FAIL;

		try {
			GuestPO guestPO = guestDataService.getSingleGuest(guestID);
			guestPO.setCredit(creditNum);
			msg = guestDataService.modify(guestPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public List<CreditVO> getAllCreditDetail(String guestID) {

		List<CreditVO> result = new ArrayList<CreditVO>();

		try {
			List<CreditPO> list = guestDataService.getAllCreditDetail(guestID);
			for (int i = 0; i < list.size(); i++) {
				result.add(new CreditVO(list.get(i)));
			}
			return result;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static boolean isGuest(int length) {
		if (Guest.IDLength == length) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isGuest(UserType type) {
		if (Guest.type == type) {
			return true;
		} else {
			return false;
		}
	}

	private UserVO convert(GuestPO guestPO) {
		return new GuestVO(guestPO);
	}

	private GuestPO convert(UserVO userVO) {
		return new GuestPO((GuestVO) userVO);
	}

	private List<UserVO> convert(List<GuestPO> list) {
		List<UserVO> result = new ArrayList<UserVO>();
		for (int i = 0; i < list.size(); i++) {
			result.add(new GuestVO(list.get(i)));
		}
		return result;
	}

}
