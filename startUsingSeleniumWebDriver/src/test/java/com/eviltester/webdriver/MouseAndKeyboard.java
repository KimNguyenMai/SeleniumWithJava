import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class MouseAndKeyboard {

    @Test
    public void startWebDriver(){
   
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Locate elements to perform actions on
        WebElement OnClickButton = driver.findElement(By.id("onclick"));
        WebElement RightClick = driver.findElement(By.id("oncontextmenu"));
        WebElement OnDoubleClick = driver.findElement(By.id("ondoubleclick"));
    
        //Initialize an Action from Actions object created above
        Actions builder = new Actions(driver);

        Action seriesOfActions = builder
                                .moveToElement(OnClickButton) //move to OnClick button
                                .click() //performs single click
                                .moveToElement(OnDoubleClick) //move to OnDoubleClick button
                                .doubleClick() //performs double click
                                .moveToElement(RightClick) //move to OnContextMenu button
                                .contextClick()//performs right click
                                .build();
        
        //execute the Action created above
        seriesOfActions.perform();

        //driver.close();

        //driver.quit();
    }

}



