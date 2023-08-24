package com.sporty_shoes_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterUser1 {


	@FindBy(id="name")
	private WebElement enterName;
	
	@FindBy(id="email")
	private WebElement enterEmail;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(xpath="//button[contains(@type,\"submit\")]")
	private WebElement registerButton;
	
	
	public RegisterUser1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickEnterName(){
		enterName.sendKeys("Meghana");
	}
	
	public void clickEnterEmail(){
		enterEmail.sendKeys("Meghana@gmail.com");
	}
	
	public void clickEnterPassword(){
		enterPassword.sendKeys("Megha@123");
	}
	
	public void clickRegisterButton(){
		registerButton.click();
	}
	
	
}