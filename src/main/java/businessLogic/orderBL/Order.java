package businessLogic.orderBL;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import businessLogic.promotionBL.Promotion;
import dataService.orderDataService.OrderDataService;
import po.OrderGeneralPO;
import po.OrderPO;
import rmi.RemoteHelper;
import utilities.PreOrder;
import utilities.ResultMessage;
import vo.OrderGeneralVO;
import vo.OrderVO;

public class Order {
	
	private OrderDataService orderDataService;
	private Promotion promotion;
	
	public Order() {
		orderDataService = RemoteHelper.getInstance().getOrderDataService();
		promotion = new Promotion();
	}

	public ResultMessage createOrder(OrderVO orderVO) {
		ResultMessage resultMessage = ResultMessage.ORDER_CREATE_FAILURE;
		
		try {
			double discount = promotion.getDiscout(new PreOrder(orderVO));
			orderVO.orderGeneralVO.price  = orderVO.previousPrice * discount;
			
			resultMessage = orderDataService.createOrder(new OrderPO(orderVO));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMessage;
	}

	public ResultMessage executeOrder(String orderID) {
		ResultMessage resultMessage = ResultMessage.ORDER_EXECUTE_FAILURE;
		
		try {
			resultMessage = orderDataService.executeOrder(orderID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMessage;
	}

	public ResultMessage undoAbnormalOrder(String orderID) {
		ResultMessage resultMessage = ResultMessage.ABNORMAL_ORDER_UNDO_FAILURE;
		
		try {
			resultMessage = orderDataService.undoAbnormalOrder(orderID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMessage;
	}

	public ResultMessage undoNormalOrder(String orderID) {
		ResultMessage resultMessage = ResultMessage.NORMAL_ORDER_UNDO_FAILURE;
		
		try {
			resultMessage = orderDataService.undoNormalOrder(orderID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultMessage;
	}

	public OrderVO getOrderDetail(String orderID) {
		OrderVO thisOrderVO = null;
		
		try {
			thisOrderVO = new OrderVO(orderDataService.getOrderDetail(orderID));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return thisOrderVO;
	}

	public List<OrderGeneralVO> getAllGuestOrderGeneral(String guestID) {
		List<OrderGeneralVO> result = new ArrayList<OrderGeneralVO>();
		
		List<OrderGeneralPO> orderGeneralPOs = null;
		try {
			orderGeneralPOs = orderDataService.getAllGuestOrderGeneral(guestID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (orderGeneralPOs != null) {
			for (int i = 0; i < orderGeneralPOs.size(); i++) {
				result.add(new OrderGeneralVO(orderGeneralPOs.get(i)));
			}
		}
		
		return result;
	}

	public List<OrderGeneralVO> getAllHotelOrderGeneral(String hotelID) {
		List<OrderGeneralVO> result = new ArrayList<OrderGeneralVO>();
		
		List<OrderGeneralPO> orderGeneralPOs = null;
		try {
			orderGeneralPOs = orderDataService.getAllHotelOrderGeneral(hotelID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (orderGeneralPOs != null) {
			for (int i = 0; i < orderGeneralPOs.size(); i++) {
				result.add(new OrderGeneralVO(orderGeneralPOs.get(i)));
			}
		}
		
		return result;
	}

	public List<OrderGeneralVO> getAllAbnormalOrderGeneral (LocalDate date) {
		List<OrderGeneralVO> result = new ArrayList<OrderGeneralVO>();
		
		List<OrderGeneralPO> orderGeneralPOs = null;
		try {
			orderGeneralPOs = orderDataService.getAllAbnormalOrderGeneral(date);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (orderGeneralPOs != null) {
			for (int i = 0; i < orderGeneralPOs.size(); i++) {
				result.add(new OrderGeneralVO(orderGeneralPOs.get(i)));
			}
		}
		
		return result;
	}
	
	public List<OrderGeneralVO> getAllAbnormalOrderGeneral () {
		List<OrderGeneralVO> result = new ArrayList<OrderGeneralVO>();
		
		List<OrderGeneralPO> orderGeneralPOs = null;
		try {
			orderGeneralPOs = orderDataService.getAllAbnormalOrderGeneral();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (orderGeneralPOs != null) {
			for (int i = 0; i < orderGeneralPOs.size(); i++) {
				result.add(new OrderGeneralVO(orderGeneralPOs.get(i)));
			}
		}
		
		return result;
	}
	
	public List<String> getBookedHotels(String guestID) {
		List<String> result = null;
		
		try {
			result = orderDataService.getBookedHotels(guestID);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
}
