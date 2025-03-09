package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Alert_Popup_43 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        System.setProperty("webdriver.edgedriver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
       // Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicite wait


        WebElement id=driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(id);//switching to another frame
        driver.findElement(By.xpath("/html/body/button")).click();
        //Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
       Alert alertonpage=driver.switchTo().alert();

       alertonpage.sendKeys(String.valueOf(Keys.BACK_SPACE));
       //Thread.sleep(2000);
       alertonpage.sendKeys("suman");

       // Thread.sleep(2000);

        driver.switchTo().alert().accept();
        //Thread.sleep(2000);

        driver.switchTo().parentFrame();
        //Thread.sleep(2000);

        System.out.println(driver.getTitle());

        //Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("getwebsitebtn")).getText());
}}

