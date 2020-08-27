package mypos;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@EnableJpaRepositories(basePackages = "mypos.*")
@Configuration
@ComponentScan(basePackages = "mypos.*")
@SpringBootApplication
public class MyPosApplication extends Application{
    private ConfigurableApplicationContext applicationContext;

    private Parent rootNode;
    public static void main(String[] args) {
        Application.launch( args);
    }

    @Override
    public void init() throws IOException {
        applicationContext = SpringApplication.run(MyPosApplication.class);
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mypos/fxml/MainScene.fxml"));
            fxmlLoader.setControllerFactory(applicationContext::getBean);
            rootNode = fxmlLoader.load();
    }
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.show();
    }

    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }



}
