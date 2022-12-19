package com.sauce.pages;

import com.sauce.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//*[.='Products']")
    public WebElement productsHeader_loc;

    @FindBy(className = "product_sort_container")
    public WebElement sortProducts_loc;

    @FindBy(xpath = "//div[@class='pricebar']")
    public List<WebElement> productPrice_loc;

    @FindBy(css = "#add-to-cart-sauce-labs-onesie")
    public WebElement cheapestonesie_Loc;

    @FindBy(css = "#add-to-cart-sauce-labs-backpack")
    public WebElement backBack_loc;

    @FindBy(className = "shopping_cart_link")
    public WebElement openBasket_loc;

    @FindBy(css = "#checkout")
    public WebElement checkOut_loc;




    public void sortByText(String text){
        Select select=new Select(sortProducts_loc);
        select.selectByVisibleText(text);

    }






}
