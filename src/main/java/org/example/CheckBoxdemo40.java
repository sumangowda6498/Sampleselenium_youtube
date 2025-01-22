package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class CheckBoxdemo40 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(2000);
       WebElement formauthentication= driver.findElement(By.linkText("Hovers"));

       Actions scroll=new Actions(driver);
       scroll.moveToElement(formauthentication);
       scroll.perform();

       Thread.sleep(2000);

        driver.findElement(By.linkText("Checkboxes")).click();
                        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected());

        System.out.println("The number of check boxes:"+driver.findElements(By.xpath("//input[@type='checkbox']")).size());


    }
}