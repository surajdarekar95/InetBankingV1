package com.inetbanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldiriver;

	public AddCustomerPage(WebDriver rdiriver) {
		ldiriver = rdiriver;
		PageFactory.initElements(rdiriver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement lnkaddnewCustomer;

	@FindBy(how = How.NAME, using = "name")
	@CacheLookup
	WebElement CustomerName;

	@FindBy(how = How.NAME, using = "rad1")
	@CacheLookup
	WebElement Gender;

	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement DOB;

	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement Address;

	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement City;

	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement State;

	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement PIN;

	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement MobileNumber;

	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement mail;

	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement Password;

	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement Submit;

	public void clickaAddNewCustmoer() {
		lnkaddnewCustomer.click();
	}

	public void custName(String cname) {
		CustomerName.sendKeys(cname);
	}

	public void custGen(String cgender) {
		Gender.click();
	}

	public void cusDOB(String mm, String dd, String yy) {
		DOB.sendKeys(mm);
		DOB.sendKeys(dd);
		DOB.sendKeys(yy);

	}

	public void cusAdress(String add) {
		Address.sendKeys(add);
	}

	public void Ccity(String CITY) {
		City.sendKeys(CITY);
	}

	public void CusState(String CusState) {
		State.sendKeys(CusState);
	}

	public void CusPin(String cpin) {
		PIN.sendKeys(String.valueOf(cpin));
	}

	public void Custelephone(String custele) {
		MobileNumber.sendKeys(custele);
	}

	public void CusEmail(String CMail) {
		mail.sendKeys(CMail);

	}

	public void CusPassword(String pass) {
		Password.sendKeys(pass);
	}

	public void SuBmit() {
		Submit.click();
	}
}
