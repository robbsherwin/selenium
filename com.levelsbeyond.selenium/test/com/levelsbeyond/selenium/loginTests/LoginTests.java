package com.levelsbeyond.selenium.loginTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.levelsbeyond.selenium.LevelsBeyondSeleniumUtilities;

public class LoginTests {
	private WebDriver driver;
	private String baseUrl;
	private String baseClient;
	private StringBuffer verificationErrors = new StringBuffer();


	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testGoodRootUserAndGoodPassword() throws Exception {

		testLogin();


	}

	private void testLogin() {
		// TODO Auto-generated method stub
		
		String testNumber = "1";
		assertEquals(testNumber, "1");
		
	}
}
