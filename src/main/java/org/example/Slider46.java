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
        WebElement dev=driver.findElement(By.linkText("Development"));

        WebElement frame=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/iframe"));
        driver.switchTo().frame(frame);
//*[@id="content"]/iframe
Thread.sleep(2000);
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop= driver.findElement(By.id("droppable"));






        Actions action= new Actions(driver);
        action.dragAndDrop(drag,drop);
        Thread.sleep(2000);
driver.switchTo().parentFrame();
        action.moveToElement(dev).perform();



    }
}