package com.amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class amazonpagefactory {
	private String url="https://www.amazon.com/";
	private String Uname="mmrsd2k@gmail.com";
	private String Upass="test1234";
	
	
	
	
	@FindBy(xpath="//*[@class='nav-a nav-a-2']")
	private WebElement ClickSignInButton;
	
	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement UNameBox;
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement UPassBox;
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement ClickSignIn;
	
	@FindBy(xpath="//*[@id='nav-orders']/span[2]")	
	private WebElement Order;	
	//*[@id="nav-orders"]/span[2]
	
	@FindBy(xpath="//*[@id='nav-xshop']/a[2]")	
	private WebElement BrowsingHistory;
	
		

	public WebElement getBrowsingHistory() {
		return BrowsingHistory;
	}





	public void setBrowsingHistory(WebElement browsingHistory) {
		BrowsingHistory = browsingHistory;
	}





	public WebElement getClickSignIn() {
		return ClickSignIn;
	}


	public WebElement getUPassBox() {
		return UPassBox;
	}


	public String getUrl() {
		return url;
	}


    public WebElement getClickSignInButton() {
		return ClickSignInButton;
	}


	public WebElement getUNameBox() {
		return UNameBox;
	}


	public String getUname() {
		return Uname;
	}


	public WebElement getOrder() {
		return Order;
	}


	public void setOrder(WebElement order) {
		Order = order;
	}


	public String getUpass() {
		return Upass;
	}
	
	
}
