package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.Date;

public class MouseOver45 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface



        driver.get("https://www.ebay.com/?msockid=1054b9ace5d066643b20b62be47d6748");
        System.out.println(driver.getTitle());

        WebElement webElement=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[2]/a"));

        Actions action= new Actions(driver);
        action.moveToElement(webElement).perform();

    }
}