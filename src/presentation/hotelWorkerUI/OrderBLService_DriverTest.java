package presentation.hotelWorkerUI;

import static org.junit.Assert.*;

import org.junit.Test;

import businessLogic.orderBL.OrderBLService_Stub;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderVO;

public class OrderBLService_DriverTest {

	@Test
	//test orderBLService.createOrder
	public void test1() {
		OrderBLService_Stub stub = new OrderBLService_Stub("","", "", 0,"","", "", "", "", "",
				RoomType.SINGLEBED, 0, "", "", "", "");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.createOrder(new OrderVO("","", "", 0,"","", "", "", "", "",
				RoomType.SINGLEBED, 0, "", "", "", "")), ResultMessage.SUCCESS);
	}

	@Test
	//test orderBLService.executeOrder
	public void test2() {
		OrderBLService_Stub stub = new OrderBLService_Stub("","", "", 0,"","", "", "", "", "",
				RoomType.SINGLEBED, 0, "", "", "", "");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.executeOrder(""), ResultMessage.SUCCESS);
	}
	
	@Test
	//test orderBLService.undoAbnormalOrder
	public void test3() {
		OrderBLService_Stub stub = new OrderBLService_Stub("","", "", 0,"","", "", "", "", "",
				RoomType.SINGLEBED, 0, "", "", "", "");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.undoAbnormalOrder(""), ResultMessage.SUCCESS);
	}
	
	@Test
	//test orderBLService.undoAbnormalOrder
	public void test4() {
		OrderBLService_Stub stub = new OrderBLService_Stub("","", "", 0,"","", "", "", "", "",
				RoomType.SINGLEBED, 0, "", "", "", "");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.undoAbnormalOrder(""), ResultMessage.SUCCESS);
	}
	
	@Test
	//test orderBLService.undoNormalOrder
	public void test5() {
		OrderBLService_Stub stub = new OrderBLService_Stub("","", "", 0,"","", "", "", "", "",
				RoomType.SINGLEBED, 0, "", "", "", "");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.undoNormalOrder(""), ResultMessage.SUCCESS);
	}
	
	@Test
	//test orderBLService.getOrderDetail
	public void test6() {
		OrderBLService_Stub stub = new OrderBLService_Stub("","", "", 0,"","", "", "", "", "",
				RoomType.SINGLEBED, 0, "", "", "", "");
		OrderBLService_Driver driver = new OrderBLService_Driver(stub);
		assertEquals(driver.orderBLService.getOrderDetail(""), ResultMessage.SUCCESS);
	}
	
	
}
