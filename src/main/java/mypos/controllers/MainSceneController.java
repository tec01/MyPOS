package mypos.controllers;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.value.WritableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import mypos.commons.SpringFXMLLoader;
import mypos.services.StageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MainSceneController implements Initializable {

	@Autowired
	private ConfigurableApplicationContext applicationContext;
	@Autowired
	private SpringFXMLLoader springFXMLLoader;

	@FXML
	private Button btnClose, btnTpv, btnProducts, btnFamilies,
	btnInvoices, btnTickets, btnOrders, btnReports, btnPreferences, btnCustomers, btnEmployees;
	@FXML
	private Pane productsPanel;
	@FXML
	private Pane familiesPanel;
	@FXML
	private Pane invoicesPanel;
	@FXML
	private Pane ticketsPanel;
	@FXML
	private Pane ordersPanel;
	@FXML
	private Pane reportsPanel;
	@FXML
	private BorderPane placeHolder;
	@FXML
	private BorderPane mainPanel;
	@FXML
	private VBox navBar;
	@FXML
	private BorderPane mainSceneCenterPanel;
	@FXML
	private JFXHamburger hamburger;
	@FXML
	private JFXDrawer menuDrawer;
	@FXML
	private BorderPane mainSceneTopBar;

	private Stage stage;
	private Double xOffset;
	private Double yOffset;

	private StageManager stageManager;

	public MainSceneController(StageManager stageManager){
		this.stageManager = stageManager;
	}

	public void initialize(URL location, ResourceBundle resources) {


		mainSceneCenterPanel.setPrefWidth(stageManager.getWidth());
		mainSceneCenterPanel.setPrefHeight(stageManager.getHeight());

		mainSceneTopBar.setPrefWidth(stageManager.getWidth());

		//menu drawer initial position
		mainPanel.setLeft(menuDrawer);
		menuDrawer.setSidePane(navBar);
		menuDrawer.open();

		//menu drawer animation
		HamburgerBackArrowBasicTransition transition1 = new HamburgerBackArrowBasicTransition(hamburger);
		transition1.setRate(1);
		transition1.play();
		hamburger.addEventFilter(MouseEvent.MOUSE_PRESSED, (e)->{
			transition1.setRate(transition1.getRate()* -1);
			transition1.play();
			if(menuDrawer.isOpened()){
				menuDrawer.close();
				moveMainPanel("LEFT");
			}else{
				moveMainPanel("RIGHT");
				menuDrawer.open();
			}
		});

	}

	private void moveMainPanel(String value){

		WritableValue<Double> xPosition = new WritableValue<>() {
			@Override
			public Double getValue() {
				return mainSceneCenterPanel.getTranslateX();
			}

			@Override
			public void setValue(Double value) {
				mainSceneCenterPanel.setTranslateX(value);
			}
		};
		WritableValue<Double> prefWidth = new WritableValue<>() {
			@Override
			public Double getValue() {
				return mainSceneTopBar.getPrefWidth();
			}

			@Override
			public void setValue(Double value) {
				mainSceneTopBar.setPrefWidth(value);
			}
		};
		System.out.println("init prefWidth:"+mainSceneTopBar.getPrefWidth());

		KeyValue positionKeyValue = null;
		KeyValue widthKeyValue = null;
		switch (value){
			case "LEFT":
				positionKeyValue = new KeyValue(xPosition,  xPosition.getValue()-menuDrawer.getWidth());
				widthKeyValue = new KeyValue(prefWidth,  mainSceneTopBar.getPrefWidth()+menuDrawer.getWidth());
				System.out.println("close width expected:"+(prefWidth.getValue()+menuDrawer.getWidth()));
				break;
			case "RIGHT":
				positionKeyValue = new KeyValue(xPosition,  xPosition.getValue()+menuDrawer.getWidth());
				widthKeyValue = new KeyValue(prefWidth,  mainSceneTopBar.getPrefWidth()-menuDrawer.getWidth());
				System.out.println("open width expected:"+(prefWidth.getValue()-menuDrawer.getWidth()));
				break;
			default:
				break;
		}
		KeyFrame keyFramePosition = new KeyFrame(Duration.millis(450), positionKeyValue );
		KeyFrame keyFrameWidth = new KeyFrame(Duration.millis(445),widthKeyValue );


		Timeline animTimer = new Timeline();
		animTimer.setCycleCount(1);
		animTimer.setAutoReverse(false);
		animTimer.getKeyFrames().addAll(keyFramePosition, keyFrameWidth);
		animTimer.play();
		System.out.println("result width:"+mainSceneTopBar.getPrefWidth());

	}

	public void changePanel(ActionEvent event) throws IOException {
		Node node = null;
		if(event.getSource().equals(btnProducts)){
			node = (Node) springFXMLLoader.load("/mypos/fxml/Products.fxml");
		}else if(event.getSource().equals(btnFamilies)){
			node = (Node) springFXMLLoader.load("/mypos/fxml/Families.fxml");
		}else if(event.getSource().equals(btnInvoices)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Tickets.fxml");
		}else if(event.getSource().equals(btnTickets)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Invoices.fxml");
		}else if(event.getSource().equals(btnOrders)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Orders.fxml");
		}else if(event.getSource().equals(btnReports)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Reports.fxml");
		}else if(event.getSource().equals(btnCustomers)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Customers.fxml");
		}else if(event.getSource().equals(btnEmployees)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Employees.fxml");
		}else if(event.getSource().equals(btnPreferences)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Database.fxml");
		}else if(event.getSource().equals(btnPreferences)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Printers.fxml");
		}else if(event.getSource().equals(btnPreferences)) {
			node = (Node) springFXMLLoader.load("/mypos/fxml/Permissions.fxml");
		}
		placeHolder.getChildren().clear();
		placeHolder.setCenter(node);


	}

	public void moveWindow(MouseEvent event){
		stage = (Stage) placeHolder.getScene().getWindow();
		stage.setX(event.getScreenX() + xOffset);
		stage.setY(event.getScreenY() + yOffset);
	}

	public void takeCurrentPosition(MouseEvent event){
		stage = (Stage) placeHolder.getScene().getWindow();
		xOffset = stage.getX() - event.getScreenX();
		yOffset = stage.getY() - event.getScreenY();
	}

	public void close(){
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Close program?", ButtonType.YES, ButtonType.NO);
		alert.showAndWait();

		if (alert.getResult() == ButtonType.YES) {
			applicationContext.close();
			Platform.exit();
		}
	}

}
