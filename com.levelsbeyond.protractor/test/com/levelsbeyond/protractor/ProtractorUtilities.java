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