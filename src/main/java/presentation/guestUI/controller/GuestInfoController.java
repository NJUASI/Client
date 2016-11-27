package presentation.guestUI.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class GuestInfoController {
	//加载guestInfo相关界面
	@FXML
	private Pane guestCheck;
	@FXML
	private Pane guestModify;
	
	// guestInfo界面内容
	@FXML
	private Label guestID, name, nickname, password, credit, phone;
	
	// modify 界面内容
	@FXML
	private TextField name2, nickname2, phone2, password2;
	
	//初始化guestInfo界面
	@FXML
	private void initialize() {
		guestID.setText(" ");
		name.setText(" ");
		nickname.setText(" ");
		password.setText(" ");
		credit.setText(" ");
		phone.setText(" ");
	}
	
	//点击修改按钮
	@FXML
	protected void modifyGuestInfo() {
		guestModify.setVisible(true);
		guestCheck.setVisible(false);
		
		// 初始化modify界面
		name2.setText(name.getText());
		nickname2.setText(nickname.getText());
		phone2.setText(phone.getText());
		password2.setText(password.getText());
	}
	//点击保存按钮，保存客户信息
	@FXML
	protected void saveGuestInfo() {
		guestModify.setVisible(false);
		guestCheck.setVisible(true);
		name.setText(name2.getText());
		nickname.setText(nickname2.getText());
		phone.setText(phone2.getText());
		password.setText(password2.getText());
	}
	//取消本次修改
	@FXML
	protected void cancer() {
		guestModify.setVisible(false);
		guestCheck.setVisible(true);
	}
}
