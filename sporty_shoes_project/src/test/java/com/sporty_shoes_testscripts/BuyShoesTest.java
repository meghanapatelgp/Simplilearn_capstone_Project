package com.sporty_shoes_testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sporty_shoes_pages.AddToCart;
import com.sporty_shoes_pages.LandingPage1;
import com.sporty_shoes_pages.LoginLogout;
import com.sporty_shoes_pages.PlaceOrder;
import com.sporty_shoes_pages.RegisterUser1;

public class BuyShoesTest {

		WebDriver driver;
		
		@BeforeTest
		public void launchApplication() throws InterruptedException{
			
			driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("http://localhost:9010");
				}
		
		@Test
		public void performTest() throws InterruptedException{
			
			LandingPage1 landingPage = new LandingPage1(driver);
			landingPage.clickRegister();
			
			RegisterUser1 registerUser = new RegisterUser1(driver);
			registerUser.clickEnterName();
			registerUser.clickEnterEmail();
			registerUser.clickEnterPassword();
			registerUser.clickRegisterButton();
			
			
			LoginLogout loginLogout =new LoginLogout(driver);
			 loginLogout.clickLogout();
			 loginLogout.clickEnterEmail();
			 loginLogout.clickEnterPassword();
			 loginLogout.clickLogin();
				Thread.sleep(2000);
				
				AddToCart addToCart = new AddToCart(driver);
				Thread.sleep(2000);
				addToCart.BuyItem();
				Thread.sleep(2000);
				addToCart.clickOnHomeIcon();
				
				PlaceOrder placeOrder=new PlaceOrder(driver);
				Thread.sleep(4000);
				placeOrder.clickCartBTN();
				Thread.sleep(4000);
				placeOrder.clickPlaceOrderBTN();
				Thread.sleep(4000);
		}       
			
			@AfterTest
			public void closeBrowser() {
				driver.quit();
			}
		}
