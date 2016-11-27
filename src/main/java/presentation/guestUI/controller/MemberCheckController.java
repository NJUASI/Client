package presentation.guestUI.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class MemberCheckController {
	@FXML
	private Pane memberCheck;
	@FXML
	private Pane memberModify;

	@FXML
	private Label enterprise, market, market2, birthday;

	@FXML
	private void initialize() {
		enterprise.setText(" ");
		market.setText(" ");
		market2.setText(" ");
		birthday.setText(" ");
	}

	// 注册界面
	@FXML
	private Pane commonPane;
	@FXML
	private Pane enterprisePane;

	@FXML
	protected void register() {
		memberCheck.setVisible(false);
		memberModify.setVisible(true);
		if (enterprise.getText() != "") {
			commonPane.setDisable(false);
		}
		if (enterprise.getText() != "") {
			enterprisePane.setDisable(false);
		}
	}

	// 企业会员提交
	@FXML
	protected void registerEnterprise() {

	}

	// 普通会员提交
	@FXML
	protected void registerCommon() {

	}

	@FXML
	protected void cancer() {
		memberCheck.setVisible(true);
		memberModify.setVisible(false);
	}
}
