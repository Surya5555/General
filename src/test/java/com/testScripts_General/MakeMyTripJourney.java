package com.testScripts_General;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.baseClasses.BaseClass_Web;
 import com.components.MakemytripComponents;
 
public class MakeMyTripJourney extends BaseClass_Web{

	
	public MakemytripComponents components = new MakemytripComponents(pdfResultReport);

	public void initializeRepository() throws Exception {		
		
 		reportDetails.put("Test Script Name", this.getClass().getSimpleName());
		reportDetails.put("Test Script MyWorksshop Document ID", "Doc1234567");
		reportDetails.put("Test Script Revision No", "1");
		reportDetails.put("Test Author Name", "SURYA");
		reportDetails.put("Test Script Type", "User Acceptance Testing");
		reportDetails.put("Requirement Document ID of System", "Doc1234567");
		reportDetails.put("Requirement ID", "US2202");
	}
	
	@Parameters("TestcaseNo")
	@Test(description = "Scenario:1 - Test the functionality of Consumer with valid flow")
  public void f(String num) throws Throwable {
	  System.out.println("Entered in the test method..................");
	  try {
		
		  pdfResultReport.readTestDataFile(System.getProperty("user.dir")	+ "//Resources//MakeMyTripData.xlsx", num);
	
	  } catch (Exception e) {
		 
		e.printStackTrace();
	}
	    
	      initializeRepository();
	  	
	      components.openUrl();   
	      components.searchingFlight();
	      components.bookFlight();
	      components.login();
		  components.closedriver();
	
	}
}
