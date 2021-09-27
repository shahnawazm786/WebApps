package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseRightClickExample {
    WebDriver driver;
    @BeforeClass
    public void setup() throws Exception{
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver1/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/sub-menus.html");
        Thread.sleep(2000);
    }
    @Test
    public void MouseRightClickTest() throws Exception {
        WebElement element=driver.findElement(By.xpath("//span[text()=\"right click me\"]"));
        // Create Actions object
        Actions action=new Actions(driver);
        action.contextClick(element).perform();
        // click on copy button by the help of key down
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.RETURN).perform();

    }

    @AfterClass
    public void tearDown(){
        driver.close();
    }
}
