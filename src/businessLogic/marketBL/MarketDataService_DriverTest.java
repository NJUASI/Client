package businessLogic.marketBL;

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
		
		assertEquals(marketPO.getMarketName() , "aa");
		assertEquals(marketPO.getMarketCredit(), 0);
		assertEquals(marketPO.getMarketBenefit(), "0.9");
	
	
	}

}
