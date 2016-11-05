package presentation.guestUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.memberBL.stub.MemberBLService_Stub;
import utilities.ResultMessage;
import vo.MemberVO;

public class MemberBLService_DriverTest {

	@Test
	public void test() {
		//test interface add
		MemberBLService_Stub stub = new MemberBLService_Stub("1234567890", "1995/1/1", "NJU");
		MemberBLService_Driver driver = new MemberBLService_Driver(stub);
		assertEquals(driver.memberBLService.add(new MemberVO("1234567890", "1995/1/1", "NJU")), ResultMessage.SUCCESS);
	}

}
