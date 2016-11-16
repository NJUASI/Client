package presentation.webMarketerUI.driver;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import businessLogic.promotionBL.stub.PromotionBLService_Stub;
import utilities.PromotionType;
import utilities.ResultMessage;
import vo.PromotionVO;
import vo.WebPromotionVO;

public class PromotionBLService_DriverTest {

	@Test
	public void test1() {
		//test interface getWebPromotions
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		List<WebPromotionVO> list = driver.promotionBLService.getWebPromotions();

		WebPromotionVO promotionVO1=list.get(0);
		WebPromotionVO promotionVO2=list.get(1);
		
		assertEquals(PromotionType.HOTEL__HOLIDAY, promotionVO1.promotionType);
		assertEquals(0.9, promotionVO1.discount,0);
		assertEquals("ALL_CYCLE", promotionVO1.cycle);
		assertEquals(LocalDate.of(2016, 11, 1), promotionVO1.startDate);
		assertEquals(LocalDate.of(2016, 11, 15), promotionVO1.endDate);
		
		assertEquals(PromotionType.HOTEL__ENTERPRISE, promotionVO2.promotionType);
		assertEquals(0.95, promotionVO2.discount,0);
		assertEquals("ALL_CYCLE", promotionVO2.cycle);
		assertEquals(LocalDate.of(2016, 7, 1), promotionVO2.startDate);
		assertEquals(LocalDate.of(2016, 12, 31), promotionVO2.endDate);

	}

	@Test
	public void test2() {
		//test interface update
		PromotionBLService_Stub stub = new PromotionBLService_Stub();
		PromotionBLService_Driver driver = new PromotionBLService_Driver(stub);
		ArrayList<WebPromotionVO> list = new ArrayList<WebPromotionVO>();
		list.add(new WebPromotionVO(PromotionType.HOTEL__HOLIDAY, "ALL_CYCLE", 0.9, 
				LocalDate.of(2016, 11, 1), LocalDate.of(2016, 11, 15)));

//		assertEquals(ResultMessage.SUCCESS, driver.promotionBLService.update(list));
	}

}
