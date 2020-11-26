package com.eviltester.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.*;
import java.lang.Thread;

public class HandleAlert{

    @Test
    public void startWebDriver() throws InterruptedException {
   
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

        WebElement AlertButton = driver.findElement(By.id("alertexamples"));
        WebElement ConfirmBox = driver.findElement(By.id("confirmexample"));
        WebElement PromptDialog = driver.findElement(By.id("promptexample"));
      
        //click on the "Show alert Box" button 
        AlertButton.click();
        
        //Pause the execusion in 1000 milliseconds
        Thread.sleep(1000);

        //switch navigation to Alert popup
        Alert alert = driver.switchTo().alert();

        // Accepting alert		
        alert.accept();	

        //Pause the execusion in 1000 milliseconds
        Thread.sleep(1000);

        //confirm and reject alert
        //click the "Show confirm box" button
        ConfirmBox.click();
        Thread.sleep(1000);

        //switch navigation to Alert popup & dismiss the allert by clicking "cancel" option
        Alert dialog = driver.switchTo().alert();
        dialog.dismiss();	
        Thread.sleep(5000);

        //Input text to dialog box
        //click the "Show prompt box" button
        PromptDialog.click();
        Thread.sleep(2000);

        //capture the text in alert box
        driver.switchTo().alert().getText();	

        //challenge
        driver.switchTo().alert().sendKeys("Kim clicked");
        alert.accept();	
        Thread.sleep(2000);

        //close webdriver
        driver.close();

        //quit webdriver
        driver.quit();

    }

}



