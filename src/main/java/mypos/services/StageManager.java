package mypos.services;

import javafx.stage.Stage;
import mypos.MyPosApplication.StageReadyEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class StageManager implements ApplicationListener<StageReadyEvent> {

    private static final Logger LOG = LogManager.getLogger(StageManager.class);
    private static final String sh_screenResolution = "xrandr | grep '*'";
    private Stage stage;

    @Value("${display.default_width}")
    private double width;

    @Value("${display.default_height}")
    private double height;

    private boolean isWindows ;

    public StageManager() {
        isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
    }

    private void adaptStage() {
        try {

            if(isWindows){
                GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                GraphicsDevice gd = ge.getDefaultScreenDevice();
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                this.width = screenSize.getWidth();
                this.height = screenSize.getHeight();
            }else{
                String output = runCommand(sh_screenResolution).get(0).toLowerCase();
                String screenRes = output.trim().split(" ")[0];
                String width = screenRes.split("x")[0];
                String height = screenRes.split("x")[1];
                this.width = Double.parseDouble(width);
                this.height = Double.parseDouble(height);

            }
            stage.setWidth(this.width);
            stage.setHeight(this.height);

            LOG.debug("Screen size: {}x{}", width, height);
        } catch (HeadlessException e) {
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

    public List<String> runCommand(String command) {
        String line ;
        ArrayList<String> outputString = new ArrayList<>();
        ProcessBuilder processBuilder = new ProcessBuilder().command("sh", "-c", command);
        try {
            Process process = processBuilder.start();

            //read the output
            InputStreamReader inputStreamReader = new InputStreamReader(process.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while ((line = bufferedReader.readLine()) != null) {
                outputString.add(line);
            }

            //wait for the process to complete
            process.waitFor();

            //close the resources
            bufferedReader.close();
            process.destroy();

        } catch (InterruptedException | IOException e) {
           LOG.error("Error running command:", e);
        }
        return outputString;
    }
}
