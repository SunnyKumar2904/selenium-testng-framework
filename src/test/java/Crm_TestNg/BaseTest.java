package Crm_TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	// static -> ONE browser shared by every test class in the suite
	public static WebDriver driver;

	@SuppressWarnings("null")
	@BeforeTest
	void openBrowser() {

		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.suiteondemand.com");
	}

	@AfterTest
	void exit() {

		driver.quit();
	}
}




//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="crm_app">
//  <test thread-count="5" name="Crm_TestNg">
//    <classes>
//      <class name="Crm_TestNg.Create_Account"/>
//      <class name="Crm_TestNg.Create_Contacts"/>
//      <class name="Crm_TestNg.Create_Opportunity"/>
//      <class name="Crm_TestNg.Create_lead"/>
//      <class name="Crm_TestNg.Create_Document"/>
//      <class name="Crm_TestNg.Create_Call"/>
//      <class name="Crm_TestNg.Create_Tasks"/>
//    </classes>
//  </test> <!-- Test -->
//</suite> <!-- Suite -->
