package com.sporty_shoes_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLogout {
	@FindBy(linkText="Logout")
	private WebElement logout;
	
	@FindBy(id="email")
	private WebElement enterEmail;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(xpath="//button[contains(@class,\"btn btn-primary\")]")
	private WebElement login;
	
	
	
	
	public LoginLogout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogout(){
		logout.click();
	}
	
	public void clickEnterEmail(){
		enterEmail.sendKeys("Meghana@gmail.com");
	}
	
	public void clickEnterPassword(){
		enterPassword.sendKeys("Megha@123");
	}
	
	public void clickLogin(){
		login.click();
	}
	
	
}
