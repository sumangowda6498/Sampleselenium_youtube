package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown35 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","C:\\Users\\sumana\\IdeaProjects\\Sampleselenium\\resources\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://www.sugarcrm.com/au/request-demo/");
        WebElement ddown= driver.findElement(By.name("employees_c"));
        Select select=new Select(ddown);
        select.selectByValue("level6");
        Thread.sleep(2000);

        select.selectByVisibleText("251 - 500 employees");
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(3000);
        driver.close();
    }
}