package businessLogic.orderBL.stub;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import businessLogicService.orderBLService.OrderBLService;
import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;
import vo.OrderGeneralVO;
import vo.OrderVO;

/**
 * 
 * @author cuihua
 * lastChangedBy charles
 * updateTime 2016/11/29
 */
public class OrderBLService_Stub implements OrderBLService {
	
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * new 一个stub来进行连接测试
	 */
	public OrderBLService_Stub() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderVO 从客户界面层传下来的Order载体
	 * @return 客户成功创建此订单
	 */
	public ResultMessage createOrder(final OrderVO orderVO) {
		return ResultMessage.SUCCESS;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderID 酒店工作人员当前需要执行订单的订单号
	 * @return 酒店工作人员成功执行此订单
	 */
	public ResultMessage executeOrder(final String orderID) {
		return ResultMessage.SUCCESS;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderID 网站营销人员当前需要撤销的异常订单的订单号
	 * @return 网站营销人员是否成功撤销此异常订单
	 */
	public ResultMessage undoAbnormalOrder(final String orderID) {
		return ResultMessage.SUCCESS;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderID 客户当前需要撤销的正常订单的订单号
	 * @return 客户是否成功撤销此正常订单
	 */
	public ResultMessage undoNormalOrder(final String orderID) {
		return ResultMessage.SUCCESS;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderID 用户当前需要查看的订单的订单号
	 * @return 一个简单的测试OrderVO
	 */
	public OrderVO getOrderDetail(final String orderID) {
		final LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 30);
		final LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		final LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		final LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		final LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);
		
		final OrderState orderState = OrderState.EXECUTED;
		final RoomType roomType = RoomType.AMBASSADOR;
		
		return new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 250, 200,
				createTime, checkInTime, checkOutTime, expectExecuteTime, expectLeaveTime, orderState, 
				roomType, 2, "301  302", 2, "zhangsan", "13554321234", "no","good");
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param guestID 客户要查看个人所有订单时，客户的编号
	 * @return 客户个人所有订单
	 */
	public List<OrderGeneralVO> getAllGuestOrderGeneral(final String guestID) {
		final List<OrderGeneralVO> orderGenerals = new ArrayList<OrderGeneralVO>();
		orderGenerals.add(new OrderGeneralVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				LocalDateTime.of(2016, 2, 3, 14, 0), LocalDateTime.of(2016, 2, 4, 12, 0), OrderState.EXECUTED));
		return orderGenerals;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param hotelID 酒店要查看本酒店所有订单时，酒店的编号
	 * @return 此酒店所有的所有订单
	 */
	public List<OrderGeneralVO> getAllHotelOrderGeneral(final String hotelID) {
		final List<OrderGeneralVO> orderGenerals = new ArrayList<OrderGeneralVO>();
		orderGenerals.add(new OrderGeneralVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				LocalDateTime.of(2016, 2, 3, 14, 0), LocalDateTime.of(2016, 2, 4, 12, 0), OrderState.EXECUTED));
		return orderGenerals;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param date 网站营销人员撤销异常订单时输入的指定日期
	 * @return 网站营销人员需要查看的当天所有的异常订单
	 */
	public List<OrderGeneralVO> getAllAbnormalOrderGeneral(final LocalDate date) {
		final List<OrderGeneralVO> orderGenerals = new ArrayList<OrderGeneralVO>();
		orderGenerals.add(new OrderGeneralVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				LocalDateTime.of(2016, 2, 3, 14, 0), LocalDateTime.of(2016, 2, 4, 12, 0), OrderState.EXECUTED));
		return orderGenerals;
	}
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @return 是否成功执行此订单
	 */
	public List<OrderGeneralVO> getAllAbnormalOrderGeneral() {
		final List<OrderGeneralVO> orderGenerals = new ArrayList<OrderGeneralVO>();
		orderGenerals.add(new OrderGeneralVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200,
				LocalDateTime.of(2016, 2, 3, 14, 0), LocalDateTime.of(2016, 2, 4, 12, 0), OrderState.EXECUTED));
		return orderGenerals;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param guestID 客户需要查看个人定过的酒店时依照的客户个人编号
	 * @return 客户定过的酒店列表
	 */
	public List<String> getBookedHotels(final String guestID) {
		final List<String> bookedHotels = new ArrayList<String>();
		bookedHotels.add("12345678");
		bookedHotels.add("12345679");
		return bookedHotels;
	}
	
}
