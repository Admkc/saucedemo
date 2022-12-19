package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutInfoPage extends BasePage{

    @FindBy(css = "#first-name")
    public WebElement firstName_loc;

    @FindBy(css = "#last-name")
    public WebElement lastName_loc;

    @FindBy(css = "#postal-code")
    public WebElement code_loc;

    @FindBy(css = "#continue")
    public WebElement continue_loc;

    @FindBy(css = "#finish")
    public WebElement finish_loc;

    @FindBy(xpath = "//span[.='Checkout: Complete!']")
    public WebElement checkoutHeader_loc;

    public void checkInfoMethod(String ad,String soyad,String postaKodu){

    firstName_loc.sendKeys(ad);
    lastName_loc.sendKeys(soyad);
    code_loc.sendKeys(postaKodu);
    continue_loc.click();
    }

}
