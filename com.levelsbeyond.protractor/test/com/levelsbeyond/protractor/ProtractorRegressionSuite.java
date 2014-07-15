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