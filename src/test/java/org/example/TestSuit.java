package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.BasePage.driver;
import static org.example.Utils.*;
import static org.openqa.selenium.By.*;
import static org.openqa.selenium.By.xpath;

public class TestSuit extends BaseTest{

    Homepage homepage = new Homepage();
    RagistrationPage ragistrationPage = new RagistrationPage();
    RagistrationSuccessPage ragistrationSuccessPage = new RagistrationSuccessPage();
    Blindonyourcomputer blindonyourcomputer = new Blindonyourcomputer();
    Bildoncomputer bildoncomputer = new Bildoncomputer();
    Productaddtocart productaddtocart = new Productaddtocart();
    Clickondesktoppic clickondesktoppic = new Clickondesktoppic();
    Clickonaddtocart clickonaddtocart = new Clickonaddtocart();
    Emailafriend emailafriend = new Emailafriend();
    Emailfriendresultfriend emailfriendresultfriend = new Emailfriendresultfriend();
    Registerpageformailfriend registerpageformailfriend = new Registerpageformailfriend();




    @Test

    public void userShouldBeAbleToRegisterSuccessfully(){


        homepage.clickOnRegiterButton();
        ragistrationPage.userEntersRagistrationDetails();
        ragistrationSuccessPage.verifyUserRagisteredSuccessfully();


    }

    @Test

        public void userShouldBeAbleToAddInAddToCartProduct(){
            homepage.clickOnComputer();
            homepage.usershoudabletoaddtocart();
            blindonyourcomputer.clickOnBlindOnComputer();
            bildoncomputer.openbildcomputer();
            productaddtocart.ProductInShoppingCart();

        }

        @Test

    public  void RegisterUerShouldReferproductToTheirFriends() {

        homepage.clickOnRegiterButton();
       registerpageformailfriend.userabletosuccesfullregisterformailfriend();
        homepage.clickOnComputer();
        clickondesktoppic.clickdesktoppicture();
        clickonaddtocart.clickondesktopaddtocart();
        emailafriend.veryfytoemailafriend();
        emailfriendresultfriend.emailsuccessfullysent();

    }


       @Test
     public void userShouldBeableToSuccesfullyChangethecurrency() {

        homepage.clickoncurrency();


}
@Test
    public void userShoudbeabletoselectcommunitypoll(){

        homepage.userabletovotecommunitypoll();
       userShouldBeAbleToRegisterSuccessfully();
       ragistrationPage.userclickonnopcommercepic();
       homepage.userabletovotecommunitypoll();


}



}


































