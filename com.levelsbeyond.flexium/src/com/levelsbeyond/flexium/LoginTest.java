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

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import be.stackandheap.flexiumLink.FlexiumLink;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class LoginTest {
    // private final static String BASE_URL = "http://localhost/";
    //private final static String PAGE = "flexiumDemo/DemoApp.html";
	 private final static String BASE_URL = "file:/Users/rsherwin/repositories/comcast-addelivery/UI-Web/AdDelivery_Main/bin-debug/";
	
	// private final static String BASE_URL = "http://localhost:8080";
	
	private final static String PAGE = "Main.html";
	//private final static String PAGE = "";
			
	private WebDriver driver;
    private FlexiumLink flexSelenium;
    private Selenium _selenium;

    
    public class LoginPage {
    	String userName = "system";
    	String userPassword = "password";
    	
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		} 	
    }

    LoginPage loginPage = new LoginPage();
    
    @Before
    public void setUp() throws Exception {
    	WebDriver driver = new FirefoxDriver();
         driver.manage().window().maximize();
         
       // DefaultHttpClient httpclient = getRestConnection();      
        		
        Thread.sleep(5000);		
         
        Selenium selenium = new WebDriverBackedSelenium(driver, BASE_URL);
           _selenium = selenium;
          
        //selenium.start();
         selenium.open(PAGE);
        
        flexSelenium = new FlexiumLink(selenium, "Main");

        Thread.sleep(3000);
       
        
        // httpclient.getConnectionManager().shutdown();
    }

	private DefaultHttpClient getRestConnection() throws IOException,
			ClientProtocolException {
		DefaultHttpClient httpclient = new DefaultHttpClient();
        HttpHost target = new HttpHost("localhost", 8080, "http");
        // specify the get request
        HttpGet getRequest = new HttpGet("/framework/security/login?auth_user=system&auth_password=password");
        
        HttpResponse httpResponse = httpclient.execute(target, getRequest);
        HttpEntity entity = httpResponse.getEntity();
   
        System.out.println("----------------------------------------");
        System.out.println(httpResponse.getStatusLine());
        Header[] headers = httpResponse.getAllHeaders();
        for (int i = 0; i < headers.length; i++) {
          System.out.println(headers[i]);
        }
        System.out.println("----------------------------------------");
   
        if (entity != null) {
          System.out.println(EntityUtils.toString(entity));
        }
		return httpclient;
	}

    @After
    public void tearDown() throws Exception {
        _selenium.close();
    	
    }
      
    
    @Test
    public void testLogin() throws Exception {
    	
        Thread.sleep(3000);
        
        // This is a simple button that we might need to click.
    	flexSelenium.click("button");
        
    	//flexSelenium.type("usernameText", "system");
    	//flexSelenium.type("passwordText", "password"); 	
    	
    }
}