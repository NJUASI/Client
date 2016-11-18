package presentation.webManagerUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class WebManagerViewController {
	Parent guest,hotel, marketer,hotelInfo;		
	
    @FXML private StackPane right;
    @FXML private Pane mainPane;
    
	@FXML 
	protected void openGuest() throws IOException{
	
		guest = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/Guest.fxml"));
		right.getChildren().removeAll(mainPane,guest,hotel, marketer,hotelInfo);
		right.getChildren().add(guest);
		
	}
	@FXML 
	protected void openHotel() throws IOException{
		
		hotel = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/HotelWorker.fxml"));
		right.getChildren().removeAll(mainPane,guest,hotel, marketer,hotelInfo);
		right.getChildren().add(hotel);
		
	}
	@FXML 
	protected void openMarketer() throws IOException{
		
		marketer = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/Marketer.fxml"));
		right.getChildren().removeAll(mainPane,guest,hotel, marketer,hotelInfo);
		right.getChildren().add(marketer);
		
	}
	@FXML 
	protected void openHotelInfo() throws IOException{
		
		hotelInfo = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/HotelInfo.fxml"));
		right.getChildren().removeAll(mainPane,guest,hotel, marketer,hotelInfo);
		right.getChildren().add(hotelInfo);	
	}
	
	@FXML 
	protected void openMain(){
		right.getChildren().removeAll(mainPane,guest,hotel, marketer,hotelInfo);
		right.getChildren().add(mainPane);	
	}
}
