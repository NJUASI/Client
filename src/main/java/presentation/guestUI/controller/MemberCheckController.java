package presentation.guestUI.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

/**
 * @author 61990
 * @控制会员查看注册界面
 * @version 11.27
 */
public class MemberCheckController {
	
	@FXML
	private Pane memberCheck;
	
	@FXML
	private Pane memberModify;

	@FXML
	private Label enterprise, market, market2, birthday;

	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27
	 * 构造函数，初始化成员变量
	 */
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

	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27
	 * @跳转会员注册界面
	 */
	@FXML
	protected void register() {
		memberCheck.setVisible(false);
		memberModify.setVisible(true);
		if (!"".equals(enterprise.getText())) {
			commonPane.setDisable(false);
		}
		if (!"".equals(enterprise.getText())) {
			enterprisePane.setDisable(false);
		}
	}

	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27
	 * @企业会员提交
	 */
	@FXML
	protected void registerEnterprise() {

	}

	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27
	 * @普通会员提交
	 */
	@FXML
	protected void registerCommon() {

	}

	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27
	 * @返回会员信息界面
	 */
	@FXML
	protected void cancer() {
		memberCheck.setVisible(true);
		memberModify.setVisible(false);
	}
}
