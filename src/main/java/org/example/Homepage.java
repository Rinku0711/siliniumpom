package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.openqa.selenium.By.className;

public class Homepage extends Utils {

    private By _clickonregisterbutton = className("ico-register");
    private By _clickoncomputer = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");
    private By _clickondesktop = By.xpath("//img[@alt=\"Picture for category Desktops\"]");
    private By _clickonhomeregisterbutton = By.className("[class=\"ico-register\"]");
    private By _clickongood = By.xpath("//input[@id=\"pollanswers-2\"]");
    private By _clickonvote = By.xpath("//button[@id=\"vote-poll-1\"]");


    public void clickOnRegiterButton() {

        // click on register button

        clickOnElement(_clickonregisterbutton);


    }

    public void clickOnComputer() {

        // click on computer
        clickOnElement(_clickoncomputer);
    }

    public void usershoudabletoaddtocart() {

        // click on desktop
        clickOnElement(_clickondesktop);


    }

    public void ckickonregisterbutton() {

        //click on homeregisterbutton
        clickOnElement(_clickonhomeregisterbutton);

        //click on computer
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));


    }

    public void clickoncurrency() {


        Select USDollar = new Select(driver.findElement(By.xpath("//select[@name=\"customerCurrency\"]")));
        USDollar.selectByValue("https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2F");


        String actualMessage7 = "USDollar";
        String expectedMessage7 = driver.findElement(By.xpath("//span[contains(text(),'$1,200.00')]")).getText();
        Assert.assertTrue(expectedMessage7.contains("$"));

        //select Euro

        Select Euro = new Select(driver.findElement(By.id("customerCurrency")));
        Euro.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

        String actualMessage9 = "Euro";
        String expectedMessage9 = driver.findElement(By.xpath("//span [contains (text (),'€1032.00')]")).getText();
        Assert.assertTrue(expectedMessage9.contains("€"));

    }

    public void userabletovotecommunitypoll(){

        // click on good
        clickOnElement(_clickongood);

        //click on vote
        clickOnElement(_clickonvote);

        // assert for nonregister user
//        String expectedMessage = "Only registered users can vote.";
//        String actualMessage = driver.findElement(By.xpath("//div[contains(text(),'Only registered users can vote.)]")).getText();
//        Assert.assertEquals(actualMessage,expectedMessage,"vote dose NOT match");
    }

 public void registerUserAbleVoteSuccessfully(){

        // click on good
     clickOnElement(_clickongood);

     //click on vote
     clickOnElement(_clickonvote);

//     //assert for register user
//     String expectedMessage1 = "vote(s)...";
//     String actualMessage1 =driver.findElement(By.xpath("//span[@class=\"poll-total-votes\"]")).getText();
//     Assert.assertEquals(actualMessage1,expectedMessage1,"Register vote does NOT match");

    }


}


