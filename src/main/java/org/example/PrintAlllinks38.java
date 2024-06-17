package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PrintAlllinks38 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
        System.setProperty("webdriver.edge.driver","C:\\Users\\sumana\\IdeaProjects\\Sampleselenium\\resources\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();
        driver.manage().window().maximize(); //manage: get the option interface

        driver.get("https://www.sugarcrm.com/au/request-demo/");
       List<WebElement> allTags=driver.findElements(By.tagName("a"));
        System.out.println("Total Number of tags "+allTags.size());

        for(int i=0;i<allTags.size();i++){
            System.out.println("Links on the pages are"+allTags.get(i).getAttribute("href"));
            System.out.println("Links on the Pages are "+allTags.get(i).getText());
        }


        driver.get("https://aws.amazon.com/free/?trk=14a4002d-4936-4343-8211-b5a150ca592b&sc_channel=ps&ef_id=:G:s&s_kwcid=AL!4422!3!!e!!o!!amazon%20web%20services!482208375!1136896004985296&msclkid=e09982d0feb717ef65d3e4a1d659269c&all-free-tier.sort-by=item.additionalFields.SortRank&all-free-tier.sort-order=asc&awsf.Free%20Tier%20Types=*all&awsf.Free%20Tier%20Categories=*all");
        List<WebElement> allTags1=driver.findElements(By.tagName("img"));
        System.out.println("Total Number of tags AMAZON "+allTags1.size());
        for(int i=0;i<allTags1.size();i++){
            System.out.println("Links on the pages are"+allTags.get(i).getAttribute("src"));
            //System.out.println("Links on the Pages are "+allTags.get(i).getText());
        }
    }
}