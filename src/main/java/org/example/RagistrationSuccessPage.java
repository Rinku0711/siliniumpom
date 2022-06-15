package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.openqa.selenium.By.className;

public class RagistrationSuccessPage extends Utils {

    public void verifyUserRagisteredSuccessfully(){



        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(className("result")).getText();
        Assert.assertEquals(expectedMessage, actualMessage, "Your registration is NOT successful");



    }
}
