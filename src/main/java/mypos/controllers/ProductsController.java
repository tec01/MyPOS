package mypos.controllers;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import mypos.commons.ConditionalOperator;
import mypos.commons.CustomTableCell;
import mypos.model.Product;
import mypos.model.ProductCategory;
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
    private CheckComboBox<ProductType> boxProductType;
    @FXML
    private ComboBox<ConditionalOperator> boxConditionalOperator;
    @FXML
    private Spinner<Double> spinnerPrice1;
    @FXML
    private CheckComboBox<ProductCategory> boxProductCategory;

    @FXML
    private TableView<Product> productsTable;
    @FXML
    private TableColumn<Product,Number> idCol;
    @FXML
    private TableColumn<Product,String> nameCol;
    @FXML
    private TableColumn<Product,Number> priceCol;
    @FXML
    private TableColumn<Product,String> familyCol;
    @FXML
    private TableColumn<Product,String> typeCol;
    @FXML
    private TableColumn<Product,String> categoryCol;
    @FXML
    private TableColumn<Product, CustomTableCell> actionCol;

    @FXML
    private Button btnSearch, btnReset;
    @FXML
    private StackPane placeHolder;

    public ProductsController(){

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        productsTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        //setup ConditionalOperator
        List<ConditionalOperator> condOperators = Arrays.asList(ConditionalOperator.values());
        boxConditionalOperator.setItems(FXCollections.observableList(condOperators));
        boxConditionalOperator.getSelectionModel().selectFirst();
        //setup product types
        List<ProductType> prodTypes = Arrays.asList(ProductType.values());
        boxProductType.getItems().addAll(prodTypes);
        boxProductType.getCheckModel().checkAll();
        //setup price spinner
        SpinnerValueFactory<Double> valueFactory1 = new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 200, 0, 1);
        spinnerPrice1.setValueFactory(valueFactory1);
        spinnerPrice1.setEditable(true);
        //setup category combobox
        List<ProductCategory> prodCategory = Arrays.asList(ProductCategory.values());
        boxProductCategory.getItems().addAll(prodCategory);
        boxProductCategory.getCheckModel().checkAll();
        //setup table cells
        idCol.setCellValueFactory(cellData -> new SimpleIntegerProperty(cellData.getValue().getId()));
        nameCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getName()));
        priceCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().getPrice().doubleValue()));
        familyCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFamily().getName()));
        typeCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getType().name()));
        categoryCol.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategory().name()));


    }


    private void populateFamilies(){
        
    }

    public void search() {
        LOG.debug("[search] init");
        String productName = txtFieldProductName.getText();
        String provider = txtFieldProvider.getText();
        String family = txtFieldFamily.getText();
        List<ProductType> prodTypes = boxProductType.getCheckModel().getCheckedItems();
        List<ProductCategory> prodCategories = boxProductCategory.getCheckModel().getCheckedItems();
        Double price1 = spinnerPrice1.getValue();
        BigDecimal price = BigDecimal.valueOf(price1);
        ConditionalOperator condition = boxConditionalOperator.getValue();

        ObservableList<Product> products = FXCollections.observableArrayList();

        if(productName.isEmpty() && provider.isEmpty() && family.isEmpty() && prodTypes.size()==0){
            products.addAll(productsService.findAll());
        }else{
            products.addAll(productsService.findAll(productName,provider,family,prodCategories,condition,price,prodTypes));
        }

        populateTable(products);
        LOG.debug("[search] end");
    }
    public void reset() {
        
    }

    protected void populateTable(ObservableList<Product> products){
        LOG.debug("[populateTable] init");
        productsTable.setItems(products);
        LOG.debug("[populateTable] end");
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
