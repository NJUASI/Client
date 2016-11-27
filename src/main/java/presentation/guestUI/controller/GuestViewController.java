package presentation.guestUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

/**
 * @author 61990
 *
 */
public class GuestViewController {
	Parent guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo;		
	
	    @FXML private StackPane right;
	    @FXML private Pane mainPane;
	   
		@FXML 
		protected void openGuestInfo() throws IOException {
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);
			guestInfo = FXMLLoader.load(getClass().getResource("/presentation/guestUI/view/GuestInfo.fxml"));
		
			right.getChildren().add(guestInfo);
		}
		@FXML 
		protected void openHotel() throws IOException {
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);
			hotelInfo= FXMLLoader.load(getClass().getResource("/presentation/guestUI/view/CityChoose.fxml"));
			right.getChildren().add(hotelInfo);
		}
		@FXML 
		protected void openOrder() throws IOException {
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);	
			orderInfo = FXMLLoader.load(getClass().getResource("/presentation/guestUI/view/OrderCheck.fxml"));
			right.getChildren().add(orderInfo);
		}
		@FXML 
		protected void openMember() throws IOException {
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);	
			memberInfo = FXMLLoader.load(getClass().getResource("/presentation/guestUI/view/MemberCheck.fxml"));
			right.getChildren().add(memberInfo);
		}
		@FXML 
		protected void openCredit() throws IOException {
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);	
			creditInfo = FXMLLoader.load(getClass().getResource("/presentation/guestUI/view/Credit.fxml"));
		
			right.getChildren().add(creditInfo);
		}
		@FXML 
		protected void openMain() {
			right.getChildren().removeAll(mainPane,guestInfo ,hotelInfo, orderInfo,memberInfo,creditInfo);	
			right.getChildren().add(mainPane);
		}
}
