package com.sporty_shoes_pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	
	 private Actions actions;
	 private WebDriver driver;
	 private JavascriptExecutor jsExecutor;
	   
	 @FindBy(xpath = "(//a[contains(@class,'nav-link')])[1]")
	 private WebElement CartBTN;
	 
	// @FindBy(xpath = "//a[contains(@class,'btn btn-primary')]")
		@FindBy(linkText="Place Order")
	 private WebElement PlaceOrderBTN;
	
	 
	  
	    public PlaceOrder(WebDriver driver) {
			PageFactory.initElements(driver,this);
			actions=new Actions(driver);
		        this.driver = driver;
		        this.jsExecutor = (JavascriptExecutor) driver; 

		}

	    public void clickCartBTN() {
	    	CartBTN.click();
	    }
	    
	    public void clickPlaceOrderBTN() {
	    	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].click();",  PlaceOrderBTN);
	    	//PlaceOrderBTN.click();
	    }

}
