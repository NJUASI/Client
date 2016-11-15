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
		
		assertEquals(ResultMessage.SUCCESS, driver.orderDataService.createOrder(orderPO));
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
		
		assertEquals("123456789012", orderPO.getOrderID());
		assertEquals("thisHotel", orderPO.getHotelName());
		assertEquals("address", orderPO.getHotelAddress());
		assertEquals(200, orderPO.getPreviousPrice(), 0);
		assertEquals(200, orderPO.getPrice(), 0);
		assertEquals(createTime, orderPO.getCreateTime());
		assertEquals(checkInTime, orderPO.getCheckInTime());
		assertEquals(checkOutTime, orderPO.getCheckOutTime());
		assertEquals(expectExecuteTime, orderPO.getExpectExecuteTime());
		assertEquals(expectLeaveTime, orderPO.getExpectLeaveTime());
		assertEquals(OrderState.EXECUTED, orderPO.getState());
		assertEquals(RoomType.AMBASSADOR, orderPO.getRoomType());
		assertEquals(2, orderPO.getRoomNumCount());
		assertEquals("301  302", orderPO.getRoomNumber());
		assertEquals("zhangsan", orderPO.getName());
		assertEquals("13554321234", orderPO.getPhone());
		assertEquals("no", orderPO.getMessage());
		
	}
	
	@Test
	public void test3() {
		//test interface executeOrder
		OrderDataService_Stub stub = new OrderDataService_Stub();
		OrderDataService_Driver driver = new OrderDataService_Driver(stub);
		
		assertEquals(ResultMessage.SUCCESS, driver.orderDataService.executeOrder("123456789012"));
		
	}
}
