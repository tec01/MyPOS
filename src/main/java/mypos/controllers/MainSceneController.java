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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MainSceneController implements Initializable  {

	private static Logger LOG = LogManager.getLogger(MainSceneController.class);

	private ConfigurableApplicationContext applicationContext;
	private SpringFXMLLoader springFXMLLoader;

	@FXML
	private BorderPane borderPanel;
	@FXML
	private BorderPane mainPanel;
	@FXML
	private BorderPane placeHolder;
	@FXML
	private BorderPane topBar;
	@FXML
	private JFXDrawer navBarDrawer;
	@FXML
	private VBox navBar;


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
	private JFXHamburger hamburger;


	private Stage stage;
	private Double xOffset;
	private Double yOffset;

	private StageManager stageManager;

	public MainSceneController(StageManager stageManager,SpringFXMLLoader springFXMLLoader,
							   ConfigurableApplicationContext applicationContext){
		this.stageManager = stageManager;
		this.springFXMLLoader=springFXMLLoader;
		this.applicationContext=applicationContext;
	}

	public void initialize(URL location, ResourceBundle resources) {

		//menu drawer initial position
		navBarDrawer.setSidePane(navBar);
		navBarDrawer.open();

		//menu drawer animation
		HamburgerBackArrowBasicTransition transition1 = new HamburgerBackArrowBasicTransition(hamburger);
		transition1.setRate(1);
		transition1.play();
		hamburger.addEventFilter(MouseEvent.MOUSE_PRESSED, (e)->{
			transition1.setRate(transition1.getRate()* -1);
			transition1.play();
			if(navBarDrawer.isOpened()){
				navBarDrawer.close();
				resizeMainPanel("LEFT");
			}else{
				resizeMainPanel("RIGHT");
				navBarDrawer.open();
			}
		});

	}

	private void resizeMainPanel(String value){

		WritableValue<Double> xCoordinate = new WritableValue<>() {
			@Override
			public Double getValue() {
				return mainPanel.getTranslateX();
			}

			@Override
			public void setValue(Double value) {
				mainPanel.setTranslateX(value);
			}
		};
		WritableValue<Double> prefWidth = new WritableValue<>() {
			@Override
			public Double getValue() {
				return mainPanel.getWidth();
			}

			@Override
			public void setValue(Double value) {
				mainPanel.setMinWidth(value);
			}
		};

		KeyValue positionKeyValue = null;
		KeyValue widthKeyValue = null;
		switch (value){
			case "LEFT":
				positionKeyValue = new KeyValue(mainPanel.translateXProperty(),  mainPanel.getTranslateX()-navBarDrawer.getWidth());
				widthKeyValue = new KeyValue(prefWidth,  mainPanel.getWidth()+navBarDrawer.getWidth());
				break;
			case "RIGHT":
				positionKeyValue = new KeyValue(mainPanel.translateXProperty(),  mainPanel.getTranslateX()+navBarDrawer.getWidth());
				widthKeyValue = new KeyValue(prefWidth,  mainPanel.getWidth()-navBarDrawer.getWidth());
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
