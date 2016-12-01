package presentation.webManagerUI.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class HotelWorkerController {
	  @FXML private Pane hotelInfoPane;
	  @FXML private Pane hotelModifyPane;
	  
	  @FXML
		protected void search(){
		  hotelInfoPane.setVisible(true);
	  }
	  @FXML
		protected void modifyHotel(){
		  hotelModifyPane.setVisible(true);
		  hotelInfoPane.setVisible(false);
	  }
	  @FXML
		protected void saveModify(){
		  hotelModifyPane.setVisible(false);
		  hotelInfoPane.setVisible(true);
	  } @FXML
		protected void cancelModify(){
		  hotelModifyPane.setVisible(false);
		  hotelInfoPane.setVisible(true);
	  }
}
