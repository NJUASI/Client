package presentation.webMarketerUI.controller;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;


import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import vo.AddressVO;


public class PromotionController {
    
    @FXML private Pane modifyPane;
    @FXML private TableView<Address> table;
    @FXML private TableColumn<Address, String> cityColumn,cycleColumn,discountColumn;
    @FXML private Label name,doubleDiscount,beginTime,endTime; 	
    @FXML private TextField name2,doubleDiscount2;
    @FXML private DatePicker beginTime2,endTime2; 	
    /**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/27 构造函数，初始化成员变量
	 */
	@FXML
	private void initialize() {
		List<AddressVO> address=new LinkedList<AddressVO>();
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));
				address.add(new AddressVO("兰州","www",0.9));

		ObservableList<Address> data = FXCollections.observableArrayList();
		for (int i = 0; i < address.size(); i++) {
			data.add(new Address(address.get(i).city,address.get(i).circle,Double.toString(address.get(i).discout)));
		}
		cityColumn.setCellValueFactory(cellData -> cellData.getValue().city);
		cycleColumn.setCellValueFactory(cellData -> cellData.getValue().cycle);
		discountColumn.setCellValueFactory(cellData -> cellData.getValue().discount);
		
		table.setItems(data);	
	}
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @保存双十一策略
	 */
	@FXML
	protected void saveDoublePromotion() {
		LocalDate s1=beginTime2.getValue();
		LocalDate s2=beginTime2.getValue();
//		PromotionVO promitonVO=new PromotionVO(PromotionType.HOTEL__HOLIDAY,Double.parseDouble(doubleDiscount2.getText()),s1,s2);
		System.out.println("success");
	}
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @保存双十一策略
	 */
	@FXML
	protected void openModify() {
		name2.setText(name.getText());
		doubleDiscount2.setText(doubleDiscount.getText());
		int date1[]=stringToInt(beginTime.getText());
		int date2[]=stringToInt(endTime.getText());
		beginTime2.setValue(LocalDate.of(date1[0], date1[1], date1[2]));
		endTime2.setValue(LocalDate.of(date2[0], date2[1], date2[2]));
		modifyPane.setVisible(true);
	}
	//数据类型转化便于datepiker
	private int[] stringToInt(String str){
		int date[]=new int[3];
		String s[] = str.split("-");
		for (int i = 0; i < date.length; i++) {
			date[i]=Integer.parseInt(s[i]);
		}
		return date;
	}
	
	
	
	@FXML private TextField cityInput,cycleDiscount;
	@FXML private ChoiceBox<String> cycleInput;
	@FXML private ComboBox<String> cycleInput2;
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @查找商圈
	 */
	@FXML
	protected void searchCycle() {
		List<String> list=getCycle(cityInput.getText());
		for (int i = 0; i < list.size(); i++) {
			cycleInput2.getItems().add(list.get(i));
		}
	}
	List<String> getCycle(String city){
		List<String> list = new LinkedList<String>();
		list.add("123");
		list.add("1233");
		list.add("1231");
		list.add("1232");
		list.add("1213");
		list.add("1123");
		return list;
	}
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @保存地区策略
	 */
	@FXML
	protected void saveLocalPromotion() {
		
	}
	
	/**
	 * @author 61990
	 * @lastChangedBy 61990
	 * @updateTime 2016/11/30
	 * @取消修改双十一策略
	 */
	@FXML
	protected void cancelModifyDouble() {
		modifyPane.setVisible(false);
	}
}
class Address{
	public final SimpleStringProperty city;
     public final SimpleStringProperty cycle;
     public final SimpleStringProperty discount;
     
	 public Address(String city, String cycle, String discount) {
		this.city=new SimpleStringProperty(city); 
		this.cycle=new SimpleStringProperty(cycle); 
		this.discount=new SimpleStringProperty(discount);
	} 
	public void setDiscount(String discount) {
		 this.discount.set(discount);
	}
	public void setCity(String city) {
         this.city.set(city);
    }
	public void setCycle(String cycle) {
		this.cycle.set(cycle);
	}
	public String getCity() {
        return city.get();
    }
	public String getCycle() {
        return cycle.get();
    }
	public String getDiscount() {
        return discount.get();
    }
}

