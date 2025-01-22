package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Multiple_window44 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edgedriver","resources/msedgedriver");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.salesforce.com/au/");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"1727194472988_l1b\"]/div[1]/article/div[2]/div/pbc-button[1]/a")).click();

        Thread.sleep(3000);

       Set<String> windowhandles= driver.getWindowHandles();//getWindowHandles returns the title of windows open
        System.out.println(windowhandles);//Print all windows name

        Iterator<String> iterator=windowhandles.iterator();
        String parentWindow= iterator.next();
        System.out.println("parentwindow "+parentWindow);
        String childwindow=iterator.next();
        System.out.println("childwindow "+childwindow);

        driver.switchTo().window(childwindow);

        driver.findElement(By.name("UserFirstName")).sendKeys("Suman");
        driver.findElement(By.name("UserLastName")).sendKeys("A");

        driver.switchTo().window(parentWindow);

    }
}
