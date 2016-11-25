package presentation.guestUI.driver;

import static org.junit.Assert.*;

import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

import businessLogic.orderBL.stub.OrderBLService_Stub;
import dataService.orderDataService.OrderDataService_Stub;
import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class OrderBLService_DriverTest {

	@Test
	public void test1() {
		//test interface createOrder
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
		
		assertEquals(ResultMessage.SUCCESS, driver.orderBLService.createOrder(orderVO));
	}
	
	@Test
	public void test2() {
		// test interface undoNormalOrder
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(ResultMessage.SUCCESS, driver.orderBLService.undoNormalOrder("123456789012"));
	}

	@Test
	public void test3() {
		//test interface getOrderDetail
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		OrderVO orderVO = driver.orderBLService.getOrderDetail("123456789012");
		
		assertEquals("123456789012", orderVO.orderGeneralVO.orderID);
		assertEquals("thisHotel", orderVO.orderGeneralVO.hotelName);
		assertEquals("address", orderVO.orderGeneralVO.hotelAddress);
		assertEquals(200, orderVO.orderGeneralVO.price, 0);
		assertEquals(LocalDateTime.of(2016, 2, 2, 18, 30), orderVO.createTime);
		assertEquals(LocalDateTime.of(2016, 2, 3, 11, 23), orderVO.checkInTime);
		assertEquals(LocalDateTime.of(2016, 2, 4, 10, 58), orderVO.checkOutTime);
		assertEquals(LocalDateTime.of(2016, 2, 3, 14, 00), orderVO.orderGeneralVO.expectExecuteTime);
		assertEquals(LocalDateTime.of(2016, 2, 4, 12, 00), orderVO.orderGeneralVO.expectLeaveTime);
		assertEquals(OrderState.EXECUTED, orderVO.orderGeneralVO.state);
		assertEquals(RoomType.AMBASSADOR, orderVO.roomType);
		assertEquals(2, orderVO.roomNumCount);
		assertEquals("301  302", orderVO.roomNumber);
		assertEquals("zhangsan", orderVO.name);
		assertEquals("13554321234", orderVO.phone);
		assertEquals("no", orderVO.message);
	}
	
	@Test
	public void test4() {
		//test interface getAllGuestOrderGeneral
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		
		List<OrderGeneralVO> orderGeneralVOs = driver.orderBLService.getAllGuestOrderGeneral("1234567890");
		OrderGeneralVO orderGeneralVO = orderGeneralVOs.get(0);	
		
		assertEquals("123456789012", orderGeneralVO.orderID);
		assertEquals("1234567890", orderGeneralVO.guestID);
		assertEquals("12345678", orderGeneralVO.hotelID);
		assertEquals("thisHotel", orderGeneralVO.hotelName);
		assertEquals("address", orderGeneralVO.hotelAddress);
		assertEquals(200, orderGeneralVO.price, 0);
		assertEquals(LocalDateTime.of(2016, 2, 3, 14, 0), orderGeneralVO.expectExecuteTime);
		assertEquals(LocalDateTime.of(2016, 2, 4, 12, 0), orderGeneralVO.expectLeaveTime);
		assertEquals(OrderState.EXECUTED, orderGeneralVO.state);
		
	}
}
