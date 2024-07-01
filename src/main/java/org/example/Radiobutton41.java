package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Radiobutton41 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
        Thread.sleep(2000);
        WebElement rdio1=driver.findElement(By.id("bookFlights"));
        WebElement rdio2=driver.findElement(By.id("redeemFlights"));
         rdio2.click();

        System.out.println(rdio1.isSelected());
        System.out.println(rdio2.isSelected());

        System.out.println( driver.findElements(By.xpath("//*[@name='book-flight-radio']")).size());


    }
}