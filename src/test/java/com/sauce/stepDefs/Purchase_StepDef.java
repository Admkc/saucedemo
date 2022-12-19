package com.sauce.stepDefs;

import com.sauce.pages.CheckoutInfoPage;
import com.sauce.pages.ProductPage;
import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Purchase_StepDef {
    ProductPage productPage=new ProductPage();
    CheckoutInfoPage checkoutInfoPage=new CheckoutInfoPage();


    @When("The user should be able to sort the product {string}")
    public void the_user_should_be_able_to_sort_the_product(String textVisible) {

        productPage.sortByText(textVisible);

    }

    @And("The user should be choose cheapest and costliest products")
    public void theUserShouldBeChooseCheapestAndCostliestProducts() {

        productPage.cheapestonesie_Loc.click();
        productPage.backBack_loc.click();
    }

    @And("The user should open the basket")
    public void theUserShouldOpenTheBasket() {
        productPage.openBasket_loc.click();

    }

    @And("The user should make checkout")
    public void theUserShouldMakeCheckout() {
        productPage.checkOut_loc.click();
    }

    @And("The user should input {string} and {string} and {string}")
    public void theUserShouldInputAndAnd(String name,String lastName,String code) {
        checkoutInfoPage.checkInfoMethod(name,lastName,code);
    }

    @And("The user should finish")
    public void theUserShouldFinish() {
        checkoutInfoPage.finish_loc.click();
    }

    @Then("The user should verify Checkout: Complete!")
    public void theUserShouldVerifyCheckoutComplete() {
        String exp="CHECKOUT: COMPLETE!";
        Assert.assertEquals("verify perfect",exp,checkoutInfoPage.checkoutHeader_loc.getText());

    }


//    @And("The user should be able to select by price")
//    public void theUserShouldBeAbleToSelectByPrice(List<String > prices) {
//
//        List<String > fiyat= BrowserUtils.getElementsText(productPage.productPrice_loc);
//
//        System.out.println("fiyat = " + fiyat);
//        System.out.println("prices = " + prices);
//
//
//    }
}
