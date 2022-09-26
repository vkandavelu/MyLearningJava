package selenium.Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Utils {

    public static void getBrokenLinks(WebDriver driver) throws IOException {

         Set<String> setobj = new HashSet<>();
         List<WebElement> links=driver.findElements(By.tagName("a"));
         for(WebElement link:links)
         {
             String linkurl=link.getAttribute("href");
             URL url = new URL(linkurl);
             URLConnection urlconnection= url.openConnection();
             HttpURLConnection httpconnection = (HttpURLConnection) urlconnection;
             httpconnection.setConnectTimeout(5000);
             httpconnection.connect();
             if(httpconnection.getResponseCode()==200)
             {
                 setobj.add(linkurl+" Active URL");
             }
         }
         setobj.forEach(link-> System.out.println(link));
    }

   public static void takePageScreenshot(WebDriver driver) throws IOException {
        TakesScreenshot tobj = (TakesScreenshot) driver;
        File fobj = tobj.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fobj,new File("./screenshot/a.jpg"));
    }

    public static void takePageScreenshot(WebElement elemenet) throws IOException {
        TakesScreenshot tobj = (TakesScreenshot) elemenet;
        File fobj = tobj.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(fobj,new File("./screenshot/a.jpg"));
    }

}
