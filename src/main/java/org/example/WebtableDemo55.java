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

import java.time.Duration;
import java.util.List;

public class WebtableDemo55 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.asx.com.au/");

        //  WebElement webElement=driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));

        //     Actions action= new Actions(driver);
        //    action.moveToElement(webElement).perform();
//        //Thread.sleep(2000);
//
//        // Waiting 30 seconds for an element to be present on the page, checking
//        // for its presence once every 5 seconds.
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("Suman: this is the custom message")
                .ignoring(NoSuchElementException.class);

        //@SuppressWarnings("deprecation")
//        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"pnProductNavContents\"]/h5[2]")).click();
        //Get the number pf rows
        //Get the number of Coloumns
        //Iterate the rows and coloums get the text and Print


        driver.get("https://www.asx.com.au/markets/trade-our-cash-market/announcements");
        Thread.sleep(3000);
        ////*[@id="markets_announcements"]/div/div[4]/table/tbody/tr
        ////*[@id="markets_announcements"]/div/div[4]/table/tbody/tr[1]/td
        List<WebElement> rowelement = driver.findElements(By.xpath("//*[@id=\"markets_announcements\"]/div/div[4]/table/tbody/tr"));
        System.out.println(rowelement.size());
        int rowsize=rowelement.size();

        List<WebElement> colelement = driver.findElements(By.xpath("//*[@id=\"markets_announcements\"]/div/div[4]/table/tbody/tr[1]/td"));
        System.out.println(colelement.size());
        int colsize=colelement.size();

        for (int i=1;i<=rowsize;i++){
            for (int j=1;j<=colsize;j++){
                System.out.print(driver.findElement(By.xpath("//*[@id=\"markets_announcements\"]/div/div[4]/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"  ");
                System.out.print(" ");
            }
            System.out.println();
    }
    }
}