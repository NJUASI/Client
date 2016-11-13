package businessLogic.orderBL.driver;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import dataService.orderDataService.OrderDataService_Stub;
import po.OrderPO;
import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;

public class OrderDataService_DriverTest {

	@Test
	public void test1() {
		//test interface createOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 20);
		LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);

		OrderState orderState = OrderState.EXECUTED;
		RoomType roomType = RoomType.AMBASSADOR;
		
		
		OrderPO orderPO = new OrderPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200, 200,
				createTime, checkInTime, checkOutTime, expectExecuteTime, expectLeaveTime, orderState, 
				roomType, 2, "301", 2, "zhangsan","13554321234", "no");
		
		assertEquals(driver.orderDataService.createOrder(orderPO), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		//test interface getOrderDetails
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		OrderPO orderPO = driver.orderDataService.getOrderDetail("123456789012");
		
		LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 20);
		LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);
		
		assertEquals(orderPO.getOrderID(), "123456789012");
		assertEquals(orderPO.getHotelName(), "thisHotel");
		assertEquals(orderPO.getHotelAddress(), "address");
		assertEquals(orderPO.getPreviousPrice(), 200, 0);
		assertEquals(orderPO.getPrice(), 200, 0);
		assertEquals(orderPO.getCreateTime(), createTime);
		assertEquals(orderPO.getCheckInTime(), checkInTime);
		assertEquals(orderPO.getCheckOutTime(), checkOutTime);
		assertEquals(orderPO.getExpectExecuteTime(), expectExecuteTime);
		assertEquals(orderPO.getExpectLeaveTime(), expectLeaveTime);
		assertEquals(orderPO.getState(), OrderState.EXECUTED);
		assertEquals(orderPO.getRoomType(), RoomType.AMBASSADOR);
		assertEquals(orderPO.getRoomNumCount(), 2);
		assertEquals(orderPO.getRoomNumber(), "301");
		assertEquals(orderPO.getName(), "zhangsan");
		assertEquals(orderPO.getPhone(), "13554321234");
		assertEquals(orderPO.getMessage(), "no");
		
	}
	
	@Test
	public void test3() {
		//test interface executeOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		assertEquals(driver.orderDataService.executeOrder("123456789012"), ResultMessage.SUCCESS);
		
	}
}
