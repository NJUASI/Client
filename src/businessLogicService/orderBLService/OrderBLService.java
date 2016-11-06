package businessLogicService.orderBLService;

import java.util.List;

import utilities.ResultMessage;
import vo.OrderGeneralVO;
import vo.OrderVO;

public interface OrderBLService {

	public ResultMessage createOrder(OrderVO orderVO);
	public ResultMessage executeOrder(String orderID);
	public ResultMessage undoAbnormalOrder(String orderID);
	public ResultMessage undoNormalOrder(String orderID);
	public OrderVO getOrderDetail(String orderID);
	public List<OrderGeneralVO> getAllGuestOrderGeneral (String guestID);
	public List<OrderGeneralVO> getAllHotelOrderGeneral (String hotelID);
	public List<String> getBookedHotels (String guestID);
	

}
