package presentation.webMarketerUI.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import utilities.OrderState;
import utilities.RoomType;
import vo.OrderVO;

/**
 * @author 61990
 *
 */
public class OrderController {
	
	OrderVO orderVO;
	
	@FXML
	private Pane orderCheck, orderDetail, searchPane,cancelOrderPane;

	// 控制返回界面
	@FXML
	private Button back1, back2,detail_state;

	@FXML
	private TextField searchID;

	@FXML
	private DatePicker searchDate;

	@FXML 
	private ComboBox<String> cancelPercent;
	//详情界面内容
	@FXML
	private Label detail_ID,detail_Hotel,detail_address,detail_roomType,detail_roomNum,detail_personNum,detail_price,detail_personName,detail_phone,detail_createTime,detail_expectTime;
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/12/1 构造函数，初始化成员变量
	 */
	@FXML
	private void initialize() {
		cancelPercent.setValue("50%");
		cancelPercent.getItems().add("50%");
		cancelPercent.getItems().add("100%");
	}
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @通过订单编号查找订单
	 */
	@FXML
	protected void searchOneOrder() {
		back1.setVisible(false);
		back2.setVisible(true);
		orderDetail.setVisible(true);
		searchPane.setVisible(false);
		// Order.
		// 获得输入的内容
//		searchID.getText();
		//Test
		final LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 30);
		final LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		final LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		final LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		final LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);
		
		final OrderState orderState = OrderState.ABNORMAL;
		final RoomType roomType = RoomType.AMBASSADOR;
		
		orderVO=new OrderVO("123456789012", "1234567890", "12345678", "thisHotel", "address", 250, 200,
				createTime, checkInTime, checkOutTime, expectExecuteTime, expectLeaveTime, orderState, 
				roomType, 2, "301  302", 2, "zhangsan", "13554321234", "no","good");
		//
		if (orderVO.orderGeneralVO.state == OrderState.ABNORMAL) {
			cancelOrderPane.setDisable(true);
		} else {
			cancelOrderPane.setDisable(false);
		}
		
		
	}
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @取消异常订单
	 */
	@FXML
	protected void cancelAbnormalOrder() {
		try {
		if (cancelPercent.getValue().equals("50%")) {
			
		} else if (cancelPercent.getValue().equals("100%")){
		
		}
		} 
		catch (Exception e) {
			System.out.println("ssss");
		}
	}
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @通过日期查找订单
	 */
	@FXML
	protected void searchDateOrder() {
		orderCheck.setVisible(true);
		searchPane.setVisible(false);
		// 获得输入的内容
//		LocalDate date = searchDate.getValue();
	}


	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @取消查找订单，返回初始界面
	 */
	@FXML
	protected void cancelCheck() {
		orderCheck.setVisible(false);
		searchPane.setVisible(true);
	}

	@FXML
	protected void OrderDetail1() {
		back1.setVisible(true);
		back2.setVisible(false);
		orderDetail.setVisible(true);
		orderCheck.setVisible(false);
	}

	@FXML
	protected void cancelDetail1() {
		orderDetail.setVisible(false);
		orderCheck.setVisible(true);
	}

	@FXML
	protected void cancelDetail2() {
		orderDetail.setVisible(false);
		searchPane.setVisible(true);
	}
	private void initOrderDetail(OrderVO orderVO) {
		detail_ID.setText(orderVO.orderGeneralVO.hotelID);
		detail_Hotel.setText(orderVO.orderGeneralVO.hotelName);
		detail_address.setText(orderVO.orderGeneralVO.hotelAddress);
		detail_roomType.setText(orderVO.roomType.toString());
		detail_roomNum.setText(orderVO.roomNumCount+"");
		detail_personNum.setText(orderVO.expectGuestNumCount+"");
		detail_personName.setText(orderVO.name);
//		detail_phone.setText(orderVO.phone);
//		detail_createTime,detail_expectTime
//		detail_price
//		detail_state
	}
}
