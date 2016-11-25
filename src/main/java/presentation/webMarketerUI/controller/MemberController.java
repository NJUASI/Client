package presentation.webMarketerUI.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class MemberController {
	 @FXML private Pane marketCheckPane;
	 @FXML private Pane marketModifyPane;
	  @FXML
		protected void modifyMarket(){
		  marketModifyPane.setVisible(true);
		  marketCheckPane.setVisible(false);
	  }
	
	  @FXML
		protected void cancelModify(){
		  marketCheckPane.setVisible(true);
		  marketModifyPane.setVisible(false);
	  }
	  @FXML
		protected void saveModify(){
		  marketCheckPane.setVisible(true);
		  marketModifyPane.setVisible(false);
	  }
}
