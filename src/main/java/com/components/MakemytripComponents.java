package com.components;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Screen;
import org.testng.Assert;

import com.baseClasses.AutomationException;
import com.baseClasses.BaseClass_Web;
import com.baseClasses.PDFResultReport;
import com.baseClasses.ThreadLocalWebdriver;
 import com.objectRepository.Makemytrp_Locators;

public class MakemytripComponents extends BaseClass_Web {
	
	
	public PDFResultReport pdfResultReport=new PDFResultReport();
	
	Makemytrp_Locators  locators = new Makemytrp_Locators();
	
	
	public MakemytripComponents(PDFResultReport pdfresultReport) {
		this.pdfResultReport = pdfresultReport;
	}
	 
	
	public void openUrl() throws Exception{
		
		launchapp(pdfResultReport.testData.get("AppURL"));
	
	}
 	

	
 
public void login() throws Throwable{
		
	 try{

		 	
	    click(locators.LoginButton);
		Thread.sleep(2000);
		set(locators.UserName, pdfResultReport.testData.get("USER NAME"));
	    set(locators.PassWord,  pdfResultReport.testData.get("PASSWORD"));
		 
	 //   JSClick(locators.LogIn, "LogIn Button");
	  
	    Screen S = new Screen();
	    Thread.sleep(2000);
	    S.doubleClick("C:\\webdriver\\New folder\\Innovify_Task\\Resources\\LogINButton.jpg");
	    
	     
	    pdfResultReport.addStepDetails("LogInto Account", "Application should allow the user to enter details",
				"Successfully Signed into an account" + " ", "Pass", "Y");
	
	 } catch (Exception e) {
		System.out.println(e);
		log.fatal("Unable to Loginto  account" + e.getMessage() + "Line Number :" + e.getStackTrace());
		pdfResultReport.addStepDetails("Loginto account", "Unable to enter details",
				"Unable to LOginto account" + e.getMessage(), "Fail", "N");

	}
    
				
	}
	
public void searchingFlight() throws Exception{
	
	try{
		
 	click(locators.FromOn);
 	set(locators.From, pdfResultReport.testData.get("FROM CITY"));
	Thread.sleep(2000);
	click(locators.FromCity);
 	
 	set(locators.ToCity, pdfResultReport.testData.get("TO CITY"));
	click(locators.ToOn);
	
	click(locators.NextMonth);
	click(locators.Date);
	
	click(locators.Travellers);
	click(locators.NoOfTravellers);
	
	click(locators.EcnomyClass);
	click(locators.Apply);
	click(locators.Search);
	
	click(locators.AirLineType);
	click(locators.AirwaysName);
	
	List<WebElement> elements = ThreadLocalWebdriver.getDriver().findElements(By.xpath("//span[@class='airways-name ']"));
    System.out.println("No of Flights are" + elements.size());		

    
    for(WebElement ele : elements){
    	
    	//System.out.println(ele.getText());
     	Assert.assertEquals(ele.getText(), "Go Air" , "Succeded");
    	
    }   

	pdfResultReport.addStepDetails("Searching a Flight", "Entered Flight Searching deatails",
			"Successfully searched a flight " + " ", "Pass", "Y");
	
} catch (Exception e) {
	
	System.out.println(e);
	log.fatal("Unable to  search a flight " + e.getMessage() + "Line Number :" + e.getStackTrace());
	pdfResultReport.addStepDetails("Searching flight", "Unable to enter details",
			"Unable to  Fetch the  flight deatails" + e.getMessage(), "Fail", "N");

}
}

public void bookFlight() throws Throwable{
	
try{	
	
	click(locators.BookNow);
	switchTotab();
		
 	 
 	 
   	click(locators.ContinueBooking);
 	 
    click(locators.AddAdult);
	
	set(locators.FirstName, pdfResultReport.testData.get("FirstName"));
	set(locators.LastName, pdfResultReport.testData.get("LastName"));
	click(locators.Male);
	
    Thread.sleep(2000);
	click(locators.AddAdult);
	
	set(locators.FirstName2, pdfResultReport.testData.get("FirstName"));
	set(locators.LastName2, pdfResultReport.testData.get("LastName"));
	click(locators.Male2);
	
	set(locators.MobileNumber, pdfResultReport.testData.get("MobileNumber"));
	set(locators.MailId, pdfResultReport.testData.get("MAIL ID"));
	
	click(locators.ContinueAtTicket);
	
	pdfResultReport.addStepDetails("Booking Flight", "Entered Flight Passenger Details",
			"Successfully Entered details " + " ", "Pass", "Y");

	
} catch (Exception e) {
	System.out.println(e);
	log.fatal("Unable to  Enter details " + e.getMessage() + "Line Number :" + e.getStackTrace());
	pdfResultReport.addStepDetails("Passenger Details", "Unable to enter details",
			"Unable to  Fetch Pssenger deatails" + e.getMessage(), "Fail", "N");

}}
	


public void closedriver(){
	
   // ThreadLocalWebdriver.getDriver().close();
	
}
	

}
