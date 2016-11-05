package businessLogic.orderBL.driver;

import static org.junit.Assert.*;

import org.junit.Test;

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
		
		assertEquals(driver.orderDataService.createOrder(new OrderPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "excute",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4")), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		//test interface getOrderDetails
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		OrderPO orderPO = driver.orderDataService.getOrderDetail("123456789012");
		
		assertEquals(orderPO.getOrderID(), "123456789012");
		assertEquals(orderPO.getHotelName(), "thisHotel");
		assertEquals(orderPO.getHotelAddress(), "address");
		assertEquals(orderPO.getPrice(), 200);
		assertEquals(orderPO.getCreateTime(), "2016/2/2/18:30:20");
		assertEquals(orderPO.getCheckInTime(), "2016/2/3");
		assertEquals(orderPO.getCheckOutTime(), "2016/2/4");
		assertEquals(orderPO.getExpectExecuteTime(), "2016/2/3");
		assertEquals(orderPO.getExpectLeaveTime(), "2016/2/4");
		assertEquals(orderPO.getState(), "execut");
		assertEquals(orderPO.getRoomType(), RoomType.AMBASSADOR);
		assertEquals(orderPO.getRoomNum(), 2);
		assertEquals(orderPO.getRoomNumber(), "301");
		assertEquals(orderPO.getName(), "zhangsan");
		assertEquals(orderPO.getPhone(), "13554321234");
		assertEquals(orderPO.getMessage(), "not");
		
	}
	
	@Test
	public void test3() {
		//test interface executeOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		assertEquals(driver.orderDataService.executeOrder("123456789012"), ResultMessage.SUCCESS);
		
	}
}
