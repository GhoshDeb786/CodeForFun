Project description: This project is to automate E.ggtimer.com Countdowm timer and to verify the timer functionality.

Site used: http://e.ggtimer.com/

Tools Used:

Eclipse IDE along with Java Bindings (Java SE 1.7) 
Selenium Web Driver API - Open Source Web Based Browser Automation 
Maven - Build Automation tool - List of JAR's as a dependencies 
GIT - As a repository to Check in the Code

Technologies Used:

Object Oriented Programming Structure - Java 
BDD - Behaviour Driven Development - Approach 
POM - Page Object Model - Design Pattern 
Gherkin - Given , When , Then Approach to write Test Scripts

Drivers Used :

Here I have used Chrome as a Browser Driver

System.setProperty("webdriver.chrome.driver", "C:\Users\INFOCOM\Downloads\chromedriver_win32 (1)\chromedriver.exe"); driver = new ChromeDriver();

It can be used in Mozilla Firefox browser as well using Gecko driver (Only Used for Older Version)

System.setProperty("webdriver.gecko.driver","C:/Users/Deb/Downloads/geckodriver-v0.20.0-win64/geckodriver.exe"); driver = new FirefoxDriver();

Instructions to run and build code:

Step 1. You can either use Eclipse IDE or any other IDE . I have used Eclipse IDE to develope the Code using Maven 

Step 2. Use mvn clean install to build it on the local system - Workspace 

Step 3. Go to TestRunner from the Right Pane of the Project Explorer 

Step 4. Right Click - Run as Junit test 

Step 5. Refresh the Project pane - Once the Execution is finished - Go to Cucumber - HTML - Reports to view the report
