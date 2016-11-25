package presentation.webMarketerUI.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class OrderController {
	
	@FXML
	private Pane orderCheck,orderDetail,searchPane;
	@FXML
	private Button back1,back2 ;
	
	@FXML
	protected void searchOneOrder() {
		back1.setVisible(false);
		back2.setVisible(true);
		orderDetail.setVisible(true);
		searchPane.setVisible(false);
	}

	@FXML
	protected void searchDateOrder() {
		orderCheck.setVisible(true);
		searchPane.setVisible(false);
	}

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

}
