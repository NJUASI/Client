package presentation.guestUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class GuestController {
	  @FXML private Pane guestCheck;
	  @FXML private Pane guestModify;
	
	  @FXML
		protected void modifyGuestInfo(){
		  guestModify.setVisible(true);
		  guestCheck.setVisible(false);
	  }
	 
	  @FXML
		protected void  saveGuestInfo(){
		  guestModify.setVisible(false);
		  guestCheck.setVisible(true);
	  }
	  @FXML
			protected void  cancer(){
			  guestModify.setVisible(false);
			  guestCheck.setVisible(true);
		  }
}
