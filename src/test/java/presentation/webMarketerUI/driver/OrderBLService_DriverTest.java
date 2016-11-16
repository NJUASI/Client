package presentation.webMarketerUI.driver;

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
	//test interface undoAbnormalOrder
	public void test1() {
		OrderBLService_Stub stub = new OrderBLService_Stub();
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(ResultMessage.SUCCESS, driver.orderBLService.undoAbnormalOrder("123456789012"));
	}
	
	@Test
	//test interface getOrderDetail
	public void test2() {
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
	
	
}
