package com.inetbanking.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.inetbanking.PageObjects.AddCustomerPage;
import com.inetbanking.PageObjects.LoginPage;

public class TC_addCustomerTest_003 extends BaseClass {

	@Test
	public void AddNewCustomer() throws IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(UserID);
		logger.info("user name is provided");
		lp.setPassword(Password);
		logger.info("password is provided");

		lp.clickSubmit();

		logger.info("cliked on submit");

		AddCustomerPage ACP = new AddCustomerPage(driver);

		logger.info("filling customer data");

		ACP.clickaAddNewCustmoer();
		ACP.custName("suraj");
		ACP.custGen("male");
		ACP.cusDOB("10", "15", "1995");
		ACP.cusAdress("INDIA");
		ACP.Ccity("satara");
		ACP.CusState("maharashtra");
		ACP.CusPin("415011");
		ACP.Custelephone("8806651424");

		String email = randomString() + "@gmail.com";
		ACP.CusEmail(email);

		ACP.CusPassword("srj007");
		ACP.SuBmit();

		logger.info("form submitted");

		if (driver.getPageSource().contains("Customer Registered Successfully!!!")) {
			System.out.println("Test passed");
			logger.info("validation done");

		} else {
			captureScreen(driver, "AddNewCustomer");
			System.out.println("Test failed");
			logger.info("validation fail");

		}

	}

}
