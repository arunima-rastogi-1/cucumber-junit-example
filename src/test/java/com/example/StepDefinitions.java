package com.example;

import io.cucumber.java.*;
import io.cucumber.java.en.*;

public class StepDefinitions {

    // Hooks
    @Before
    public void beforeScenario() {
        System.out.println(">> Before Scenario: Setting up the environment");
    }

    @After
    public void afterScenario() {
        System.out.println(">> After Scenario: Cleaning up the environment");
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println(">> Before Step: Setting up for step execution");
    }

    @AfterStep
    public void afterStep() {
        System.out.println(">> After Step: Cleaning up after step execution");
    }

    @Before("@SmokeTest")
    public void beforeSmokeTest() {
        System.out.println(">> Before Smoke Test: Specialized setup for smoke tests");
    }

    @After("@RegressionTest")
    public void afterRegressionTest() {
        System.out.println(">> After Regression Test: Finalizing regression test tasks");
    }

    // Step Definitions
    @Given("The application is launched")
    public void applicationLaunched() {
        System.out.println("Application is launched");
    }

    @Given("The user is on the login page")
    public void userOnLoginPage() {
        System.out.println("User is on the login page");
    }

    @Given("The user enters a valid username")
    public void enterValidUsername() {
        System.out.println("Entering a valid username");
    }

    @Given("The user enters a valid password")
    public void enterValidPassword() {
        System.out.println("Entering a valid password");
    }

    @Given("The user enters an invalid username")
    public void enterInvalidUsername() {
        System.out.println("Entering an invalid username");
    }

    @Given("The user enters an invalid password")
    public void enterInvalidPassword() {
        System.out.println("Entering an invalid password");
    }

    @Given("The user enters {string} as username")
    public void enterUsername(String username) {
        System.out.println("Entering username: " + username);
    }

    @Given("The user enters {string} as password")
    public void enterPassword(String password) {
        System.out.println("Entering password: " + password);
    }

    @When("The user clicks the login button")
    public void clickLoginButton() {
        System.out.println("Clicking the login button");
    }

    @Then("The user should see the dashboard")
    public void verifyDashboard() {
        System.out.println("Verifying the dashboard is displayed");
    }

    @Then("The user should see an error message")
    public void verifyErrorMessage() {
        System.out.println("Verifying the error message is displayed");
    }

    @Then("The user should see {string}")
    public void verifyMessage(String message) {
        System.out.println("Verifying message: " + message);
    }

    @Given("The user is logged in")
    public void userLoggedIn() {
        System.out.println("User is already logged in");
    }

    @When("The user clicks the logout button")
    public void clickLogoutButton() {
        System.out.println("Clicking the logout button");
    }

    @Then("The user should be redirected to the login page")
    public void verifyRedirectToLoginPage() {
        System.out.println("Verifying redirection to login page");
    }
}
