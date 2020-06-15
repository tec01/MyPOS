package mypos.management.products;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import mypos.commons.ConditionalOperator;
import org.controlsfx.control.CheckComboBox;
import org.springframework.stereotype.Controller;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Controller
public class ProductsController implements Initializable {

    @FXML
    private TextField txtFieldProductName;
    @FXML
    private TextField txtFieldProvider;

    @FXML
    private TextField txtFieldFamily;
    @FXML
    private CheckComboBox<ProductType> comboProductType;
    @FXML
    private ComboBox<ConditionalOperator> comBoxCondOperator;
    @FXML
    private Spinner<Double> spinPrice1;
    @FXML
    private CheckBox chBoxWeighted;
    @FXML
    private TableView<Product> productsTable;
    @FXML
    private Button btnSearch;
    @FXML
    private Button btnReset;
    @FXML
    private StackPane placeHolder;

    private static Logger LOG = LogManager.getLogger(ProductsController.class);
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //setup ConditionalOperator
        List<ConditionalOperator> condOperators = Arrays.asList(ConditionalOperator.values());
        comBoxCondOperator.setItems(FXCollections.observableList(condOperators));
        comBoxCondOperator.getSelectionModel().selectFirst();
        //setup product types
        List<ProductType> prodTypes = Arrays.asList(ProductType.values());
        comboProductType.getItems().addAll(prodTypes);
        comboProductType.getCheckModel().checkAll();
        //setup price spinner
        SpinnerValueFactory<Double> valueFactory1 = new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 200, 0, 1);
        spinPrice1.setValueFactory(valueFactory1);
        spinPrice1.setEditable(true);
        
    }

    public void search() {
        LOG.debug("[search] init");
        txtFieldProductName.getText();
        txtFieldProvider.getText();
        txtFieldFamily.getText();
        ObservableList<ProductType> prodTypeList = comboProductType.getCheckModel().getCheckedItems();
        LOG.debug("[search] end");
    }
    public void reset() {
        
    }
    
    /* public void changePanel(ActionEvent event) throws IOException {


         * placeHolder.getChildren().clear(); if(event.getSource().equals(btnProducts)){
         * placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource(
         * "/mypos/fxml/Products.fxml"))); }else
         * if(event.getSource().equals(btnFamilies)) {
         * placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource(
         * "/mypos/fxml/Families.fxml"))); }else
         * if(event.getSource().equals(btnInvoices)) {
         * placeHolder.getChildren().add(FXMLLoader.load(getClass().getResource(
         * "/mypos/fxml/Invoices.fxml"))); }


    } */

}
