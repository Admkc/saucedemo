package com.sauce.stepDefs;

import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductPage;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    ProductPage productPage=new ProductPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters {string} and {string} credentinal")
    public void the_user_enters_and_credentinal(String userName, String passWord) {
        loginPage.login_mtd(userName,passWord);

    }
    @Then("The user should be able to login and see {string} pace")
    public void the_user_should_be_able_to_login_and_see_pace(String expectedHeader) {

        Assert.assertEquals("verify ",expectedHeader,productPage.productsHeader_loc.getText());

    }


}
