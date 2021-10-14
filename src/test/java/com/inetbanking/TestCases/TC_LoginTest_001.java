package com.inetbanking.TestCases;

import java.io.IOException;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;

public class TC_LoginTest_001  extends BaseClass {
	
	@Test
	public void loginTest() throws IOException{
		
		
		logger.info("URL is opened");

		
		//driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();

		LoginPage lp= new LoginPage(driver);
		lp.setUserName(UserID);
		
		logger.info("Entered Username");

		lp.setPassword(Password);
		
		logger.info("Entered password");

		lp.clickSubmit();
		
		if(driver.getTitle().equals(" Guru99 Bank Manager HomePage ")) {
			//Assert.assertTrue(true);
			System.out.println("passed");
			logger.info("Login Test passed");

		}
		else {
			captureScreen( driver, "loginTest"); 
			//Assert.assertTrue(false);
			System.out.println("failed");
			logger.info("Login Test failed");


		}
	}
}
