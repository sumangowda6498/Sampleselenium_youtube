package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
        WebElement firtselecteditem=select.getFirstSelectedOption();
        System.out.println(firtselecteditem.getText());


        select.selectByVisibleText("251 - 500 employees");
        Thread.sleep(2000);
        select.selectByIndex(1);
        Thread.sleep(3000);
       // driver.close();
        //#37-deselect
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        WebElement dropdown= driver.findElement(By.id("multi-select"));
        Select select1=new Select(dropdown);
        Thread.sleep(2000);

        select1.selectByValue("California");
        Thread.sleep(2000);
        select1.selectByIndex(5);
        Thread.sleep(2000);
        List<WebElement> list1= select1.getAllSelectedOptions();
        System.out.println(list1.size());
        Thread.sleep(2000);
        select1.deselectAll();
        Thread.sleep(2000);

        select1.selectByValue("California");
        Thread.sleep(2000);
        select1.selectByIndex(5);
        Thread.sleep(2000);
        select1.deselectByIndex(5);
        List<WebElement> list2= select1.getAllSelectedOptions();
        System.out.println(list2.size());

        //-select
    }
}