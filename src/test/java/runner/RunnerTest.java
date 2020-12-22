package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
        glue = "stepDefinitions",
        tags = "@evidencia",
        monochrome = true,
        plugin = {"pretty", "html:evidencias/cucumber-reports.html"})		
public class RunnerTest {
}
