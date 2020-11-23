package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("User logs in as a librarian")
    public void user_logs_in_as_a_librarian() {

     /*   String lib59Username = ConfigurationReader.getProperty("lib59_username");
        String lib59Password = ConfigurationReader.getProperty("lib59_password");

        loginPage.EmailAddress.sendKeys(lib59Username);
        loginPage.Password.sendKeys(lib59Password);
        loginPage.SignIn.click();*/
        loginPage.logInAsLib();

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() throws InterruptedException {

     String expectedResult ="dashboard";
         wait.until(ExpectedConditions.urlContains(expectedResult));

     String actualResult = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualResult.contains(expectedResult));
        Driver.closeDriver();
    }

    @When("User logs in as a student")
    public void userLogsInAsAStudent() {

     loginPage.logInAsStudent();
    }
    @Then("books should be displayed")
    public void booksShouldBeDisplayed() {

        String expected = "books";


        wait.until(ExpectedConditions.urlContains(expected));

        String actual = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();
    }


}
