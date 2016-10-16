package presentation.guestUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.memberBL.MemberBLService_Stub;
import utilities.MemberType;
import utilities.ResultMessage;
import vo.MemberVO;

public class MemberBLService_DriverTest {

	@Test
	public void test() {
		//test interface add
		MemberBLService_Stub stub = new MemberBLService_Stub("0000000001", MemberType.COMMON, "1995/1/1", "NJU");
		MemberBLService_Driver driver = new MemberBLService_Driver(stub);
		assertEquals(driver.memberBLService.add(new MemberVO("0000000001", "L2", "1995/1/1", "NJU")), ResultMessage.SUCCESS);
	}

}
