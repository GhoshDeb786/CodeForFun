package com.qa.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

import java.util.List;

public class LoginPage extends TestBase {
	
	
	// Page Factory - Object Repository
	
	@FindBy(xpath = "//input[@name='start_a_timer']")
	WebElement timer;
	
	@FindBy(xpath = "//input[@id='timergo']")
	WebElement button;
	
	
	// Initialize the Page Objects 
	
	    public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	    
	    //Actions 
	    
	    public String ValidateLoginPageTitle() {
	    	return driver.getTitle();
	    }
		
	    
	   
    }
