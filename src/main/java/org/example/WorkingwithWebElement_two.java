package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;
import java.util.Set;

public class WorkingwithWebElement_two {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://www.sugarcrm.com/au/request-demo/");// Load a new web page inthe current browser window
        driver.findElement(By.name("firstname")).sendKeys("standard_user");
        driver.findElement(By.name("firstname")).clear();
        System.out.println(driver.findElement(By.name("firstname")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getCssValue("text-transform"));//get the name of given CSS property
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getSize());//get the  width and height of the rendered element
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getLocation());//get the  location of the element from the top left corner of the web page
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).getTagName());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"field1\"]/div/input")).isSelected());


//        driver.findElement(By.name("password")).sendKeys("secret_sauce",Keys. ENTER);
//
//       String title= driver.getTitle();// The title of current page
//        System.out.println(title);
//
//        String currentUrl=driver.getCurrentUrl();//fetch the current url
//        System.out.println(currentUrl);
//
//        String pagesource= driver.getPageSource();
//        System.out.println(pagesource);
//
//        List<WebElement> webele=driver.findElements(By.xpath("//div[@class=\"inventory_list\"]/div"));
//        System.out.println(webele);
//
//        driver .navigate().to("https://www.sugarcrm.com/");
//        String windowHandle= driver.getWindowHandle();
//        System.out.println(windowHandle);
//
//        driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div[5]/div/div/div/div[1]/a")).click();
//        Set<String> windowhandels =driver.getWindowHandles();
//        System.out.println(windowhandels);
//
//        System.out.println("\n ____________________________________________________\n");
//        driver.navigate().to("https://www2.deloitte.com/in/en.html");
//        String title1= driver.getTitle();// The title of current page
//        System.out.println(title1);
//
//        driver.close();
// quite(): Quitesthis driver, closingevery associated window.
//close(): close the current window,quittingthe browser if it's the last window currently open

    }
}