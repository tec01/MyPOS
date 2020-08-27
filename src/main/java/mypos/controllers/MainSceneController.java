package mypos.controllers;

import javafx.application.Platform;
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
import mypos.commons.SpringFXMLLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MainSceneController implements Initializable {

	@Value("${fxml.main-panels.common-width}")
	private Double commonWidth;
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
	private VBox navBar;
	@FXML
	private BorderPane mainSceneCenterPanel;

	private Stage stage;
	private Double xOffset;
	private Double yOffset;
	public MainSceneController(){

	}

	public void initialize(URL location, ResourceBundle resources) {
		mainSceneCenterPanel.setPrefWidth(commonWidth);

	}

	public void closeProgramm() {
		System.exit(0);
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
