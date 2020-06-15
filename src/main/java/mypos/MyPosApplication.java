package mypos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@EnableJpaRepositories(basePackages = {"management.families",
        "management.invoices","management.orders","management.products","management.reports","management.tickets",
        "management.users",})
@ComponentScan(basePackages = {"management.families",
        "management.invoices","management.orders","management.products","management.reports","management.tickets",
        "management.users"})
@SpringBootApplication
public class MyPosApplication extends Application {

    private ConfigurableApplicationContext springContext;
    private Parent root;

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(MyPosApplication.class);
        try {
            root = FXMLLoader.load(getClass().getResource("/mypos/fxml/MainScene.fxml"));
            // stage.initStyle(StageStyle.UNDECORATED);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(root, 800, 600);
        scene.getStylesheets().add(getClass().getResource("../style.css").toExternalForm());
        stage.setMinWidth(600);
        stage.setMinHeight(600);
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        springContext.stop();
    }

    public static void main(String[] args) {
        launch(MyPosApplication.class, args);
    }
}
