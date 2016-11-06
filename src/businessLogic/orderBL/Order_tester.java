package businessLogic.orderBL;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class Order_tester {
	@Test
	public void test1() {
		//test cooperation with class promotion
		//test interface getDiscout
		OrderController controller = OrderController.getInstance();
		OrderVO orderVO = new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address",250, 200,
				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "executed",
				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
				"2016/2/4", "2016/2/4");
				
		assertEquals(controller.createOrder(orderVO) , ResultMessage.SUCCESS);
				
	}
	
	
	
}

//	@Test
//	public void test1() {
//		//test method createOrder(OrderVO orderVO)
//		OrderController controller = OrderController.getInstance();
//		OrderVO orderVO = new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
//				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "executed",
//				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
//				"2016/2/4", "2016/2/4");
//				
//		assertEquals(controller.createOrder(orderVO) , ResultMessage.SUCCESS);
//				
//	}
//	
//	@Test
//	public void test2() {
//		//test method executeOrder(String orderID)
//		OrderController controller = OrderController.getInstance();
//				
//		assertEquals(controller.executeOrder("123456789012") , ResultMessage.SUCCESS);
//				
//	}
//	@Test
//	public void test3() {
//		//test method undoAbnormalOrder(String orderID)
//		OrderController controller = OrderController.getInstance();
//				
//		assertEquals(controller.undoAbnormalOrder("123456789012") , ResultMessage.SUCCESS);
//				
//	}
//	
//	@Test
//	public void test4() {
//		//test method undoNormalOrder(String orderID)
//		OrderController controller = OrderController.getInstance();
//				
//		assertEquals(controller.undoNormalOrder("123456789012") , ResultMessage.SUCCESS);
//				
//	}
//	
//	@Test
//	public void test5() {
//		//test method getOrderDetail(String orderID)
//		OrderController controller = OrderController.getInstance();
//		OrderVO orderVO = controller.getOrderDetail("123456789012");
//		new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
//				"2016/2/2/18:30:20", "2016/2/3", "2016/2/4", "2016/2/3", "executed",
//				RoomType.AMBASSADOR, 2, "301", "zhangsan","13554321234", "not",
//				"2016/2/4", "2016/2/4");
//				
//		assertEquals(orderVO.orderID, "123456789012");
//		assertEquals(orderVO.guestID, "1234567890");
//		assertEquals(orderVO.hotelID, "12345678");
//		assertEquals(orderVO.hotelName, "thisHotel");
//		assertEquals(orderVO.hotelAddress,  "address");
//		assertEquals(orderVO.price,  200);
//		assertEquals(orderVO.createTime,  "2016/2/2/18:30:20");
//		assertEquals(orderVO.checkInTime,  "2016/2/3");
//		assertEquals(orderVO.checkOutTime,  "2016/2/4");
//		assertEquals(orderVO.expectExecuteTime,  "2016/2/3");
//		assertEquals(orderVO.state,  "executed");
//		assertEquals(orderVO.roomType,  RoomType.AMBASSADOR);
//		assertEquals(orderVO.roomNum,  2);
//		assertEquals(orderVO.roomNumber,  "301");
//		assertEquals(orderVO.name,  "zhangsan");
//		assertEquals(orderVO.phone,  "13554321234");
//		assertEquals(orderVO.message,  "not");
//		assertEquals(orderVO.expectLeaveTime, "2016/2/4");
//		assertEquals(orderVO.leaveTime, "2016/2/4");
//		
//	}
//	
//	@Test
//	public void test6() {
//		//test method getAllGuestOrderGeneral(String guestID)
//		OrderController controller = OrderController.getInstance();
//		List<OrderGeneralVO> list = controller.getAllGuestOrderGeneral("1234567890");
//		OrderGeneralVO orderGeneralVO = list.get(0);	
//		
//		assertEquals(orderGeneralVO.orderID, "123456789012");
//		assertEquals(orderGeneralVO.guestID, "1234567890");
//		assertEquals(orderGeneralVO.hotelID, "12345678");
//		assertEquals(orderGeneralVO.hotelName, "thisHotel");
//		assertEquals(orderGeneralVO.hotelAddress,  "address");
//		assertEquals(orderGeneralVO.price,  200);
//		assertEquals(orderGeneralVO.expectExecuteTime, "2016/2/3");
//		assertEquals(orderGeneralVO.expectLeaveTime, "2016/2/4");
//		assertEquals(orderGeneralVO.state,  "executed");
//				
//	}
//	
//	@Test
//	public void test7() {
//		//test method getAllHotelOrderGeneral(String hotelID)
//		OrderController controller = OrderController.getInstance();
//		List<OrderGeneralVO> list = controller.getAllHotelOrderGeneral("1234567890");
//		OrderGeneralVO orderGeneralVO = list.get(0);	
//		
//		assertEquals(orderGeneralVO.orderID, "123456789012");
//		assertEquals(orderGeneralVO.guestID, "1234567890");
//		assertEquals(orderGeneralVO.hotelID, "12345678");
//		assertEquals(orderGeneralVO.hotelName, "thisHotel");
//		assertEquals(orderGeneralVO.hotelAddress,  "address");
//		assertEquals(orderGeneralVO.price,  200);
//		assertEquals(orderGeneralVO.expectExecuteTime, "2016/2/3");
//		assertEquals(orderGeneralVO.expectLeaveTime, "2016/2/4");
//		assertEquals(orderGeneralVO.state,  "executed");
//				
//	}
//	
//	@Test
//	public void test8() {
//		//test method getBookedHotel(String guestID)
//		OrderController controller = OrderController.getInstance();
//		List<String> list = controller.getBookedHotels("1234567890");
//			
//		
//		assertEquals(list.get(0), "thisHotel");
//		assertEquals(list.get(1), "thatHotel");
//		
//				
//	}
//
//}
