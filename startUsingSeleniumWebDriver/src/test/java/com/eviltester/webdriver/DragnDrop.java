import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class DragnDrop {

    @Test
    public void startWebDriver(){
   
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://testpages.herokuapp.com/styled/drag-drop-javascript.html");

        //From is element that needs to be dragged  
        WebElement From = driver.findElement(By.id("draggable1"));
        WebElement From1 = driver.findElement(By.id("draggable2"));

        //To is element that needs to be dropped  
        WebElement To = driver.findElement(By.id("droppable1"));
        WebElement To1 = driver.findElement(By.id("droppable2"));
        WebElement To2 = driver.findElement(By.id("keyevents"));

        //Initialize an Action from Actions object created above
        Actions act = new Actions(driver);

        //execute the Action created above
        act.dragAndDrop(From, To).build().perform();
        act.dragAndDrop(From1, To1).build().perform();
        act.dragAndDrop(From1, To2).build().perform();

        //driver.close();

        //driver.quit();

    }

}



