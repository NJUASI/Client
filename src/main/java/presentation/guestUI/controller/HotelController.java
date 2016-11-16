package presentation.guestUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class HotelController {
	Parent hotelCheck;
    @FXML private StackPane right;
    @FXML private Pane cityChoose;
	@FXML 
	protected void openHotelInfo() throws IOException{
		System.out.println("sss");
		hotelCheck = FXMLLoader.load(getClass().getResource("/presentation/GuestUI/view/HotelCheck.fxml"));
		right.getChildren().removeAll(hotelCheck,cityChoose);
		right.getChildren().add(hotelCheck);
	}
}
