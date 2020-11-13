package mypos;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyPosSpringApp {

    public static void main(String[] args) {
        Application.launch( MyPosApplication.class, args);
    }

}
