package com.levelsbeyond.flexium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.SeleniumServer;

import be.stackandheap.flexiumLink.FlexiumLink;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class DemoAppTest {
    // private final static String BASE_URL = "http://localhost/";
    //private final static String PAGE = "flexiumDemo/DemoApp.html";
	private final static String BASE_URL = "file:/Users/rsherwin/repositories/demoapp-workspace/bin-debug/";
	private final static String PAGE = "DemoApp.html";
			
	private WebDriver driver;
    private FlexiumLink flexSelenium;
    private Selenium _selenium;
 
    
    @Before
    public void setUp() throws Exception {
    	WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Selenium selenium = new WebDriverBackedSelenium(driver, BASE_URL);
           _selenium = selenium;
        
        //selenium.start();
        selenium.open(PAGE);

        flexSelenium = new FlexiumLink(selenium, "DemoApp");
        
    }

    @After
    public void tearDown() throws Exception {
        _selenium.close();
    	
    }

    @Test
    public void basicTests() throws Exception {
         
        Thread.sleep(5000);
    	
    	flexSelenium.click("button");
    	
    	Thread.sleep(5000);
    	
    	//flexSelenium.click("button");
    	flexSelenium.click("checkBox");
    	
    	Thread.sleep(5000);
        
    }
}