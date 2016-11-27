package presentation.guestUI.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class OrderCheckController {
	@FXML
	private Pane orderDetail;
	@FXML
	private Pane orderCheck;

	@FXML
	protected void OrderDetail1() {
		orderDetail.setVisible(true);
		orderCheck.setVisible(false);
	}

	@FXML
	protected void cancel() {
		orderDetail.setVisible(false);
		orderCheck.setVisible(true);
	}
}
