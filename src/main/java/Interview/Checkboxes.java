package Interview;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edgedriver","resources/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        Thread.sleep(4000);
        WebElement web= driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]"));
JavascriptExecutor jse=(JavascriptExecutor) driver;
jse.executeScript("argument[0].setAttribute('style','background: yellow; border:2px sloid red;');",web);
Thread.sleep(2000);
        WebElement webElement=driver.findElement(By.xpath("//h2[text()='UnOrdered list']/following-sibling::div//li[3]"));

        Actions action= new Actions(driver);
        action.moveToElement(webElement).perform();
        driver.findElement(By.xpath("//h2[text()='UnOrdered list']/following-sibling::div//li[3]")).notify();
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", webElement);
    }
}
