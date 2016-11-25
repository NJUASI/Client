package businessLogic.orderBL;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderVO;

public class Order_tester {
	
	@Test
	public void test1() {
		//test cooperation with class Promotion
		//test interface getDiscout
		OrderController controller = OrderController.getInstance();
		
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
				
		assertEquals(ResultMessage.SUCCESS, controller.createOrder(orderVO));
				
	}	
}