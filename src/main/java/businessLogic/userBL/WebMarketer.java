package businessLogic.userBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import dataService.webMarketerDataService.WebMarketerDataService;
import dataService.webMarketerDataService.WebMarketerDataService_Stub;
import po.WebMarketerPO;
import utilities.ResultMessage;
import utilities.UserType;
import vo.WebMarketerVO;
import vo.UserVO;

public class WebMarketer {

	// 营销人员的ID长度为6
	private static int IDLength = 6;

	private static UserType type = UserType.WEB_MARKETER;

	private WebMarketerDataService webMarketerDataService;

	public WebMarketer() {
		webMarketerDataService = new WebMarketerDataService_Stub();
	}

	public ResultMessage add(UserVO newUserVO) {

		ResultMessage msg = ResultMessage.USER_ADD_FAILURE;

		try {
			WebMarketerPO webMarketerPO = this.convert(newUserVO);
			msg = webMarketerDataService.add(webMarketerPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public ResultMessage modify(UserVO userVO) {

		ResultMessage msg = ResultMessage.USER_INFO_UPDATE_FAILURE;

		try {
			WebMarketerPO webMarketerPO = this.convert(userVO);
			msg = webMarketerDataService.modify(webMarketerPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public UserVO getSingle(String userID) {

		try {
			return this.convert(webMarketerDataService.getSingleWebMarketer(userID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<UserVO> getAll() {

		try {
			return this.convert(webMarketerDataService.getAllWebMarketer());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getLogInInfo(String userID) {

		try {
			return webMarketerDataService.getSingleWebMarketer(userID).getPassword();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean isWebMarketer(int length) {
		if (WebMarketer.IDLength == length) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWebMarketer(UserType type) {
		if (WebMarketer.type == type) {
			return true;
		} else {
			return false;
		}
	}

	private UserVO convert(WebMarketerPO webMarketerPO) {
		return new WebMarketerVO(webMarketerPO);
	}

	private WebMarketerPO convert(UserVO userVO) {
		return new WebMarketerPO((WebMarketerVO) userVO);
	}

	private List<UserVO> convert(List<WebMarketerPO> list) {
		List<UserVO> result = new ArrayList<UserVO>();
		for (int i = 0; i < list.size(); i++) {
			result.add(new WebMarketerVO(list.get(i)));
		}
		return result;
	}

}
