package org.example;

import org.openqa.selenium.By;

import static org.example.BasePage.driver;
import static org.example.Utils.clickOnElement;

public class Clickondesktoppic extends Utils {

    private By _cliclondesktop = By.xpath("//img[@alt=\"Picture for category Desktops\"]");

    public void clickdesktoppicture(){

        //click on desktpo
        driver.findElement(_cliclondesktop).click();

    }
}
