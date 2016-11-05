package presentation.webMarketerUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.creditBL.stub.CreditBLService_Stub;
import utilities.ResultMessage;
import vo.CreditVO;

public class CreditBLService_DriverTest {

	@Test
	public void test1() {
		CreditBLService_Stub stub = new CreditBLService_Stub("1234567890","2016/1/1","123456789012",100,100, "undo");
		CreditBLService_Driver driver = new CreditBLService_Driver(stub);
		assertEquals(driver.creditBLService.charge(0), ResultMessage.SUCCESS);
	
	}
	
	@Test
	public void test2() {
		CreditBLService_Stub stub = new CreditBLService_Stub("1234567890","2016/1/1","123456789012",100,100, "undo");
		CreditBLService_Driver driver = new CreditBLService_Driver(stub);
		assertEquals(driver.creditBLService.getBasicInfo("1234567890"), 
				new CreditVO("1234567890","2016/1/1","123456789012",100,100, "undo"));
	
	}

}
