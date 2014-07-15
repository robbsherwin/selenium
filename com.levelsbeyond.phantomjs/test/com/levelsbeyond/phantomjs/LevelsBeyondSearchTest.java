package com.levelsbeyond.phantomjs;

import org.junit.Test;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LevelsBeyondSearchTest {
	
	@Test
	public void testFrontPage() {
		
		DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
		PhantomJSDriver driver = new PhantomJSDriver(capabilities);
		
		driver.get("http://www.levelsbeyond.com/");
		driver.manage().window().maximize();
		
		
	}
}