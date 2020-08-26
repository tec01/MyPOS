package mypos.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import mypos.commons.SpringFXMLLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

@Component
public class MainSceneController  {

	@Autowired
	private SpringFXMLLoader springFXMLLoader;

	@FXML
	private Button btnExit, btnTpv, btnProducts, btnFamilies,
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
	private Pane placeHolder;

	public MainSceneController(){

	}

	public void initialize(URL location, ResourceBundle resources) {

	}

	public void closeProgramm() {
		System.exit(0);
	}

	public void changePanel(ActionEvent event) throws IOException {
		placeHolder.getChildren().clear();
		if(event.getSource().equals(btnProducts)){
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Products.fxml"));
		}else if(event.getSource().equals(btnFamilies)){
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Families.fxml"));
		}else if(event.getSource().equals(btnInvoices)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Tickets.fxml"));
		}else if(event.getSource().equals(btnTickets)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Invoices.fxml"));
		}else if(event.getSource().equals(btnOrders)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Orders.fxml"));
		}else if(event.getSource().equals(btnReports)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Reports.fxml"));
		}else if(event.getSource().equals(btnCustomers)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Customers.fxml"));
		}else if(event.getSource().equals(btnEmployees)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Employees.fxml"));
		}else if(event.getSource().equals(btnPreferences)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Database.fxml"));
		}else if(event.getSource().equals(btnPreferences)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Printers.fxml"));
		}else if(event.getSource().equals(btnPreferences)) {
			placeHolder.getChildren().add((Node) springFXMLLoader.load("/mypos/fxml/Permissions.fxml"));
		}
		
	}

}
