package mypos;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class MyPosApplication extends Application{

    private ConfigurableApplicationContext applicationContext;
    private Parent rootNode;

    public MyPosApplication(){
    }

    @Override
    public void init() throws IOException {
        applicationContext = new SpringApplicationBuilder(MyPosSpringApp.class).run();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/mypos/fxml/MainScene.fxml"));
            fxmlLoader.setControllerFactory(applicationContext::getBean);
            rootNode = fxmlLoader.load();
    }
    @Override
    public void start(Stage stage) {
        applicationContext.publishEvent(new StageReadyEvent(stage));
        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setResizable(true);
        stage.show();

    }

    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }


    public static class StageReadyEvent extends ApplicationEvent {
        public StageReadyEvent(Stage stage) {
            super(stage);
        }

        public Stage getStage() {
            return (Stage)getSource();
        }
    }
}
