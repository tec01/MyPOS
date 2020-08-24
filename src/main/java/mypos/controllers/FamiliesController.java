package mypos.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

@Controller
public class FamiliesController implements Initializable {
    
    @FXML
    private TextField txtFieldFamilyName;
    @FXML
    private Button btnSearch;
    @FXML
    private TableView familiesTable;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
