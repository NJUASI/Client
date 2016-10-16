package businessLogic.orderBL;

import static org.junit.Assert.*;

import org.junit.Test;

import dataService.orderDataService.OrderDataService;
import po.OrderPO;
import utilities.ResultMessage;
import utilities.RoomType;

public class OrderDataService_DriverTest {

	@Test
	public void test() {
		//test interface createOrder
		OrderDataService_Stub stub = new OrderDataService_Stub;
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		assertEquals(driver.orderDataService.createOrder(new OrderPO("", "", "", 200, "", "", "", RoomType.SINGLEBED, 2, "", "", "")), ResultMessage.SUCCESS);
	}

}
