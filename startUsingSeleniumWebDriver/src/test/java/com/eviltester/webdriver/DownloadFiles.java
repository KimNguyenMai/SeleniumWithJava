package com.eviltester.webdriver;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import java.lang.Thread;
import java.io.IOException;

public class DownloadFiles{

    @Test
    public void startWebDriver() throws InterruptedException {
   
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://testpages.herokuapp.com/styled/download/download.html");

        //locate the "Direct Link Download" button
        WebElement DirectDownload = driver.findElement(By.id("direct-download-a"));
        Thread.sleep(1000);

        // Use getAttribute() to obtain the "href" value of the 
        // download link and save it as a String variable. 
        String sourceLocation = DirectDownload.getAttribute("href");

        //set command that will run with wget
        String wget_command = "wget " + sourceLocation ;


        try{
            //call wget to run the command we specified in "wget_command"
            Process exec = Runtime.getRuntime().exec(wget_command); 
            int exitVal = exec.waitFor(); //wait till wget finishs downloading
            System.out.println("Exit value: " + exitVal); //returns exit val: 0 = works, 1 = something wrong
        }
        catch(InterruptedException | IOException ex){
            System.out.println(ex.toString());
        }
        Thread.sleep(1000);

        //close webdriver
        driver.close();

        //quit webdriver
        driver.quit();

    }

}



