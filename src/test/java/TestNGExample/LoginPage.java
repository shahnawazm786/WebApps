package TestNGExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import java.util.*;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;
    List<WebElement> listElement;
    @BeforeClass
    public void Setup(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }
    @Test(priority = 1)
    public void TitleTest(){
    String title=driver.getTitle();
    assertEquals(title,"Welcome: Mercury Tours");
    }

    @Test(priority = 2)
    public void countInputTest(){
        listElement=driver.findElements(By.tagName("input"));
        assertEquals(4,listElement.size());
        System.out.println(listElement.size());
    }
    @Test(priority = 3)
    public void checkTheType(){

        for(WebElement e : listElement ){
            System.out.println(e.getTagName());
            System.out.println(e.getAttribute("type"));
        }
    }


    @AfterClass
    public void Tearup(){
        driver.close();
        driver=null;
    }
}
