package org.example;

import org.openqa.selenium.By;

public class Emailafriend extends Utils{

    private By _enteryouremailfriend = By.xpath("//*[@id=\"FriendEmail\"]");
    private By _enteryouremailaddress = By.xpath("//*[@id=\"YourEmailAddress\"]");
    private By _enteryourpersonalmessage = By.xpath("//*[@id=\"PersonalMessage\"]");
    private By _clickonsendemailbutton = By.name("send-email");



        public void veryfytoemailafriend(){
            //enter your friend email
            driver.findElement(_enteryouremailfriend).sendKeys("priya185@gmail.com");

            //enter your email address
            driver.findElement(_enteryouremailfriend).sendKeys(" ");

            // enter personal message
            driver.findElement(_enteryourpersonalmessage).sendKeys("This computer is a very very nice and cheap.");

            //clik on send email Button
            clickOnElement(_clickonsendemailbutton);


        }
    }

