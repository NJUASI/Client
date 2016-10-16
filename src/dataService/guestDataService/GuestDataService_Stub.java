package dataService.guestDataService;

import po.GuestPO;
import po.MemberPO;
import utilities.ResultMessage;

public class GuestDataService_Stub implements GuestDataService{

	@Override
	public ResultMessage modifyMember(MemberPO memberPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage getSingle(String guestID) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage add(GuestPO newGuestPO) {
		return ResultMessage.SUCCESS;
	}

	@Override
	public ResultMessage modify(GuestPO guestPO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage init() {
		// TODO Auto-generated method stub
		return null;
	}

}
