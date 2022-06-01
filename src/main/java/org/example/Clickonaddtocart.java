package org.example;

import org.openqa.selenium.By;

import static org.example.BasePage.driver;
import static org.example.Utils.clickOnElement;

public class Clickonaddtocart extends Utils{

    private By _buildyourowncomputeaddedtothecart = By.xpath("//div[@data-productid=\"1\"]/div/div[3]/div[2]//button[@class=\"button-2 product-box-add-to-cart-button\"]");
    private By _cilckonemailfriendbutton = By.xpath("//button[@class=\"button-2 email-a-friend-button\"]");

     public void clickondesktopaddtocart(){

         //build your own compute added to the cart
         clickOnElement(_buildyourowncomputeaddedtothecart);

         //cilck on email friend button
         driver.findElement(_cilckonemailfriendbutton).click();


     }
}
