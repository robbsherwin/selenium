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

package com.levelsbeyond.flexium;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import be.stackandheap.flexiumLink.FlexiumLink;

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

    
    public class DemoPage {
    	
    	String datagrid = "datagrid";
    	String datagridOkButton = "Okay";
		public String getDatagrid() {
			return datagrid;
		}
		public void setDatagrid(String datagrid) {
			this.datagrid = datagrid;
		}
		public String getDatagridOkButton() {
			return datagridOkButton;
		}
		public void setDatagridOkButton(String datagridOkButton) {
			this.datagridOkButton = datagridOkButton;
		}
    	
    }

    DemoPage demoPage = new DemoPage();
    
    @Before
    public void setUp() throws Exception {
    	WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        Selenium selenium = new WebDriverBackedSelenium(driver, BASE_URL);
           _selenium = selenium;
          
        //selenium.start();
        selenium.open(PAGE);

        flexSelenium = new FlexiumLink(selenium, "DemoApp");

        Thread.sleep(3000);
    }

    @After
    public void tearDown() throws Exception {
        _selenium.close();
    	
    }
    
    @Test 
    public void testDataGrids() throws Exception {
    	
    	
    	flexSelenium.dataGridDoubleClickRow(demoPage.getDatagrid(), 0);
    	
        if (flexSelenium.alertVisible()) {
        	System.out.println("It's visible");
        }
        else
        {
        	System.out.println("Not visible");
        }
        
        assertTrue(flexSelenium.alertVisible());
        
        // I changed the default okLabel in the DemoApp from "OK" to "Okay".
        flexSelenium.closeAlertByLabel(demoPage.getDatagridOkButton());
        
        assertFalse(flexSelenium.alertVisible());
    	
    }

    @Test
    public void basicTests() throws Exception {
         
        Thread.sleep(3000);
        
        // This is a simple button that we might need to click.
    	flexSelenium.click("button");
    	
    	Thread.sleep(3000);
    	
    	// Same sort of thing as clicking the one called button, but this is a checkbox instead.
    	flexSelenium.click("checkBox");
    	
    	Thread.sleep(3000);
    	
    	// We are going to need to be able to type things and send keys. "Type" seems to be the equivalent of "Send Keys"
    	flexSelenium.type("textInput", "Testing Input");
    	
    	Thread.sleep(3000);
    	
    	flexSelenium.select("list", "B");
        Thread.sleep(5000);
           
        
    }
}