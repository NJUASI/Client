package dataService.guestDataService;

import po.GuestPO;
import po.MemberPO;
import utilities.ResultMessage;

public interface GuestDataService {

	public ResultMessage modifyMember(MemberPO memberPO);
	
	public ResultMessage getSingle (String guestID);
	
	public ResultMessage add(GuestPO newGuestPO);
	
	public ResultMessage modify (GuestPO guestPO);

	public ResultMessage init();
}
