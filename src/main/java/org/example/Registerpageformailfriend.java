package org.example;

import org.openqa.selenium.By;

public class Registerpageformailfriend extends Utils{

    private By _firstname = By.xpath("//input[@name='FirstName']");
    private By _lastname = By.id("LastName");
    private By _mail = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerbutton = By.id("register-button");

    public void userabletosuccesfullregisterformailfriend(){
        // enter your  firstname
        sendKeys(_firstname, " Charmy");

        //enter your lastname
        // driver.findElement(By.id("LastName")).sendKeys("LastNameTest");
        sendKeys(_lastname, "LastNameTest");

        // enter mail
        sendKeys(_mail, "rinku80" + randomDate() + "@gmail.com");

        //Enter your password
        //driver.findElement(By.id("Password")).sendKeys("Jb1984sn");
        sendKeys(_password, "Rk198464");

        // Enter Confirm Password
        //driver.findElement(By.id("ConfirmPassword")).sendKeys("Jb1984sn");
        sendKeys(_confirmPassword, "Rk198464");

        //  Enter register Button
        clickOnElement(_confirmPassword);

}
}
