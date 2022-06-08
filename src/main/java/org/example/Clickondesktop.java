package org.example;

import org.openqa.selenium.By;

public class Clickondesktop extends Utils{

    //ztoa method

    public void clickOnDesktopPic(){
      // click on desktop
    clickOnElement(By.xpath("//a[text()=' Desktops ']"));
    }
}
