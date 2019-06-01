package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class CountdownPage extends TestBase{

	// Page Factory - Object Repository
	
	@FindBy(xpath = "//h2[contains(@id,'progressText')]")
	WebElement countdownTimer;
	
	// Initialize the Page Objects 
	
    public CountdownPage() {
	PageFactory.initElements(driver, this);

    
    }
}
