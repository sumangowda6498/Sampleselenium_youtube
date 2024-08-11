package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;

public class HandleAuthenticationPopup_59 {
    public static String username=  "admin";
    public static String password="admin";

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Hello world!");



        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

//        WebElement Auth= driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[3]/a"));
//        Auth.click();
        Thread.sleep(2000);
        driver.get("https://"+username+":"+password+"admin@the-internet.herokuapp.com/basic_auth");

    }
}