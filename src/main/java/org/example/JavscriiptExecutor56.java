package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;

public class JavscriiptExecutor56 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

        JavascriptExecutor jsexec= (JavascriptExecutor) driver;

        //Print the titleof the page
        String script= "return document.title;";
        String title=(String) jsexec.executeScript(script);
        System.out.println(title);

        //Click button
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("/html/body/button")).click();
        //jsexec.executeScript("myFunction()");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        //highlight
       WebElement button= driver.findElement(By.xpath("/html/body/button"));
       jsexec.executeScript("arguments[0].style.border='5px solid red'",button);

       //Scroll
        driver.navigate().to("https://www.w3schools.com/sql/");
        WebElement getCerti= driver.findElement(By.xpath("//*[@id=\"cert_firstpage\"]"));
        jsexec.executeScript("argument[0].scrollIntoView(true);",getCerti);


    }
}