package com.eviltester.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.lang.Thread;

public class UploadFiles{

    @Test
    public void startWebDriver() throws InterruptedException {
   
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://testpages.herokuapp.com/styled/file-upload-test.html");

        //locate the "Choose File" button
        WebElement ChooseFile = driver.findElement(By.id("fileinput"));
     
        //click on the "Choose File" button and 
        //enter the file path onto the Choose File input field
        ChooseFile.sendKeys("/Users/kimnguyen/Desktop/Fall Course Dev/HOP Dev/570/CityuWebsite.side");

        //Pause the execusion in 1000 milliseconds
        Thread.sleep(1000);

        //choose option "A general File"
        driver.findElement(By.id("itsafile")).click();
        Thread.sleep(1000);

        // click the "Upload" button
        driver.findElement(By.name("upload")).click();
        Thread.sleep(1000);

        Thread.sleep(5000);

        //close webdriver
        driver.close();

        //quit webdriver
        driver.quit();

    }

}



