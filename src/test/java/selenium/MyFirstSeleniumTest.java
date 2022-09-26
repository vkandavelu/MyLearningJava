package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import selenium.Utility.Utils;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;


public class MyFirstSeleniumTest {

    String drivertype="chrome";
        WebDriver driver;
    @BeforeMethod
    public void launhBrowser()
    {
     switch (drivertype)
     {
         case "firefox":
             WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver(); //updcasting
             break;
         case "chrome" :
             WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
     }
    }

    @Test
    public void myTest1() throws FileNotFoundException {


        File f = new File("c:");
        FileReader r = new FileReader(f);
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/");
       // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

//   //   Utils.getBrokenLinks(driver); // To Check broken link from the page
//        Utils.takePageScreenshot(driver); // Screenshot
//        //xpath
//        Actions acobj = new Actions(driver);
//        acobj.clickAndHold(driver.findElement(By.xpath("//div[@class=\"menu section\"]//a[text()=\"Tutorials\"]"))).
//                moveToElement(driver.findElement(By.xpath("//a[text()=\"Dot Net\"]"))).click().build().perform();
//        driver.navigate().back();
//WebElement
        }

        @Test
void myTest2()
{
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/");
  //  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
}



    @AfterMethod
    public void closeBrowser()
    {
        driver.quit();
    }

}




