package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ImplicitWait52 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        WebDriverManager.edgedriver().setup();
        //System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe")`;
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/?msockid=1054b9ace5d066643b20b62be47d6748");

        WebElement webElement=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));
WebElement element= driver .findElement(By.linkText("Electronics"));
        Actions action= new  Actions(driver);
        action.moveToElement(element).perform();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[5]/a")).click();

    }
}