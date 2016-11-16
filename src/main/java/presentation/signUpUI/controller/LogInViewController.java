package presentation.signUpUI.controller;

import java.io.IOException;

import com.sun.javafx.robot.impl.FXRobotHelper;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
	
@SuppressWarnings("restriction")
public class LogInViewController {



	    @FXML private Button logInWindow;
	    @FXML private Button registerWindow;
	    @FXML private Pane logInPane;
	    @FXML private Pane registerPane;
	    @FXML private Pane mainPane;
	    @FXML public Button logIn;
	    @FXML private Button register;
	    @FXML private TextField ID;
	    @FXML private TextField password;
	    @FXML private TextField password2;
	    @FXML private TextField name;
	    @FXML private TextField nickName;	 
	    @FXML private TextField phone;


	    
//	    public LogInView(Stage stage) {
//			this.stage=stage;
//		}

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
	 		try {
				Parent root = FXMLLoader.load(getClass().getResource("/presentation/GuestUI/view/Guest.fxml"));
			 ObservableList<Stage> stage = FXRobotHelper.getStages();

	    	 Scene scene = new Scene(root);
	    	 stage.get(0).setScene(scene);

	 		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	
			
	     }
		     
		 @FXML
		 protected void register() {
			 System.out.println(password2.getText()+" "+name.getText()+" "+nickName.getText()+" "+phone.getText());
		 }

	    
	}


