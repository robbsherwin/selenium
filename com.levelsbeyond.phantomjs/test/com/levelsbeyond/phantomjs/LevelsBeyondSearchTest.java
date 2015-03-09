/**
Levels Beyond CONFIDENTIAL
 
Copyright 2003 - 2015 Levels Beyond Incorporated
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
