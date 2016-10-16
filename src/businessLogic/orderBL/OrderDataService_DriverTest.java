package businessLogic.orderBL;

import static org.junit.Assert.*;

import org.junit.Test;

import dataService.orderDataService.OrderDataService;
import dataService.orderDataService.OrderDataService_Stub;
import po.OrderPO;
import utilities.ResultMessage;
import utilities.RoomType;

public class OrderDataService_DriverTest {

	@Test
	public void test1() {
		//test interface createOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		assertEquals(driver.orderDataService.createOrder(new OrderPO("", "", "", 200, "", "", "", RoomType.SINGLEBED, 2, "", "", "")), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		//test interface getOrderDetails
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		OrderPO orderPO = driver.orderDataService.getOrderDetail("123412345678");
		
		assertEquals(orderPO.getOrderID(), "123412345678");
		assertEquals(orderPO.getHotelName(), "thisHotel");
		assertEquals(orderPO.getHotelAddress(), "Nanjing, China");
		assertEquals(orderPO.getPrice(), 200);
		assertEquals(orderPO.getCreateTime(), "13:34");
		assertEquals(orderPO.getCheckInTime(), "13:05");
		assertEquals(orderPO.getCheckOutTime(), "9:00");
		assertEquals(orderPO.getExpectExecuteTime(), "12:00");
		assertEquals(orderPO.getExpectLeaveTime(), "12:00");
		assertEquals(orderPO.getState(), "Unexecuted");
		assertEquals(orderPO.getRoomType(), RoomType.SINGLEBED);
		assertEquals(orderPO.getRoomNum(), 1);
		assertEquals(orderPO.getRoomNumber(), "2011");
		assertEquals(orderPO.getName(), "Charles");
		assertEquals(orderPO.getPhone(), "13000001111");
		assertEquals(orderPO.getMessage(), "NULL");
		
	}
	
	@Test
	public void test3() {
		//test interface executeOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		assertEquals(driver.orderDataService.executeOrder("123412345678"), ResultMessage.SUCCESS);
		
	}
}
