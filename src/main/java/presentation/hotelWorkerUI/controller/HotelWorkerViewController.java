package presentation.hotelWorkerUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class HotelWorkerViewController {
	Parent hotelInfo ,orderInfo, offline,remainRoom,promotion,roomInfo;	
	
		@FXML private StackPane right;
	    @FXML private Pane mainPane;
	    
	    @FXML 
		protected void openHotelInfo() throws IOException{
			System.out.println("sss");
			hotelInfo = FXMLLoader.load(getClass().getResource("/presentation/hotelWorkerUI/view/HotelDetail.fxml"));
			right.getChildren().removeAll(mainPane,hotelInfo ,orderInfo, offline,remainRoom,promotion,roomInfo);
			right.getChildren().add(hotelInfo);
			
		}
	    @FXML 
	  		protected void openOrderInfo() throws IOException{
	  			System.out.println("sss");
	  			orderInfo = FXMLLoader.load(getClass().getResource("/presentation/hotelWorkerUI/view/OrderCheck.fxml"));
	  			right.getChildren().removeAll(mainPane,hotelInfo ,orderInfo, offline,remainRoom,promotion,roomInfo);
	  			right.getChildren().add(orderInfo);
	  			
	  		}
	    @FXML 
  		protected void openOffline() throws IOException{
  			System.out.println("sss");
  			offline = FXMLLoader.load(getClass().getResource("/presentation/hotelWorkerUI/view/Offline.fxml"));
  			right.getChildren().removeAll(mainPane,hotelInfo ,orderInfo, offline,remainRoom,promotion,roomInfo);
  			right.getChildren().add(offline);
  			
  		}
	    @FXML 
  		protected void openRemainRoom() throws IOException{
  			System.out.println("sss");
  			remainRoom = FXMLLoader.load(getClass().getResource("/presentation/hotelWorkerUI/view/RemainRoomInfo.fxml"));
  			right.getChildren().removeAll(mainPane,hotelInfo ,orderInfo, offline,remainRoom,promotion,roomInfo);
  			right.getChildren().add(remainRoom);
  		}
	    @FXML 
  		protected void openPromotion() throws IOException{
//  			System.out.println("sss");
//  			remainRoom = FXMLLoader.load(getClass().getResource("/presentation/hotelWorkerUI/view/Offline.fxml"));
//  			right.getChildren().removeAll(mainPane,hotelInfo ,orderInfo, offline,remainRoom,promotion,roomInfo);
//  			right.getChildren().add(remainRoom);
  		}
	    @FXML 
  		protected void openRoomInfo() throws IOException{
  			System.out.println("sss");
  			roomInfo = FXMLLoader.load(getClass().getResource("/presentation/hotelWorkerUI/view/RoomInfo.fxml"));
  			right.getChildren().removeAll(mainPane,hotelInfo ,orderInfo, offline,remainRoom,promotion,roomInfo);
  			right.getChildren().add(roomInfo);
  		}
	    @FXML 
  		protected void openMain() throws IOException{
  			System.out.println("sss");
  			right.getChildren().removeAll(mainPane,hotelInfo ,orderInfo, offline,remainRoom,promotion,roomInfo);
  			right.getChildren().add(mainPane);
  		}
}
