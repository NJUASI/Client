package presentation.signUpUI.view;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

	public void start(Stage stage) throws IOException  {
		Parent root = FXMLLoader.load(getClass().getResource("logIn.fxml"));
//		Pane root=new Pane();
		Scene scene = new Scene(root, 1000, 625);
	
		stage.setTitle("酒店互联网管理系统");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
	       launch(args);
	   }
}
