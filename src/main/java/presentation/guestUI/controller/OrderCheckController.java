package presentation.guestUI.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

/**
 * @author 61990
 * @控制订单查看界面
 * @version 11.27
 */
public class OrderCheckController {
	@FXML
	private Pane orderDetail;
	
	@FXML
	private Pane orderCheck;
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27
	 * @跳转订单详情界面
	 */
	@FXML
	protected void orderDetail1() {
		orderDetail.setVisible(true);
		orderCheck.setVisible(false);
	}
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27
	 * @跳转订单概况界面
	 */
	@FXML
	protected void cancel() {
		orderDetail.setVisible(false);
		orderCheck.setVisible(true);
	}
}
