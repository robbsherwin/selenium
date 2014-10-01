/**
Levels Beyond CONFIDENTIAL
 
Copyright 2003 - 2014 Levels Beyond Incorporated
All Rights Reserved.
 
NOTICE:  All information contained herein is, and remains
the property of Levels Beyond Incorporated and its suppliers,
if any.  The intellectual and technical concepts contained
herein are proprietary to Levels Beyond Incorporated
and its suppliers and may be covered by U.S. and Foreign Patents,
patents in process, and are protected by trade secret or copyright law.
Dissemination of this information or reproduction of this material
is unlawful and strictly forbidden unless prior written permission is obtained
from Levels Beyond Incorporated.
 **/

package com.levelsbeyond.protractor;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ProtractorSuite extends ProtractorUtilities{
    FirefoxDriver wd;
    String targetUrl = "http://juliemr.github.io/protractor-demo/";
        
    
    @Before
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    
    @Test    
    public void basicAdditionTest() throws InterruptedException {

    	openSite(targetUrl);
    	
        wd.findElement(By.xpath("//div/div/form/input[1]")).click();
        wd.findElement(By.xpath("//div/div/form/input[1]")).clear();
        wd.findElement(By.xpath("//div/div/form/input[1]")).sendKeys("10");
        wd.findElement(By.xpath("//div/div/form/input[2]")).click();
        wd.findElement(By.xpath("//div/div/form/input[2]")).clear();
        wd.findElement(By.xpath("//div/div/form/input[2]")).sendKeys("22");
        wd.findElement(By.id("gobutton")).click();
        
        Thread.sleep(5000);
        
        assertEquals("32", wd.findElement(By.cssSelector("h2.ng-binding")).getText());
    
    }
    
    @Test
    public void additionTests() throws InterruptedException {
    	
    	performAddition(10, 20, 30);
    	performAddition(5, 5, 10);
    	performAddition(1,-1, 0);
    	
    }
    
    private void performAddition(int addend1, int addend2, int sum) throws InterruptedException {
    	
    	openSite(targetUrl);
 
        wd.findElement(By.xpath(CalculatorScreen.getFirstAddendBox())).click();
        wd.findElement(By.xpath(CalculatorScreen.getFirstAddendBox())).clear();
        wd.findElement(By.xpath(CalculatorScreen.getFirstAddendBox())).sendKeys(Integer.toString(addend1));
        wd.findElement(By.xpath(CalculatorScreen.getSecondAddendBox())).click();
        wd.findElement(By.xpath(CalculatorScreen.getSecondAddendBox())).clear();
        wd.findElement(By.xpath(CalculatorScreen.getSecondAddendBox())).sendKeys(Integer.toString(addend2));
        wd.findElement(By.id("gobutton")).click();
        
        Thread.sleep(3000);
 
        assertEquals(Integer.toString(sum), wd.findElement(By.cssSelector(CalculatorScreen.getResultsSelectorCss())).getText());
    	
    }
    
    private void openSite(String url) {

        wd.get(url);
    }
    
        
    @After
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
