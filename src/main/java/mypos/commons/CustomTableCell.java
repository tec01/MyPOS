package mypos.commons;

import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import mypos.model.Product;

public class CustomTableCell extends TableCell<Product, Product> {

    private final Button deleteButton = new Button("Delete");


    protected void updateItem(Product person, boolean empty) {
        super.updateItem(person, empty);



    }

}
