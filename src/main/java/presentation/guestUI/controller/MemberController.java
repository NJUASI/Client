package presentation.guestUI.controller;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class MemberController {
	 @FXML private Pane memberCheck;
	  @FXML private Pane memberModify;
	  @FXML
		protected void register(){
		  memberCheck.setVisible(false);
		  memberModify.setVisible(true);
	  }
	  @FXML
		protected void cancer(){
		  memberCheck.setVisible(true);
		  memberModify.setVisible(false);
	  }
}
