package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider46 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://jqueryui.com/droppable/");
WebElement frame=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop= driver.findElement(By.id("droppable"));

        driver.switchTo().frame(frame);

        Actions action= new Actions(driver);
        action.dragAndDrop(drag,drop);

    }
}