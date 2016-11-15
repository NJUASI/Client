package businessLogic.marketBL.driver;

import static org.junit.Assert.*;

import org.junit.Test;

import dataService.marketDataService.MarketDataService_Stub;
import po.MarketPO;

public class MarketDataService_DriverTest {

	@Test
	public void test() {
		MarketDataService_Stub stub = new MarketDataService_Stub();
		MarketDataService_Driver driver = new MarketDataService_Driver(stub);
		MarketPO marketPO = driver.marketDataService.getMemberFormulation();
		
		assertEquals("aa", marketPO.getMarketName());
		assertEquals(0, marketPO.getMarketCredit(), 0);
		assertEquals(0.9, marketPO.getMarketBenefit(), 0);
	
	
	}

}