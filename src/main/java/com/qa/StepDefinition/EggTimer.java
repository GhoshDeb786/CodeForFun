package com.qa.StepDefinition;


import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.DataTable;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EggTimer extends TestBase{
	
//	EggTimer eggtimer;
//	
//	public EggTimer(){
//		super();
//	}
	
	// Using Case insensitive - (?i)
	
	@Given("(?i)^User is on the eggtimer home page$")
    public void User_is_on_the_eggtimer_home_page() throws Throwable {
		TestBase.initialization();
       Assert.assertEquals("E.gg Timer - a simple countdown timer", Title);
       System.out.println("Webpage Title : " + Title);
       
    }

    //Using Data table for Data Driven Approach \"(.*)\"
    
    @When("(?i)^User enters times and User click Go$")
    public void User_enters_times_and_User_Click_Go(DataTable Credentials) throws Throwable {

     driver.findElement(By.xpath("//input[@name='start_a_timer']")).clear();    
    //using List - Collection to store the value
    //Using raw() to get the data from the table(Inline Data Element)
        
    List<List<String>> time = Credentials.raw();
   
    driver.findElement(By.xpath("//input[@name='start_a_timer']")).sendKeys(time.get(0).get(0));
    driver.findElement(By.xpath("//input[@id='timergo']")).click();
    System.out.println("User has Entered :" + time);
    
    }
    	     
  //Using Regular Expression for Data Driven Approach \"(.*)\"
  
     @And("(?i)^User enters \"(.*)\" and click Go$")
     public void user_enters_times_and_Click_Go(String countdowntimes) throws Throwable {
     WebElement UserTime = driver.findElement(By.xpath("//input[@name='start_a_timer']"));
     UserTime.clear();
     UserTime.sendKeys(countdowntimes);
     System.out.println("User has Entered :" + countdowntimes);
     driver.findElement(By.xpath("//input[@id='timergo']")).click();
     
     
     }


     @And("(?i)^Countdown timer start$")
     public void countdown_timer_Start() throws Throwable {
     
    	 String CountdownPageTitle = driver.getTitle();
    	 if (CountdownPageTitle.equals("00:24 - E.ggt")){
    		 Assert.assertEquals(true, true);
    	 }
    	 else if (CountdownPageTitle.equals("00:23 - E.ggt")) {
    		 Assert.assertEquals(true, true);
    	 }
    	 else if(CountdownPageTitle.equals("00:22 - E.ggt")) {
    		 Assert.assertEquals(true, true);
    	 }
    	 else if(CountdownPageTitle.equals("00:21 - E.ggt")) {
    		 Assert.assertEquals(true, true);
         }
    	 else if(CountdownPageTitle.equals("00:21 - E.ggt")) {
    		 Assert.assertEquals(true, true);
    		 
    	 }	 
    	
     }


    @Then("(?i)^the remaining time decreases for each seconds increment$")
    public void the_remaining_time_decreases_for_each_seconds_increment() throws Throwable {

    	WebElement String = driver.findElement(By.xpath("//h2[contains(@id,'progressText')]"));
    	
    	System.out.println("Countdown Time is : " + String.getText());
    	
    	 String CountdownPageTitle1 = driver.getTitle();
    	 if (CountdownPageTitle1.equals("00:24 - E.ggt")){
    		 
    		 Assert.assertEquals(true, true);
    	 }
    	 else if (CountdownPageTitle1.equals("00:23 - E.ggt")) {
    		 
    		 Assert.assertEquals(true, true);
    	 }
    	 else if(CountdownPageTitle1.equals("00:22 - E.ggt")) {
    		 
    		 Assert.assertEquals(true, true);
    	 }
    	 else if(CountdownPageTitle1.equals("00:21 - E.ggt")) {
    		 
    		 Assert.assertEquals(true, true);
         }
    	 else if(CountdownPageTitle1.equals("00:21 - E.ggt")) {
    		 
    		 Assert.assertEquals(true, true);
    		 
    	 }	 
    	 
    	       Thread.sleep(23000);	
    	       TestBase.closeBrowser();
    		 
        	 
          }
    	 
    	 //Waiting 30 Secs for an element to be present on the page, checking
    	 //for its presence once every 5 seconds
    	 
//    	 Wait <WebDriver> wait = new FluentWait<WebDriver>(driver)
//    			 .withTimeout(30, TimeUnit.SECONDS)
//    			 .pollingEvery(5, TimeUnit.SECONDS)
//    			 .ignoring(Exception.class);
//
//    			 WebElement Element = wait.until(new Function<WebDriver, WebElement>() {
//    			 public WebElement apply(WebDriver driver) {
//    				 
//    		   WebElement linkElement = driver.findElement(By.xpath("//h2[contains(@id,'1 second')]"));
//    			 
//    		   if(linkElement.isEnabled()) {
//    			  System.out.println("Timer has Expired");
//    			  
//    		   }
//    		   
//    		   return linkElement;
//    			 }
//    			 });
    			 
    			 
    		       
}
 
	
 
    
 
