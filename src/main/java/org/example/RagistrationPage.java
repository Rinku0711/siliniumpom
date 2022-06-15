package org.example;

import org.openqa.selenium.By;

public class RagistrationPage extends Utils {

    private By _genderMale = By.id("gender-male");
    private By _firstname = By.xpath("//input[@name='FirstName']");
    private By _lastname = By.id("LastName");
    private By _dateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    private By _monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    private By _emailaddress = By.id("Email");
    private By _enterpassword= By.id("Password");
    private By _confirmpassword = By.id("ConfirmPassword");
    private By _registerbutton = By.id("register-button");
    private By _clickonhomepagepic = By.xpath("//img[@alt=\"nopCommerce demo store\"]");

    LoadProp loadProp = new LoadProp();


    public void userEntersRagistrationDetails(){

        //  driver.findElement(By.id("gender-male")).click();
        clickOnElement(_genderMale);
// properties
        // driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Charmy");
        sendKeys(_firstname,loadProp.getProperty("firstName"));

        //enter last name
        //driver.findElement(By.id("LastName")).sendKeys("Patel");
        sendKeys(_lastname,loadProp.getProperty("lastName"));

        //Date of birth
        selectDropdownByValue(_dateOfBirth,loadProp.getProperty("Dateofbirth"));

        //Month of birth
        selectDropdownByValue(_monthOfBirth,loadProp.getProperty("Dateofmonth"));

        //Year of the birth
        selectDropdownByValue(_yearOfBirth,loadProp.getProperty("Dateofyear"));

        //Email address
        //driver.findElement(By.id("Email")).sendKeys("rinku07@gmail.com");
        sendKeys(_emailaddress, loadProp.getProperty("Emailaddress1") + randomDate() + loadProp.getProperty("Emailaddress2"));

        //enter password
        // driver.findElement(By.id("Password")).sendKeys("12345678");
        sendKeys(_enterpassword, loadProp.getProperty("enterpassword"));

        //Confirm Password
        // driver.findElement(By.id("ConfirmPassword")).sendKeys("12345678");
        sendKeys(_confirmpassword,loadProp.getProperty("ConfirmPassword") );

        //click on Register button on the button of the page

        driver.findElement(By.id("register-button")).click();
       // click(_registerbutton);

    }
//       public void userclickonnopcommercepic(){
//           // click on homepagepic
//           clickOnElement(_clickonhomepagepic);


   }


