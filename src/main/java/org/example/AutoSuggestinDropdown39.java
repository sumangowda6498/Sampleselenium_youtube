package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoSuggestinDropdown39 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//Span[text()='From']")).click();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Sydney");
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ARROW_DOWN);
        //hread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys(Keys.ENTER);


    }}
