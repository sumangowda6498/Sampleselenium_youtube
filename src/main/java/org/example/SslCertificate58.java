package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class SslCertificate58 {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver", "resources/msedgedriver.exe");

        //driver.manage().window().maximize(); //manage: get the option interface
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Global profile
        DesiredCapabilities dc =new DesiredCapabilities();
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);

//        dc.setAcceptInsecureCerts(true);
//
//        EdgeOptions coptions= new EdgeOptions();
//        coptions.merge(dc);

        WebDriver driver = new EdgeDriver();

        driver.get("https://expired.badssl.com/");


    }
}