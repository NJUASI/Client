package presentation.signUpUI.view;


import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start(Stage stage) throws IOException  {
		Parent root = FXMLLoader.load(getClass().getResource("logIn.fxml"));
//		Pane root=new Pane();
		Scene scene = new Scene(root, 1000, 625);
//		LogInView login= new LogInView();
//		login.logIn.setText("sss");
//	       
		stage.setTitle("酒店互联网预定系统");
		stage.setScene(scene);
		
		stage.show();
	}
	public static void main(String[] args) {
	       launch(args);
	   }
}
