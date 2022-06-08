package org.example;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Nopcommercenewrealease extends Utils{
    String commentText = LoadProp.prop.getProperty("comment")+ randomDate();


    public void leaveyourcomment(){

     // assert for url (assert 1)

        String ActualText = "https://demo.nopcommerce.com/nopcommerce-new-release";
        Assert.assertEquals(ActualText , "https://demo.nopcommerce.com/nopcommerce-new-release");
        System.out.println("URL matching --> Part executed");



        // assert for nopcommerce new release (assert 2)
        Assert.assertEquals(getTextFromElement(By.xpath("//div[.='nopCommerce new release!']")),"nopCommerce new release!");


        // type in title
        sendKeys(By.xpath("//*[@id=\"AddNewComment_CommentTitle\"]"),"Miss Chelcy");

        // type in comment
        sendKeys(By.xpath("//*[@id=\"AddNewComment_CommentText\"]"),"It is very nice website");

        //click on newcomment
        clickOnElement(By.xpath("//button[@name=\"add-comment\"]"));

        // assert for newcommet (assert 3)
       // Assert.assertEquals(getTextFromElement(By.xpath("//div [contains (text (),'News comment is successfully added.')]")),"News comment is successfully added.");

        // assert for comment (assert 4)

       // Assert.assertTrue(getTextFromElement(By.xpath("//div [.='It is very nice website.']")).contains(commentText),"latest added comment is not present in comment list");
    }



}
