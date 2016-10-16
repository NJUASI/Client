package presentation.guestUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.orderBL.OrderBLService_Stub;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderVO;

public class OrderBLService_DriverTest {

	@Test
	public void test1() {
		//test interface createOrder
		OrderBLService_Stub stub = new OrderBLService_Stub("", "", "", 200, "", "", "", "", "", "", RoomType.SINGLEBED, 1, "", "", "", "");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.createOrder(new OrderVO("", "", "", 200, "", "", "", "", "", "", RoomType.SINGLEBED, 1, "", "", "", "")), ResultMessage.SUCCESS);
	}

	@Test
	public void test2() {
		//test interface getOrderDetail
		OrderBLService_Stub stub = new OrderBLService_Stub
				("123412345678", "thisHotel", "Nanjing, China", 200, "13:34", "13:00", "9:00", "12:00", "12:00", "Unexecuted", RoomType.SINGLEBED, 1, "2011", "Charles", "13000001111", "NULL");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		OrderVO orderVO = driver.orderBLService.getOrderDetail("123412345678");
		
		assertEquals(orderVO.getOrderID(), "123412345678");
	}
}
