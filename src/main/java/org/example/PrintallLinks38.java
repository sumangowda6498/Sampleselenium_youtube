package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.lang.Thread.sleep;

public class PrintallLinks38 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://www.sugarcrm.com/au/request-demo/");
        driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();

        sleep(2000);

        List<WebElement> alltags= driver.findElements(By.tagName("a"));
        System.out.println("Total number of Tags" +alltags.size());

        for(int i=0; i<alltags.size(); i++){

            System.out.println("Links on pages are"+alltags.get(i).getAttribute("href"));
            System.out.println("The Text on the link"+alltags.get(i).getText());
            System.out.println();



        }

    }
}
