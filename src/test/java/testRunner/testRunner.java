package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Aditya Jain\\IdeaProjects\\Demo_Cucumber1\\Features",
        glue ="stepdefinition",
        plugin= {"pretty","io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"}

)
public class    testRunner {

}
