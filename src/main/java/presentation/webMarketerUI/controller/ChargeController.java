package presentation.webMarketerUI.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class ChargeController {
	 @FXML private Pane chargePane;
	  
	  @FXML
		protected void search(){
		  chargePane.setVisible(true);
	  }
	
	  @FXML
		protected void saveCharge(){
		  
	  } @FXML
		protected void cancelCharge(){
		  chargePane.setVisible(false);
	  }
}
