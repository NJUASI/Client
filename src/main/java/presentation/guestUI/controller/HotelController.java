package presentation.guestUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class HotelController {
	@FXML
	private Pane cityAndCircle;
	@FXML
	private Pane hotelCheck;
	@FXML
	private Pane hotelDetail;
	@FXML
	private Pane hotelChoose; 
	@FXML
	private Pane createPane;
	@FXML
	protected void openHotelCheck() {
		cityAndCircle.setVisible(false);
		hotelCheck.setVisible(true);
	}

	@FXML
	protected void openHotelDetail() {
		hotelCheck.setVisible(false);
		hotelDetail.setVisible(true);
	}

	@FXML
	protected void openSwitchCityCircle() {
		hotelCheck.setVisible(false);
		cityAndCircle.setVisible(true);
	}

	@FXML
	protected void openChoose() {
		hotelCheck.setVisible(false);
		hotelChoose.setVisible(true);
	}
	@FXML
	protected void openCreateOrder() {
		hotelDetail.setVisible(false);
		createPane.setVisible(true);
	}
	@FXML
	protected void returnHotelCheck() {
		hotelCheck.setVisible(true);
		hotelDetail.setVisible(false);
		createPane.setVisible(false);
	}
}
