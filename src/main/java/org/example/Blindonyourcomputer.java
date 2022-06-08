package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.example.Utils.clickOnElement;

public class Blindonyourcomputer extends Utils{

    private By _clickonbliudonyourcomputer = By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]");


    public void clickOnBlindOnComputer(){

    // click on bliud on your computer

        clickOnElement(_clickonbliudonyourcomputer);

    }

    public void arrangeztoaorder() {

        Select select = new Select(driver.findElement(By.id("products-orderby")));
        select.selectByVisibleText("Name: Z to A");
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='products-container']/descendant::a"));

        for (WebElement element : productList) {

            System.out.println(element.getText());

        }
    }
}
