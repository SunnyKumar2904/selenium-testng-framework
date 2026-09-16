package Practice_Testngxml;

import org.testng.annotations.Test;

public class Demo2 {
	

	@Test (groups = {"positive"})
	void login1() {
		System.out.println("login1");
	}
	
	@Test (groups = {"negative"})
	void profile1() {
		System.out.println("profile1");
	}
	
	
	@Test (groups = {"positive"})
	void menu1() {
		System.out.println("menu1");
	}
	
	
	@Test (groups = {"negative"})
	void logout1() {
		System.out.println("logout1");
	}

}


//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="crm_app">
//
//	<groups>
//	
//	<run> 
//	
//	<include name="positive"></include>
//	
//	</run>
//	
//	</groups>
//
//  <test thread-count="5" name="Practice_Testngxml">
//    <classes>
//    
//    
//      <class name="Practice_Testngxml.Demo"/>
//      <class name="Practice_Testngxml.Demo2"/>
//      
//      
//    </classes>
//  </test> <!-- Test -->
//  
//  
//  <test thread-count="5" name="Practice_Testngxml2">
//    <classes>
//    
//    
//      <class name="Practice_Testngxml2.demo3"/>
//      
//      
//      
//    </classes>
//  </test> <!-- Test -->
//  
//</suite> <!-- Suite -->
