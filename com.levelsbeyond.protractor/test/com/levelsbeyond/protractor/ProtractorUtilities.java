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


public class ProtractorUtilities {
	

protected static class CalculatorScreen {
    static String firstAddendBox = "//div/div/form/input[1]";
    static String secondAddendBox = "//div/div/form/input[2]";
    static String resultsSelectorCss = "h2.ng-binding";
    
	public static String getFirstAddendBox() {
		return firstAddendBox;
	}
	public void setFirstAddendBox(String firstAddendBox) {
		CalculatorScreen.firstAddendBox = firstAddendBox;
	}
	public static String getSecondAddendBox() {
		return secondAddendBox;
	}
	public void setSecondAddendBox(String secondAddendBox) {
		CalculatorScreen.secondAddendBox = secondAddendBox;
	}
	public static String getResultsSelectorCss() {
		return resultsSelectorCss;
	}
	public void setResultsSelectorCss(String resultsSelectorCss) {
		CalculatorScreen.resultsSelectorCss = resultsSelectorCss;
	}
}

}