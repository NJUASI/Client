package presentation.webMarketerUI.driver;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.marketBL.stub.MarketBLService_Stub;
import utilities.ResultMessage;
import vo.MarketVO;

public class MarketBLService_DriverTest {

	@Test
	public void test() {
		MarketBLService_Stub stub = new MarketBLService_Stub();
		MarketBLService_Driver driver = new MarketBLService_Driver(stub);
		assertEquals(driver.marketBLService.setMemberFormulation(new MarketVO("Lv1",500,"0.9")), ResultMessage.SUCCESS);
	}

}
