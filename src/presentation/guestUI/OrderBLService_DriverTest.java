package presentation.guestUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.orderBL.stub.OrderBLService_Stub;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderVO;

public class OrderBLService_DriverTest {

	@Test
	public void test1() {
		//test interface createOrder
		OrderBLService_Stub stub = new OrderBLService_Stub("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "excute",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.createOrder(new OrderVO( "123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "excute",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4" )), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		//test interface getOrderDetail
		OrderBLService_Stub stub = new OrderBLService_Stub
				("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
						"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "excute",
						RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
						"2016/2/4", "2016/2/4");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		OrderVO orderVO = driver.orderBLService.getOrderDetail("123456789012");
		
		assertEquals(orderVO.getOrderID(), "123456789012");
		assertEquals(orderVO.getHotelName(), "thisHotel");
		assertEquals(orderVO.getHotelAddress(), "address");
		assertEquals(orderVO.getPrice(), 200);
		assertEquals(orderVO.getCreateTime(), "2016/2/2/18:30:20");
		assertEquals(orderVO.getCheckInTime(), "2016/2/3");
		assertEquals(orderVO.getCheckOutTime(), "2016/2/4");
		assertEquals(orderVO.getExpectExecuteTime(), "2016/2/3");
		assertEquals(orderVO.getExpectLeaveTime(), "2016/2/4");
		assertEquals(orderVO.getState(), "execut");
		assertEquals(orderVO.getRoomType(), RoomType.AMBASSADOR);
		assertEquals(orderVO.getRoomNum(), 2);
		assertEquals(orderVO.getRoomNumber(), "301");
		assertEquals(orderVO.getName(), "zhangsan");
		assertEquals(orderVO.getPhone(), "13554321234");
		assertEquals(orderVO.getMessage(), "Not");
		
		
	}
}
