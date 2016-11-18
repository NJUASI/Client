package dataService.guestDataService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import po.CreditPO;
import po.GuestPO;
import po.MemberPO;
import utilities.ResultMessage;

public class GuestDataService_Stub implements GuestDataService{

	
	public GuestPO getSingleGuest(String guestID) {
		LocalDate birthday = LocalDate.of(1995, 1, 1);
		
		return new GuestPO("1234567890", birthday, "school", "zhangsan", "xiaosan",
				"000000", "13523456789",100);
	}


	public List<GuestPO> getAllGuest() {
		List<GuestPO> list = new ArrayList<GuestPO>();
		GuestPO a= new GuestPO("1234567890", LocalDate.of(1995, 1, 1), "school", "zhangsan", "xiaosan",
				"000000", "13523456789",100);
		list.add(a);
		return list;
	}


	public List<CreditPO> getAllCreditDetail(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}


	public ResultMessage add(GuestPO newGuestPO) {
		return ResultMessage.SUCCESS;
	}


	public ResultMessage modifyMember(MemberPO memberPO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}


	public ResultMessage modify(GuestPO guestPO) {
		// TODO Auto-generated method stub
		return null;
	}

}
