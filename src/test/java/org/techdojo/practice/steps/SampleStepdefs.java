package org.techdojo.practice.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.techdojo.practice.controllers.WebDriverController;

public class SampleStepdefs {
    WebDriver driver;
    public SampleStepdefs(WebDriverController driverController){
        driver = driverController.getDriver();
    }
    @Given("Sample user satisfy preconditions")
    public void sampleUserSatisfyPreconditions() {
        driver.get("https://buggy.justtestit.org/");
    }

    @When("Sample user perform an action")
    public void sampleUserPerformAnAction() {
    }

    @Then("Sample user experience expected behaviour")
    public void sampleUserExperienceExpectedBehaviour() {
    }
}
