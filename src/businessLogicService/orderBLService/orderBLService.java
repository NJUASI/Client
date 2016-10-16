package businessLogicService.orderBLService;

import java.util.List;

import utilities.ResultMessage;

public interface orderBLService {

//	public ResultMessage createOrder(OrderVO);
	public ResultMessage executeOrder(String orderID);
	public ResultMessage undoAbnormalOrder(String orderID);
	public ResultMessage undoNormalOrder(String orderID);
//	public OrderVO getOrderDetail(String orderID);
//	public List<OrderGeneralVO> getAllGuestOrderGeneral (String guestID);
//	public List<OrderGeneralVO> getAllHotelOrderGeneral (String hotelID);
	public List<String> getBookedHotel (String guestID);

}
