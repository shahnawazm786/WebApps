package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MouseMoveReleaseBuildExample {
WebDriver driver;
@BeforeClass
public void setup(){
    System.setProperty("webdriver.chrome.driver","src/test/resources/driver1/chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    driver.get("https://jqueryui.com/droppable/");
}
    // Let us suppose the drapandDrop() method not working then we can perform the following method
    @Test
    public void ClickHoldMoveToReleaseBuildPerformTest() throws  Exception{
        driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        // Create an object of Actions
        Actions actions=new Actions(driver);
        actions.clickAndHold(source).moveToElement(target).release(source).build().perform();
        Thread.sleep(10000);
    }
    @AfterClass
    public void TearDown(){
    driver.close();
    }
}
