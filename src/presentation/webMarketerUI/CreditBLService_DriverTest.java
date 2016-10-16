package presentation.webMarketerUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.creditBL.CreditBLService_Stub;
import utilities.ResultMessage;

public class CreditBLService_DriverTest {

	@Test
	public void test() {
		CreditBLService_Stub stub = new CreditBLService_Stub
				("0000000001", "L2", "1995/1/1", "NJU", "Charles", "bhsab", "123456", "13000001111", "500", "2016", "123411111111", 0, "undo");
		CreditBLService_Driver driver = new CreditBLService_Driver(stub);
		assertEquals(driver.creditBLService.charge(0), ResultMessage.SUCCESS);
	
		
	}

}
