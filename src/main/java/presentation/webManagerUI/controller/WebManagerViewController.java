package presentation.webManagerUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class WebManagerViewController {
	Parent guest, hotel, marketer, hotelInfo;

	@FXML
	private StackPane right;
	@FXML
	private Pane mainPane;

	@FXML
	protected void openGuest() throws IOException {
		right.getChildren().removeAll(mainPane, guest, hotel, marketer, hotelInfo);
		guest = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/Guest.fxml"));
		right.getChildren().add(guest);

	}

	@FXML
	protected void openHotel() throws IOException {
		right.getChildren().removeAll(mainPane, guest, hotel, marketer, hotelInfo);
		hotel = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/HotelWorker.fxml"));
		right.getChildren().add(hotel);

	}

	@FXML
	protected void openMarketer() throws IOException {
		right.getChildren().removeAll(mainPane, guest, hotel, marketer, hotelInfo);
		marketer = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/Marketer.fxml"));
		right.getChildren().add(marketer);

	}

	@FXML
	protected void openHotelInfo() throws IOException {
		right.getChildren().removeAll(mainPane, guest, hotel, marketer, hotelInfo);
		hotelInfo = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/HotelInfo.fxml"));
		right.getChildren().add(hotelInfo);
	}

	@FXML
	protected void openMain() {
		right.getChildren().removeAll(mainPane, guest, hotel, marketer, hotelInfo);
		right.getChildren().add(mainPane);
	}
}
