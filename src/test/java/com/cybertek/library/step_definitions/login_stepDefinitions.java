package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.loginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_stepDefinitions {
    loginPage loginPage = new loginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
    }


    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.login(ConfigurationReader.getProperty("librarianUsername"),
                ConfigurationReader.getProperty("librarianPassword"));

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected = "dashboard";
        wait.until(ExpectedConditions.urlContains(expected));
        String actual = Driver.getDriver().getCurrentUrl();
        System.out.println("actual = " + actual);

        Assert.assertTrue(actual.contains(expected));
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
       loginPage.login(ConfigurationReader.getProperty("studentusername"),
               ConfigurationReader.getProperty("studentpassword"));
    }

    @Then("books should be displayed")
    public void books_should_be_displayed() {
       String expected = "books";
       wait.until(ExpectedConditions.urlContains(expected));
       String actual = Driver.getDriver().getCurrentUrl();
        System.out.println("actual = "+actual);
        Assert.assertTrue(actual.contains(expected));

        Driver.closeDriver();
    }

}
