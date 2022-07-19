package com.daynine;

public class Google implements WebDriver,WebElement {

	@Override
	public void loadUrl(String url) {
		System.out.println(url);
	}
	@Override
	public void browserClose() {
		System.out.println("i close with use of close button");
	}
	@Override
	public void enterText(String textValue) {
		System.out.println(textValue);	
	}
	@Override
	public void click() {
		System.out.println("I click google search icon");
	}
	
}
//abc  d implements a -->d object --->e extends d e object