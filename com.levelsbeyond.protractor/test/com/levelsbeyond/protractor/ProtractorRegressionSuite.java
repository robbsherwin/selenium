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

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ProtractorSuite.class})

public class ProtractorRegressionSuite{
	
	@BeforeClass
	public static void setUp(){
		System.out.println("Master setup");
	}
	
	@AfterClass
	public static void tearDownClass() {
		System.out.println("Master tearDown");
	}
}