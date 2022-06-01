package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManger extends Utils {
    String browserName = "chrome";



   // private WebDriver driver;

    public  void openBrowser() {

        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/test/java/Dirvers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src/test/java/Dirvers/geckodriver.exe");
            driver = new FirefoxDriver();

        }else if(browserName.equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver","src/test/java/Dirvers/msedgedriver.exe");
            driver = new EdgeDriver();

        }

        else {
            System.out.println("Either your browser name is wrong or not provided:"+browserName);
        }

        //open Chrome browser:
        //driver = new openBrowser();

        //Implicit wait method :
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximizing chrome window:
        driver.manage().window().maximize();

        //Driver to type URL :
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser() {
        driver.quit();
    }

}
