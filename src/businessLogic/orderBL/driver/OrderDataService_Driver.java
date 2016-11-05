package businessLogic.orderBL.driver;

import dataService.orderDataService.OrderDataService;

public class OrderDataService_Driver {

	OrderDataService orderDataService;
	
	public OrderDataService_Driver(OrderDataService orderDataService) {
		this.orderDataService = orderDataService;
	}
}
