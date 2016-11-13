package presentation.hotelWorkerUI.driver;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import businessLogic.orderBL.stub.OrderBLService_Stub;
import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderVO;

public class OrderBLService_DriverTest {

	@Test
	public void test1() {
		// test orderBLService.createOrder
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		
		LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 30);
		LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);
		
		OrderState orderState = OrderState.EXECUTED;
		RoomType roomType = RoomType.AMBASSADOR;
		
		OrderVO orderVO = new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 
				250, 200, createTime, checkInTime, checkOutTime, expectExecuteTime, expectLeaveTime, 
				orderState, roomType, 2, "301  302", 2, "zhangsan","13554321234", "no");
		
		assertEquals(driver.orderBLService.createOrder(orderVO), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		// test orderBLService.executeOrder
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.executeOrder("123456789012"), ResultMessage.SUCCESS);
	}

	@Test
	public void test3() {
		// test orderBLService.undoAbnormalOrder
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.undoAbnormalOrder("123456789012"), ResultMessage.SUCCESS);
	}

	@Test
	public void test4() {
		// test orderBLService.undoAbnormalOrder
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.undoAbnormalOrder("123456789012"), ResultMessage.SUCCESS);
	}

	@Test
	public void test5() {
		// test orderBLService.undoNormalOrder
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.undoNormalOrder("123456789012"), ResultMessage.SUCCESS);
	}

	@Test
	public void test6() {
		// test orderBLService.OrderDetail
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		OrderVO orderVO = driver.orderBLService.getOrderDetail("123456789012");
		
		assertEquals(orderVO.orderGeneralVO.orderID, "123456789012");
		assertEquals(orderVO.orderGeneralVO.hotelName, "thisHotel");
		assertEquals(orderVO.orderGeneralVO.hotelAddress, "address");
		assertEquals(orderVO.orderGeneralVO.price, 200, 0);
		assertEquals(orderVO.createTime, LocalDateTime.of(2016, 2, 2, 18, 30));
		assertEquals(orderVO.checkInTime, LocalDateTime.of(2016, 2, 3, 11, 23));
		assertEquals(orderVO.checkOutTime, LocalDateTime.of(2016, 2, 4, 10, 58));
		assertEquals(orderVO.orderGeneralVO.expectExecuteTime, LocalDateTime.of(2016, 2, 3, 14, 00));
		assertEquals(orderVO.orderGeneralVO.expectLeaveTime, LocalDateTime.of(2016, 2, 4, 12, 00));
		assertEquals(orderVO.orderGeneralVO.state, OrderState.EXECUTED);
		assertEquals(orderVO.roomType, RoomType.AMBASSADOR);
		assertEquals(orderVO.roomNumCount, 2);
		assertEquals(orderVO.roomNumber, "301  302");
		assertEquals(orderVO.name, "zhangsan");
		assertEquals(orderVO.phone, "13554321234");
		assertEquals(orderVO.message, "no");
	}

}
