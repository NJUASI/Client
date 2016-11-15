package presentation.signUpUI.view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
	
public class LogInView {



	    @FXML private Button logInWindow;
	    @FXML private Button registerWindow;
	    @FXML private Pane logInPane;
	    @FXML private Pane registerPane;
	    @FXML private Pane mainPane;
	    @FXML private Button logIn;
	    @FXML private Button register;
	    @FXML private TextField ID;
	    @FXML private TextField password;
	    @FXML private TextField password2;
	    @FXML private TextField name;
	    @FXML private TextField nickName;	 
	    @FXML private TextField phone;


	    
	    @FXML
	    protected void openLogIn() {
	    	 registerPane.setVisible(false);
	    	 logInPane.setVisible(true);
	    }
	     
	     @FXML
	     protected void openRegister() {
			 registerPane.setVisible(true);
			 logInPane.setVisible(false);
	     }

	     @FXML
		 protected void logIn() {
	    	 System.out.println(ID.getText()+" "+password.getText());
		 }
		     
		 @FXML
		 protected void register() {
			 System.out.println(password2.getText()+" "+name.getText()+" "+nickName.getText()+" "+phone.getText());
		 }

	    
	}


