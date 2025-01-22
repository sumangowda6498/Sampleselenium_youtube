package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames42 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        System.setProperty("webdriver.edgedriver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        Thread.sleep(2000);
        WebElement id=driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(id);
        driver.findElement(By.xpath("/html/body/button")).click();
       String Alerttext =driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println("Text:"+Alerttext);
        driver.switchTo().parentFrame();

    }
}
