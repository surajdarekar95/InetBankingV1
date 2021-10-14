package com.inetbanking.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;
import com.inetbanking.Utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) throws Exception {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name is provided");

		lp.setPassword(pwd);
		logger.info("password is provided");

		lp.clickSubmit();
		logger.info("clicked on submit");

		if (isAlertPresent() == true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			//Assert.assertTrue(false);
			//logger.warn("Login failed");
			//Thread.sleep(3000);

		} else {
			//Assert.assertTrue(true);
			//logger.info("Login passed");

			lp.clicklogout();
			//Thread.sleep(3000);

			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();

		}

	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {

			return false;
		}
	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/inetbanking/TestData/TestData.xlsx";

		int rowcount = XLUtils.getRowCount(path, "sheet1");
		int cellcount = XLUtils.getCellCount(path, "sheet1", 1);

		String logindata[][] = new String[rowcount][cellcount];

		for (int i = 1; i <= rowcount; i++) {
			for (int j = 0; j < cellcount; j++) {
				logindata[i - 1][j] = XLUtils.getcellData(path, "sheet1", i, j);

			}
		}
		return logindata;
	}

}
