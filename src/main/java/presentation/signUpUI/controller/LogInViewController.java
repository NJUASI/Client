package presentation.signUpUI.controller;

import java.io.IOException;

import com.sun.javafx.robot.impl.FXRobotHelper;

import businessLogic.logInBL.LogInController;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
	
public class LogInViewController {
	
	//登录和注册界面
	@FXML
	private Pane logInPane;
	@FXML
	private Pane registerPane;
	//登录信息
	@FXML
	private TextField ID;
	@FXML
	private TextField password;
	//注册信息
	@FXML
	private TextField password2;
	@FXML
	private TextField name;
	@FXML
	private TextField nickName;
	@FXML
	private TextField phone;

	@FXML
	private void initialize() {
		
	}
	
	//切换登录界面
	@FXML
	protected void openLogIn() {
		registerPane.setVisible(false);
		logInPane.setVisible(true);
	}
	
	@FXML
	public void openRegister() {
		registerPane.setVisible(true);
		logInPane.setVisible(false);
	}



	@FXML
	protected void logIn() {
		 System.out.println(ID.getText()+" "+password.getText());
		try {
			Parent root = null;
			if (ID.getText().length() == 1) {
				root = FXMLLoader.load(getClass().getResource("/presentation/GuestUI/view/Guest.fxml"));
			} else if (ID.getText().length() == 2) {
				root = FXMLLoader.load(getClass().getResource("/presentation/HotelWorkerUI/view/Hotel.fxml"));
			} else if (ID.getText().length() == 3) {
				root = FXMLLoader.load(getClass().getResource("/presentation/webManagerUI/view/Manager.fxml"));
			} else if (ID.getText().length() == 4) {
				root = FXMLLoader.load(getClass().getResource("/presentation/webMarketerUI/view/Marketer.fxml"));
			}
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
		System.out
				.println(password2.getText() + " " + name.getText() + " " + nickName.getText() + " " + phone.getText());
	}

}
