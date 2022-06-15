package org.example;

import org.checkerframework.checker.units.qual.C;
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
    Clickondesktop clickondesktop = new Clickondesktop();
    Nopcommercenewrealease nopcommercenewrealease = new Nopcommercenewrealease();
    Facebookpage facebookpage = new Facebookpage();
    Nikeproduct nikeproduct = new Nikeproduct();




    @Test(priority = 1)

    public void userShouldBeAbleToRegisterSuccessfully(){


        homepage.clickOnRegiterButton();
        ragistrationPage.userEntersRagistrationDetails();
        ragistrationSuccessPage.verifyUserRagisteredSuccessfully();


    }

   // @Test(priority = 2)

//        public void userShouldBeAbleToAddInAddToCartProduct(){
//            homepage.clickOnComputer();
//            homepage.usershoudabletoaddtocart();
//            blindonyourcomputer.clickOnBlindOnComputer();
//            bildoncomputer.openbildcomputer();
//            productaddtocart.ProductInShoppingCart();
//
//        }


    @Test
public void usershouldbeabletochangecurency(){

        homepage.clickoncurrency();
    }

    @Test(priority = 4)
    public void ToBeVerifyregisteruserShouldBeAbleToVotForCommunityPoll() {

        homepage.verifyIfNonRegisteredUserIsAbleToVote();
        userShouldBeAbleToRegisterSuccessfully();
        homepage.verifyRegisteredUserIsAbleToVote();

    }

    @Test(priority = 5)
    public void Producttitles(){

        homepage.getProductTitles();
    }

    @Test(priority = 6)
    public void verifyusershouldbeabletoclickonvotebutton(){

        homepage.clickonvote();

    }

    @Test(priority = 7)
    public void verifyProductArrangeInAlphaBaticalOrder(){

        homepage.clickOnComputer();
        clickondesktop.clickOnDesktopPic();
        blindonyourcomputer.arrangeztoaorder();

    }

    @Test(priority = 8)

    public void facebookWindowhadle(){
        homepage.windowHandle();

    }

    @Test(priority = 9)
     public void verifyusershouldbeabletoleavecomment(){
        homepage.newrealeasedetails();
        nopcommercenewrealease.leaveyourcomment();
    }

    @Test(priority = 10)
     public void facebookwindowhandle(){

        homepage.clickonfacebook();
        facebookpage.newopenfacebookwindow();
    }

    @Test(priority = 11)

    public void uasershouldbeabletosearchnike(){

        homepage.searchStore();
        nikeproduct.searchnike();

    }
}








































