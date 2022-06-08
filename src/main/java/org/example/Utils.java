package org.example;

import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage {

    // reuseble method
    public static void sendKeys(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static void click(By by) {
        driver.findElement(by).click();
    }


    public static String randomDate() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMYyyyHHMmSs");
        return formatter.format(date);
    }


    public static void driverWaitUnTillElementToBeClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();

    }

    public static void driverWaitUnitElementContainsUrlFraction(By by, int time, String FractionUrl) {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait1.until(ExpectedConditions.urlContains("FractionUrl"));
    }

    public static void driverWaitUntilElementLocated(By by, int time) {
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait2.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    public static void driverWaitUntilElementsTitleContains(int time, String TitleContains) {
        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait4.until(ExpectedConditions.titleContains(TitleContains));

    }

    public static void driverWaitUntilContainsUrl(int time, String url) {

        WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait5.until(ExpectedConditions.urlContains(url));

    }

    public static void driverWaitUntilPresenceOfElement(By by, int time) {
        WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait6.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public static void driverWaitUntilVisibilityOfAllElementsLocatedBy(int time, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }


    public static void driverWaitUntilInvisibilityOfWebElement(int time, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOf(element));

    }


    public static void driverWaitUntil(int time, By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }

    public static void selectDropdownByValue(By by, String value) {
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByValue(value);

    }


    public static void selectByValueDropDown(By by, String value) {

        //this method select value from drop down

        Select select = new Select(driver.findElement(by));

        //Select by value
        select.selectByValue(value);

    }

    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();


    }

   public  static void clickOnElement(@NotNull By by) {

        by.findElement(driver).click();
}



    public static void takeSpanShot(String a) {
        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        //Call getScreenShots method to creat image file
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);

        // copy file at destination


        try {
            FileUtils.copyFile(srcFile, new File("Screenshots\\" + a + randomDate() + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}

