package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;
import static org.example.Utils.selectByValueDropDown;

public class Bildoncomputer extends Utils {

    private By _selectonprocesser = By.id("product_attribute_1");
    private By _selectonram = By.id("product_attribute_2");
    private By _selectonhdd = By.xpath("//label[@for=\"product_attribute_3_6\"]");
    private By _selectonos = By.xpath("//label[@for=\"product_attribute_4_9\"]");
    private By _selectonacrobatreader = By.xpath("//label[@for=\"product_attribute_5_11\"] ");
    private By _seceltontotalcommander = By.xpath("//input[@value=\"12\"]");
    private By _clickonaddtocart = By.xpath("//button[@id=\"add-to-cart-button-1\"]");
    private By _addtocart = By.xpath("//span[@class=\"cart-label\"]");






    public void openbildcomputer(){

        // select on processer
        selectByValueDropDown(_selectonprocesser, "1");


        // select on ram
        selectByValueDropDown(_selectonram, "3");

        //select on hdd
         clickOnElement(_selectonhdd);

        //select on os
        clickOnElement(_selectonos);

        // select on acrobat reader
        clickOnElement(_selectonacrobatreader);

        // secelt on total commander
        clickOnElement(_seceltontotalcommander);

        // click on add to cart
        clickOnElement(_clickonaddtocart);

        // add to cart
        clickOnElement(_addtocart);


    }


}
