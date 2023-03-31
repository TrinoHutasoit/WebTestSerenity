package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;

public class LoginSteps {

    @Steps
    Login login;
    @Steps
    Home home;
    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://www.saucedemo.com/");
        login.validateOnLoginPage();
    }
    @When("I enter valid username")
    public void enterValidUsername(){
        login.inputUserName("standard_user");
    }

    @When("I enter valid password")
    public void enterValidPassword(){
        login.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void clickLoginButton(){
        login.clickLoginButton();
    }

    @Then("I am on the home page")
    public void inTheHomePage(){
        home.validateOnHomePage();
    }
}
