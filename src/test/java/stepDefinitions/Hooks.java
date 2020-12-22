package stepDefinitions;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.everis.beca.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends DriverFactory {

    @Before
    public void instanciaDriver(Scenario scenario) {
        iniciarDriver();
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) throws IOException, AWTException {
        SimpleDateFormat formatoDeData = new SimpleDateFormat("yyyyMMdd-HHmmss-SSS");
        String fileName = formatoDeData.format(new Date());
        String shotName = String.format("%s.png", fileName);
        File finalShotFile = new File("C:\\cursoSelenium\\exemploSelenium\\evidencias", shotName);
        File shotFile = ((TakesScreenshot) _Driver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(shotFile, finalShotFile);

    }

    @After
    public void finalizaDriver() throws IOException{
        _Driver().quit();
    }

}
