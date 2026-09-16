package Practice_Testngxml;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	
	@Parameters({"i","j"})
	@Test 
	void login(@Optional("20") int a,@Optional("90") int b) {
		System.out.println(a+b);
	}
	
//	@Test 
//	void profile() {
//		System.out.println("profile");
//	}
//	
//	
//	@Test 
//	void menu() {
//		System.out.println("menu");
//	}
//	
//	
//	@Test 
//	void logout() {
//		System.out.println("logout");
//	}
	
	
	
}


//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="crm_app">
//
//	<test name="Practice_Testngxml">
//	
//	<parameter name="i" value="20"></parameter>
//	<parameter name="j" value="30"></parameter>
//	
//	<classes>
//	
//	<class name="Practice_Testngxml.Demo"></class>
//	
//	</classes>
//	
//	</test>
//  
//</suite> <!-- Suite -->
