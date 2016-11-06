package presentation.guestUI.driver;

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
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.createOrder(new OrderVO( "123456789012", "1234567890", "12345678", "thisHotel", "address",250, 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "excute",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4" )), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		//test interface getOrderDetail
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		OrderVO orderVO = driver.orderBLService.getOrderDetail("123456789012");
		
		assertEquals(orderVO.orderID, "123456789012");
		assertEquals(orderVO.hotelName, "thisHotel");
		assertEquals(orderVO.hotelAddress, "address");
		assertEquals(orderVO.price, 200);
		assertEquals(orderVO.createTime, "2016/2/2/18:30:20");
		assertEquals(orderVO.checkInTime, "2016/2/3");
		assertEquals(orderVO.checkOutTime, "2016/2/4");
		assertEquals(orderVO.expectExecuteTime, "2016/2/3");
		assertEquals(orderVO.expectLeaveTime, "2016/2/4");
		assertEquals(orderVO.state, "executed");
		assertEquals(orderVO.roomType, RoomType.AMBASSADOR);
		assertEquals(orderVO.roomNum, 2);
		assertEquals(orderVO.roomNumber, "301");
		assertEquals(orderVO.name, "zhangsan");
		assertEquals(orderVO.phone, "13554321234");
		assertEquals(orderVO.message, "not");
	}
}
