package presentation.webMarketerUI.controller;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

public class WebMarketerViewController {
	Parent charge, market, promotion, abnormalOrder;		
	
    @FXML private StackPane right;
    @FXML private Pane mainPane;
	@FXML 
	protected void openMain(){
		right.getChildren().removeAll(mainPane, charge, market, promotion, abnormalOrder);
		right.getChildren().add(mainPane);	
	}
	@FXML 
	protected void openCharge() throws IOException{
		charge = FXMLLoader.load(getClass().getResource("/presentation/webMarketerUI/view/Charge.fxml"));
		right.getChildren().removeAll(mainPane, charge, market, promotion, abnormalOrder);
		right.getChildren().add(charge);
	}
	@FXML 
	protected void openMarket() throws IOException{
		market= FXMLLoader.load(getClass().getResource("/presentation/webMarketerUI/view/MemberCheck.fxml"));
		right.getChildren().removeAll(mainPane, charge, market, promotion, abnormalOrder);
		right.getChildren().add(market);
	}
	@FXML 
	protected void openPromotion() throws IOException{
//		 promotion = FXMLLoader.load(getClass().getResource("/presentation/webMarketerUI/view/Promotion.fxml"));
//		right.getChildren().removeAll(mainPane, charge, market, promotion, abnormalOrder);
//		right.getChildren().add( promotion);
	}
	@FXML 
	protected void openOrder() throws IOException{
		abnormalOrder = FXMLLoader.load(getClass().getResource("/presentation/webMarketerUI/view/orderSearch.fxml"));
		right.getChildren().removeAll(mainPane, charge, market, promotion, abnormalOrder);
		right.getChildren().add(abnormalOrder);
	}
}
