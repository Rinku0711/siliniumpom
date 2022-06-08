package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

import static org.openqa.selenium.By.className;

public class Homepage extends Utils {

    private By _clickonregisterbutton = className("ico-register");
    private By _clickoncomputer = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']");
    private By _clickondesktop = By.xpath("//img[@alt=\"Picture for category Desktops\"]");
    private By _clickonhomeregisterbutton = By.className("[class=\"ico-register\"]");
    private By _clickonradiobuttongood = By.id("pollanswers-2");
    private By _clickonvote = By.xpath("//button[@id=\"vote-poll-1\"]");
    private By clickongood2 = By.xpath("//input[@id=\"pollanswers-2\"]");
    private By _clickonvote2 = By.xpath("//*[@id=\"vote-poll-1\"]");

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


    public void verifyIfNonRegisteredUserIsAbleToVote() {
        //click on radio button good
        clickOnElement(_clickonradiobuttongood);

        //click on vote
        clickOnElement(_clickonvote);
        //verify user is not able to vote without being registered

        // delays until message appears
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        String actualMessage = driver.findElement(By.xpath("//*[@id=\"block-poll-vote-error-1\"]")).getText();
        Assert.assertTrue(actualMessage.contains("registered"), "non registered user is able to vote");
    }

    public void verifyRegisteredUserIsAbleToVote() {

        clickOnElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));

        //click on radio button good2
        clickOnElement(clickongood2);

        //click on vote2
        clickOnElement(_clickonvote2);

        //verify registered user should be able to vote
        String actualMessage = driver.findElement(By.xpath("//*[@id=\"poll-block-1\"]/span")).getText();
        Assert.assertTrue(actualMessage.contains("vote(s)..."), "Registered user is not able to vote");
    }

    public void getProductTitles() {
        List<WebElement> productTitles = driver.findElements(By.xpath("//div[contains(@class,'product-grid')]//div[@class='item-box']//h2"));

        for (WebElement e : productTitles) {

            System.out.println(e.getText());
        }
    }
    public void clickonvote(){

         // click on vote button
       clickOnElement(_clickonvote);

       // alert accept
        Alert alert = driver.switchTo().alert();
        String textOnAlert = alert.getText();
        System.out.println(textOnAlert);
        alert.getText();
        alert.accept();


   }

   public void verifyProductArrangeInAlphaBaticalOrder(){

        //click on computer
       clickOnElement(_clickoncomputer);

    }

    public void windowHandle (){


        driver.get("https://demo.nopcommerce.com");

        clickOnElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));

        driver.getWindowHandle();


    }

    public void newrealeasedetails(){
        // click on details
        clickOnElement(By.xpath("//div [@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]"));


    }

    public void clickonfacebook(){

        // click on facebook
        clickOnElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));

    }

    public void searchStore(){
        // click on searchstore
        clickOnElement(By.xpath("//div [@class=\"buttons\"]//a[@href=\"/nopcommerce-new-release\"]"));

    }


}




















