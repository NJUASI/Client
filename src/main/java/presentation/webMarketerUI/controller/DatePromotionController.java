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


public class DatePromotionController {

	@FXML
	private TableView<DatePromotion> table;
	@FXML
	private TableColumn<DatePromotion, String> nameColumn,  discountColumn , startDateColumn , endDateColumn;
	@FXML
	private TextField nameText,discountText;
	@FXML
	private DatePicker startDatePicker, endDatePicker;

	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27 构造函数，初始化成员变量
	 */
	@FXML
	private void initialize() {
		table.getItems().clear();
		List<DatePromotion> datePromotion = new LinkedList<DatePromotion>();
		datePromotion.add(new DatePromotion("兰州", "www", LocalDate.of(2014,4,3),LocalDate.of(2014,4,23)));
		datePromotion.add(new DatePromotion("兰2州", "w2ww", LocalDate.of(2015,6,7),LocalDate.of(2014,4,23)));
		datePromotion.add(new DatePromotion("兰1州", "w2ww", LocalDate.of(2015,6,7),LocalDate.of(2014,4,23)));
		datePromotion.add(new DatePromotion("兰4s州", "w2ww", LocalDate.of(2015,6,7),LocalDate.of(2014,4,23)));

		ObservableList<DatePromotion> data = FXCollections.observableArrayList();
		for (int i = 0; i < datePromotion.size(); i++) {
			data.add(datePromotion.get(i));
		}
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().name);
		startDateColumn.setCellValueFactory(cellData -> cellData.getValue().startDate);
		endDateColumn.setCellValueFactory(cellData -> cellData.getValue().endDate);
		discountColumn.setCellValueFactory(cellData -> cellData.getValue().discount);

		table.setItems(data);
	

	}
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @获取表中内容直接修改
	 */
	@FXML
	protected void modifyOne() {
		try{
		
			nameText.setText(table.getSelectionModel().getSelectedItem().getName());
			discountText.setText(table.getSelectionModel().getSelectedItem().getDiscount());

			 startDatePicker.setValue(table.getSelectionModel().getSelectedItem().getStartDate());
			 endDatePicker.setValue(table.getSelectionModel().getSelectedItem().getEndDate());
			 
		} catch (Exception e) {
			System.out.println("请选定");
		}
	}
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @保存双十一策略
	 */
	@FXML
	protected void savePromotion() {
		try {
//			final LocalDate s1 = beginTime2.getValue();
//		final LocalDate s2 = beginTime2.getValue();
		// PromotionVO promitonVO=new
		// PromotionVO(PromotionType.HOTEL__HOLIDAY,Double.parseDouble(doubleDiscount2.getText()),s1,s2);
		System.out.println("success");
		
		initialize();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @删除双十一策略
	 */
	@FXML
	protected void deleteOne() {
		//通过name删除
//		table.getSelectionModel().getSelectedItem().getName();
		
	}
}