package businessLogic.userBL;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import dataService.webManagerDataService.WebManagerDataService;
import dataService.webManagerDataService.WebManagerDataService_Stub;
import po.WebManagerPO;
import utilities.ResultMessage;
import utilities.UserType;
import vo.UserVO;
import vo.WebManagerVO;

public class WebManager {

	// 网站管理人员的ID长度为4
	private static int IDLength = 4;

	private static UserType type = UserType.WEB_MANAGER;

	private WebManagerDataService webManagerDataService;

	public WebManager() {
		webManagerDataService = new WebManagerDataService_Stub();
	}

	public ResultMessage add(UserVO newUserVO) {

		ResultMessage msg = ResultMessage.USER_ADD_FAILURE;

		try {
			WebManagerPO webManagerPO = this.convert(newUserVO);
			msg = webManagerDataService.add(webManagerPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public ResultMessage modify(UserVO userVO) {

		ResultMessage msg = ResultMessage.USER_INFO_UPDATE_FAILURE;

		try {
			WebManagerPO webManagerPO = this.convert(userVO);
			msg = webManagerDataService.modify(webManagerPO);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return msg;
	}

	public UserVO getSingle(String userID) {

		try {
			return this.convert(webManagerDataService.getSingleWebManager(userID));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<UserVO> getAll() {

		try {
			return this.convert(webManagerDataService.getAllWebManager());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getLogInInfo(String userID) {

		try {
			return webManagerDataService.getSingleWebManager(userID).getPassword();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean isWebManager(int length) {
		if (WebManager.IDLength == length) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWebManager(UserType type) {
		if (WebManager.type == type) {
			return true;
		} else {
			return false;
		}
	}

	private UserVO convert(WebManagerPO webManagerPO) {
		return new WebManagerVO(webManagerPO);
	}

	private WebManagerPO convert(UserVO userVO) {
		return new WebManagerPO((WebManagerVO) userVO);
	}

	private List<UserVO> convert(List<WebManagerPO> list) {
		List<UserVO> result = new ArrayList<UserVO>();
		for (int i = 0; i < list.size(); i++) {
			result.add(new WebManagerVO(list.get(i)));
		}
		return result;
	}

}
