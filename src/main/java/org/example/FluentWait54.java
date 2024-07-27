package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.file.Watchable;
import java.time.Duration;

public class FluentWait54 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/?msockid=1054b9ace5d066643b20b62be47d6748");

        WebElement webElement=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));

        Actions action= new Actions(driver);
        action.moveToElement(webElement).perform();
        //Thread.sleep(2000);

        // Waiting 30 seconds for an element to be present on the page, checking
        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Suman: this is the custom message")
                .ignoring(NoSuchElementException.class);

        //@SuppressWarnings("deprecation")
        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[5]/a"))).click();
        //driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/div[2]/div[1]/nav[1]/ul/li[5]/a/")).click();

    }
}