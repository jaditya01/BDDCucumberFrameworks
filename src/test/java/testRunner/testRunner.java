package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Aditya Jain\\IdeaProjects\\Demo_Cucumber1\\Features",
        glue ={"stepdefinition"}
)
public class testRunner {
}
