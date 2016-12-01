package presentation.webMarketerUI.controller;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import vo.AddressVO;
import vo.PromotionVO;

public class DatePromotionController {
//
//	@FXML
//	private TableView<DatePromotion> table;
//	@FXML
//	private TableColumn<DatePromotion, String> nameColumn,  discountColumn , startDateColumn , endDateColumn;
//	@FXML
//	private TextField nameText,discountText;
//	@FXML
//	private DatePicker startDate, endDate;
//
//	/**
//	 * @author 61990
//	 * @lastChangedBy 61990
//	 * @updateTime 2016/11/27 构造函数，初始化成员变量
//	 */
//	@FXML
//	private void initialize() {
//		List<DatePromotion> datePromotion = new LinkedList<DatePromotion>();
//		datePromotion.add(new PromotionVO("兰州", "www", 0.9));
//		datePromotion.add(new PromotionVO("兰州", "www", 0.9));
//		datePromotion.add(new PromotionVO("兰州", "www", 0.9));
//		datePromotion.add(new PromotionVO("兰州", "www", 0.9));
//		datePromotion.add(new PromotionVO("兰州", "www", 0.9));
//	
//
//		ObservableList<Address> data = FXCollections.observableArrayList();
//		for (int i = 0; i < address.size(); i++) {
//			data.add(new Address(address.get(i).city, address.get(i).cycle, Double.toString(address.get(i).discout)));
//		}
//		cityColumn.setCellValueFactory(cellData -> cellData.getValue().city);
//		cycleColumn.setCellValueFactory(cellData -> cellData.getValue().cycle);
//		discountColumn.setCellValueFactory(cellData -> cellData.getValue().discount);
//
//		table.setItems(data);
//	
//
//	}
//	/**
//	 * @author 61990
//	 * @lastChangedBy 61990
//	 * @updateTime 2016/11/30
//	 * @获取表中内容直接修改
//	 */
//	@FXML
//	protected void modifyOne() {
//		if(table.getSelectionModel() != null){
//			cityInput.setText(table.getSelectionModel().getSelectedItem().getCity());
//			cycleInput.setValue(table.getSelectionModel().getSelectedItem().getCycle());
//			cycleDiscount.setText(table.getSelectionModel().getSelectedItem().getDiscount());
//
//		}else{
//			System.out.println("请选定或者输入城市商圈");
//		}
//	}
//	/**
//	 * @author 61990
//	 * @lastChangedBy 61990
//	 * @updateTime 2016/11/30
//	 * @保存双十一策略
//	 */
//	@FXML
//	protected void saveDoublePromotion() {
//		
//		
//		final LocalDate s1 = beginTime2.getValue();
//		final LocalDate s2 = beginTime2.getValue();
//		// PromotionVO promitonVO=new
//		// PromotionVO(PromotionType.HOTEL__HOLIDAY,Double.parseDouble(doubleDiscount2.getText()),s1,s2);
//		System.out.println("success");
//	}
//
//	/**
//	 * @author 61990
//	 * @lastChangedBy 61990
//	 * @updateTime 2016/11/30
//	 * @保存双十一策略
//	 */
//	@FXML
//	protected void openModify() {
//		name2.setText(name.getText());
//		doubleDiscount2.setText(doubleDiscount.getText());
//		final int[] date1 = stringToInt(beginTime.getText());
//		final int[] date2 = stringToInt(endTime.getText());
//		beginTime2.setValue(LocalDate.of(date1[0], date1[1], date1[2]));
//		endTime2.setValue(LocalDate.of(date2[0], date2[1], date2[2]));
//		modifyPane.setVisible(true);
//	}
//
//	// 数据类型转化便于datepiker
//	private int[] stringToInt(final String str) {
//		final int[] date = new int[3];
//		final String s[] = str.split("-");
//		for (int i = 0; i < date.length; i++) {
//			date[i] = Integer.parseInt(s[i]);
//		}
//		return date;
//	}
//
//	/**
//	 * @author 61990
//	 * @lastChangedBy 61990
//	 * @updateTime 2016/11/30
//	 * @取消修改双十一策略
//	 */
//	@FXML
//	protected void cancelModifyDouble() {
//		modifyPane.setVisible(false);
//	}
//
//	@FXML
//	private TextField cityInput, cycleDiscount;
//	
//	@FXML
//	private ComboBox<String> cycleInput;
//
//	/**
//	 * @author 61990
//	 * @lastChangedBy 61990
//	 * @updateTime 2016/11/30
//	 * @查找商圈
//	 */
//	@FXML
//	protected void searchCycle() {
//		List<String> list = getCycle(cityInput.getText());
//		cycleInput.getItems().clear();
//		for (int i = 0; i < list.size(); i++) {
//			cycleInput.getItems().add(list.get(i));
//		}
//	}
//
//	List<String> getCycle(String city) {
//		List<String> list = new LinkedList<String>();
//		list.add("123");
//		list.add("1233");
//		list.add("1231");
//		list.add("1232");
//		list.add("1213");
//		list.add("1123");
//		return list;
//	}
//
//	/**
//	 * @author 61990
//	 * @lastChangedBy 61990
//	 * @updateTime 2016/11/30
//	 * @保存地区策略
//	 */
//	@FXML
//	protected void saveLocalPromotion() {
//		cityInput.getText();
//		System.out.println(cycleInput.getValue());
//		cycleDiscount.getText();
//	}

}