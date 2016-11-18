package presentation.guestUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class GuestViewController {
	Parent guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo;		
	
	    @FXML private StackPane right;
	    @FXML private Pane mainPane;
	   
		@FXML 
		protected void openGuestInfo() throws IOException{
			guestInfo = FXMLLoader.load(getClass().getResource("/presentation/GuestUI/view/GuestInfo.fxml"));
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);
			right.getChildren().add(guestInfo);
		}
		@FXML 
		protected void openHotel() throws IOException{
			hotelInfo= FXMLLoader.load(getClass().getResource("/presentation/GuestUI/view/CityChoose.fxml"));
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);
			right.getChildren().add(hotelInfo);
		}
		@FXML 
		protected void openOrder() throws IOException{
			orderInfo = FXMLLoader.load(getClass().getResource("/presentation/GuestUI/view/OrderCheck.fxml"));
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);	
			right.getChildren().add(orderInfo);
		}
		@FXML 
		protected void openMember() throws IOException{
			memberInfo = FXMLLoader.load(getClass().getResource("/presentation/GuestUI/view/MemberCheck.fxml"));
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);	
			right.getChildren().add(memberInfo);
		}
		@FXML 
		protected void openCredit() throws IOException{
			creditInfo = FXMLLoader.load(getClass().getResource("/presentation/GuestUI/view/Credit.fxml"));
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);	
			right.getChildren().add(creditInfo);
		}
		@FXML 
		protected void openMain(){
			right.getChildren().removeAll(guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);	
			right.getChildren().add(mainPane);
		}
}
