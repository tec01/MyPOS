package mypos.services;

import javafx.stage.Stage;
import mypos.MyPosApplication.StageReadyEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class StageManager implements ApplicationListener<StageReadyEvent> {

    private static final Logger LOG = LogManager.getLogger(StageManager.class);
    private Stage stage;

    @Value("${display.default_width}")
    private double width ;

    @Value("${display.default_height}")
    private double height ;

    public StageManager(){

    }

    private void adaptStage(){
        try {
            GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
            GraphicsConfiguration gc = gd.getDefaultConfiguration();

                    Rectangle bounds = gc.getBounds();

            Insets screenInsets = Toolkit.getDefaultToolkit().getScreenInsets(gc);

            Rectangle effectiveScreenArea = new Rectangle();

            effectiveScreenArea.x = bounds.x + screenInsets.left;
            effectiveScreenArea.y = bounds.y + screenInsets.top;
            effectiveScreenArea.height = bounds.height - screenInsets.top - screenInsets.bottom;
            effectiveScreenArea.width = bounds.width - screenInsets.left - screenInsets.right;

            this.width = effectiveScreenArea.getWidth();
            this.height = effectiveScreenArea.getHeight();

            stage.setWidth(getWidth());
            stage.setHeight(getHeight());

            LOG.debug("Screen size: {}x{}",width,height);
        }catch(HeadlessException e){
            LOG.debug("Error getting screen size.", e);
        }

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        stage = event.getStage();
        adaptStage();
    }
}
