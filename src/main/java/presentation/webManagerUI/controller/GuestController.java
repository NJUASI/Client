package presentation.webManagerUI.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class GuestController {
	 @FXML private Pane guestSearchPane;
	  @FXML private Pane guestModifyPane;
	  @FXML private Pane creditPane;
	  @FXML private Pane guestInfoPane;
	  
	  @FXML
		protected void search(){
		  guestInfoPane.setVisible(true);
	  }
	  @FXML
		protected void modifyGuest(){
		  guestModifyPane.setVisible(true);
		  guestSearchPane.setVisible(false);
	  }
	  @FXML
		protected void creditCheck(){
		  creditPane.setVisible(true);
		  guestSearchPane.setVisible(false);
	  }
	  @FXML
		protected void cancelCreditCheck(){
		  creditPane.setVisible(false);
		  guestSearchPane.setVisible(true);
	  }
	  @FXML
		protected void cancelModify(){
		  guestSearchPane.setVisible(true);
		  guestModifyPane.setVisible(false);
	  }
	  @FXML
		protected void saveModify(){
		  guestSearchPane.setVisible(true);
		  guestModifyPane.setVisible(false);
	  }
	  
}
