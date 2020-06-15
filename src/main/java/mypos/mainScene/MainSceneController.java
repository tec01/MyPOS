package mypos.mainScene;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

@Controller
public class MainSceneController implements Initializable {

	@FXML
	private Button btnExit, btnTpv, btnInventory, btnFamilies, 
	btnInvoices, btnTickets, btnOrders, btnReports, btnPreferences;
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void closeProgramm() {
		System.exit(0);
	}

	public void changePanel(ActionEvent event) throws IOException {
		
		placeHolder.getChildren().clear();
		if(event.getSource().equals(btnInventory)){	
			placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource("/mypos/fxml/Inventory.fxml")));
		}else if(event.getSource().equals(btnInvoices)) {
			placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource("/mypos/fxml/Invoices.fxml")));
		}else if(event.getSource().equals(btnTickets)) {
			placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource("/mypos/fxml/Tickets.fxml")));
		}else if(event.getSource().equals(btnOrders)) {
			placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource("/mypos/fxml/Orders.fxml")));
		}else if(event.getSource().equals(btnReports)) {
			placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource("/mypos/fxml/Reports.fxml")));
		}else if(event.getSource().equals(btnPreferences)) {
			placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource("/mypos/fxml/Preferences.fxml")));
		}
		
	}

}
