import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class LocateByName {

    @Test
    public void startWebDriver(){
   
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://testpages.herokuapp.com/styled/basic-html-form-test.html");

        WebElement UserName = driver.findElement(By.name("username"));
        WebElement PassWord = driver.findElement(By.name("password"));
        WebElement Comments = driver.findElement(By.name("comments"));

        UserName.sendKeys("User01");
        PassWord.sendKeys("CS570password!");
        Comments.sendKeys("Welcome to Software Testing");

        // WebElement Submit = driver.findElement(By.name("submitbutton"));
        // Submit.click();

        Select DropDown = new Select(driver.findElement(By.name("dropdown")));

        DropDown.selectByVisibleText("Drop Down Item 6");


        driver.close();

        driver.quit();

    }

}



