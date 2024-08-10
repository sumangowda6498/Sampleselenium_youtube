package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Screenshot57 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.asx.com.au/");

        Date currentdate =new Date();
        System.out.println(currentdate);
        String screeshotfile=currentdate.toString().replace(" ","-").replace(":","-");
        System.out.println(screeshotfile);

        File screenshotFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(".//screenshot/"+screeshotfile+".png"));

        WebElement Accept= driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        Accept.click();
    }
}