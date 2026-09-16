package framework;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Frame_Demo {
	
	public ExtentSparkReporter create_report;
	public ExtentReports addtest;
	public ExtentTest addlogs; 
	
	 void report() {
		 
		 create_report  = new ExtentSparkReporter("crmProject1.html");
		 addtest = new ExtentReports(); 
		 
		 addtest.attachReporter(create_report); 
		 //Set Environment
		 
		  addtest.setSystemInfo("OS", "Windows");
		  addtest.setSystemInfo("Browser", "Chrome");
		  addtest.setSystemInfo("Browser_version", "122.34.56.01");
		  addtest.setSystemInfo("Environment", "QA");
		  addtest.setSystemInfo("Username", "Sunny Kumar");
		  
		  //Set Configuration
		  
		  create_report.config().setReportName("CrmApllicartion");
		  create_report.config().setDocumentTitle("myDomeReport");
		  create_report.config().setTheme(Theme.DARK);

		 
	 }
	 
	 
	 
		@Test 
		void login1() {
			System.out.println("login1");
		}
		
		@Test 
		void profile1() {
			System.out.println("profile1");
		}
		
		
		@Test 
		void menu1() {
			System.out.println("menu1");
		}
		
		
		@Test 
		void logout1() {
			System.out.println("logout1");
	 
		}
		
		void closed() {
			addtest.flush(); 
		}
	 

}
