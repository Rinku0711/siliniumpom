package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;

public class Blindonyourcomputer extends Utils{

    private By _clickonbliudonyourcomputer = By.xpath("//h2[@class=\"product-title\"]/a[@href=\"/build-your-own-computer\"]");


    public void clickOnBlindOnComputer(){

    // click on bliud on your computer

        clickOnElement(_clickonbliudonyourcomputer);





}
}
