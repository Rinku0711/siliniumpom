package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Emailfriendresultfriend extends Utils {

    public void emailsuccessfullysent() {
        // assert for sentmail
        String expectedMessage = "Your message has been sent.";

        String actualMessage = driver.findElement(By.className("result")).getText();

        Assert.assertEquals(actualMessage, expectedMessage, " your message has not been sent");
    }
}