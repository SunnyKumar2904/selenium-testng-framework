package Practice_Testngxml2;

import org.testng.annotations.Test;

public class demo3 {
	
	@Test (groups = {"positive"})
	void login3() {
		System.out.println("login3");
	}
	
	@Test (groups = {"negative"})
	void profile3() {
		System.out.println("profile3");
	}
	
	
	@Test (groups = {"positive"})
	void menu3() {
		System.out.println("menu3");
	}
	
	
	@Test (groups = {"negative"})
	void logout3() {
		System.out.println("logout3");
	}

}


//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="crm_app">
//
//	<test name="all">
//	
//	<packages>
//	
//	<package name="Practice_Testngxml"></package>
//	<package name="Practice_Testngxml2"></package>
//	
//	</packages>
//	
//	</test>
//  
//</suite> <!-- Suite -->
