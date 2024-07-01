package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoIframe {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
        Thread.sleep(2000);
        WebElement frame1=driver.findElement(By.id("iframeResult"));

        driver.findElement(By.xpath("/html/body/button")).click();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

    }
}