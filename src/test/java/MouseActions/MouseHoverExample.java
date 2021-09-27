package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseHoverExample {
    /*
    Mouse hover a Menu item to populate Sub-menu
     */
    WebDriver driver;

    @BeforeClass
    public void setup() throws  Exception{
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver1/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.webfx.com/blog/web-design/50-examples-of-drop-down-navigation-menus-in-web-designs/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

    }

    @Test(priority = 1)
    public void MouseHoverTest() throws  Exception{
        Actions actions=new Actions(driver);
        WebElement element=driver.findElement(By.linkText("UX & Interactive"));
        actions.moveToElement(element).perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Digital Experience Development")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }
  /*  @Test(priority = 2)
    public void HoverMenuTest1() throws Exception{
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver1/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/howto/howto_css_dropdown.asp");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("");
        WebElement element=driver.findElement(By.linkText("Hover Me"));
        Thread.sleep(2000);
        driver.findElement(By.linkText("Link 1")).click();
        System.out.println(driver.getCurrentUrl());
    }
*/
    @AfterClass
    public void tearDown(){
        driver.close();
        driver=null;
    }
}
