package com.objectRepository;

import org.openqa.selenium.By;

public class Makemytrp_Locators {

 
	
	public By LoginButton		= By.xpath("//p[contains(text(),' Login or Create Account')]");
	public By UserName          = By.id("username");
	public By PassWord          = By.cssSelector("input#password");
//	public By LogIn				= By.xpath("//div[@class='btnContainer appendBottom25 ']//parent::button");
	public By LogIn				= By.className("capText font16");

	
	 
	
	public By FromOn 			= By.xpath("//*[@for='fromCity']");
	public By From              = By.xpath("//input[@placeholder='From']");
	public By FromCity			= By.xpath("//p[contains(text(),'Ahmedabad, India')]");
	
	public By ToCity		    = By.xpath("//input[@placeholder='To']");
	public By ToOn				= By.xpath("//li[@id='react-autowhatever-1-section-0-item-0']");
	public By NextMonth			= By.xpath("//span[@aria-label='Next Month']");
	public By Date				= By.xpath("//div[@aria-label='Wed Oct 09 2019']");
	
	public By Travellers        = By.xpath("//label[@for='travellers']");
	public By NoOfTravellers    = By.xpath("(//li[contains(text(),'2')])[1]");
	public By EcnomyClass       = By.xpath("(//li[contains(text(),'Business')])");
	public By Apply             = By.xpath("(//button[contains(text(),'APPLY')])");
	public By Search            = By.xpath("//a[contains(text(),'Search')]");
	public By AirLineType 		= By.xpath("//label[@for='airlinesG8']");
	public By AirwaysName		= By.xpath("//span[@class='airways-name ']");
	
	public By BookNow			= By.xpath("(//button[text()='Book Now'])[1]");
	public By ContinueBooking   = By.cssSelector("button[class='fli_primary_btn btn text-uppercase continue_cta ']");
	public By AddAdult			= By.xpath("//a[text()='+ ADD ADULT']");
	
	
	public By FirstName			= By.xpath("//input[@placeholder='First Name']");
	public By LastName			= By.xpath("//input[@placeholder='Last Name']");
	public By Male				= By.xpath("(//label[@tabindex='0'])[1]");
	
	public By FirstName2		= By.xpath("(//input[@placeholder='First Name'])[2]");
	public By LastName2			= By.xpath("(//input[@placeholder='Last Name'])[2]");
	public By Male2             = By.xpath("(//label[@tabindex='0'])[2]");
	
	public By MobileNumber      = By.xpath("//input[@placeholder='Mobile No' and @type='text']");
	public By MailId            = By.xpath("//input[@placeholder='Email' and @type='text']");
	
	public By ContinueAtTicket  = By.xpath("//button[text()='Continue']");
	
	
	
	
	
	
	
	
	
	
	
	
}
