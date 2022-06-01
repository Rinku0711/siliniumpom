package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;
import static org.openqa.selenium.By.xpath;

public class Productaddtocart extends Utils{

    public void ProductInShoppingCart(){

        // acssert for shopingcart
        String expectedMessage = "Shopping cart";

        String actualMessage = driver.findElement(xpath("//h1 [contains (text (),'Shopping cart')]")).getText();

        Assert.assertEquals(expectedMessage, actualMessage, "The product will not added to the cart ");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //  assert for  build on your computer


        String actualMessage1 = driver.findElement(By.className("product-name")).getText();
        String expectedMessage1 = "Build your own computer";
        Assert.assertEquals( expectedMessage1,actualMessage1," build your computer error  computer  ");



    }
}
