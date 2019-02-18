package com.genericlibarry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.amazonpagefactory.amazonpagefactory;

public class genericclass {
	
	WebDriver driver;
	amazonpagefactory pf;
	
	
	
	public void getSetup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\murshed\\eclipse-workspace\\Com.Amazon.Murshed\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		pf=PageFactory.initElements(driver, amazonpagefactory.class);
		driver.get(pf.getUrl());
		driver.manage().window().maximize();
		
		
		
	}
	
	public void signIn() {
		pf.getClickSignInButton().click();
		pf.getUNameBox().sendKeys(pf.getUname());
		pf.getUPassBox().sendKeys(pf.getUpass());
		pf.getClickSignIn().click();
		pf.getOrder().click();
		pf.getBrowsingHistory().click();
		
		
		
	}

}
