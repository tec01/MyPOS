package mypos.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import mypos.commons.ConditionalOperator;
import mypos.commons.CustomTableCell;
import mypos.model.Product;
import mypos.model.ProductType;
import mypos.services.ProductsService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.controlsfx.control.CheckComboBox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

@Component
public class ProductsController implements Initializable {

    private static Logger LOG = LogManager.getLogger(ProductsController.class);

    @Autowired
    private ProductsService productsService;
    @FXML
    private TextField txtFieldProductName, txtFieldProvider, txtFieldFamily;
    @FXML
    private CheckComboBox<ProductType> comboProductType;
    @FXML
    private ComboBox<ConditionalOperator> boxConditionalOperator;
    @FXML
    private Spinner<Double> spinnerPrice1;
    @FXML
    private CheckBox chBoxWeighted;

    @FXML
    private TableView<Product> productsTable;
    @FXML
    private TableColumn<Product,Integer> columnID;
    @FXML
    private TableColumn<Product,String> columnName;
    @FXML
    private TableColumn<Product,BigDecimal> columnPrice;
    @FXML
    private TableColumn<Product,String> columnFamily;
    @FXML
    private TableColumn<Product,String> columnType;
    @FXML
    private TableColumn<Product,String> columnWeighted;
    @FXML
    private TableColumn<Product, CustomTableCell> columnActions;

    @FXML
    private Button btnSearch, btnReset;
    @FXML
    private StackPane placeHolder;

    public ProductsController(){

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //setup ConditionalOperator
        List<ConditionalOperator> condOperators = Arrays.asList(ConditionalOperator.values());
        boxConditionalOperator.setItems(FXCollections.observableList(condOperators));
        boxConditionalOperator.getSelectionModel().selectFirst();
        //setup product types
        List<ProductType> prodTypes = Arrays.asList(ProductType.values());
        comboProductType.getItems().addAll(prodTypes);
        comboProductType.getCheckModel().checkAll();
        //setup price spinner
        SpinnerValueFactory<Double> valueFactory1 = new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 200, 0, 1);
        spinnerPrice1.setValueFactory(valueFactory1);
        spinnerPrice1.setEditable(true);
    }


    private void populateFamilies(){
        
    }

    public void search() {
        LOG.debug("[search] init");
        String productName = txtFieldProductName.getText();
        String provider = txtFieldProvider.getText();
        String family = txtFieldFamily.getText();
        boolean weighted = chBoxWeighted.isSelected();
        Double price1 = spinnerPrice1.getValue();
        BigDecimal price = BigDecimal.valueOf(price1);
        ConditionalOperator condition = boxConditionalOperator.getValue();
        ObservableList<ProductType> prodTypeList = comboProductType.getCheckModel().getCheckedItems();
        if(productName.isEmpty() && provider.isEmpty() && family.isEmpty() && prodTypeList.size()==0){
            productsService.findAll();
        }else{
            productsService.findAll(productName,provider,family,weighted,condition,price,prodTypeList);
        }
        LOG.debug("[search] end");
    }
    public void reset() {
        
    }

    protected void populateTable(List<Product> products){

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
