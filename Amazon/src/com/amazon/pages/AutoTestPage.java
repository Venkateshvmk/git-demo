package com.amazon.pages;

import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class AutoTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {
//////////
	@FindBy(locator = "text.search")
	private QAFWebElement textSearch;
	@FindBy(locator = "link.amazon")
	private QAFWebElement linkAmazon;
	@FindBy(locator = "your.amazon")
	private QAFWebElement yourAmazon;
	@FindBy(locator = "login.passwrd")
	private QAFWebElement loginPasswrd;
	@FindBy(locator = "login.uname")
	private QAFWebElement loginUname;
	@FindBy(locator = "login.button")
	private QAFWebElement loginButton;
	@FindBy(locator = "div.google")
	private QAFWebElement verifygoogle;
	
    @FindBy(locator = "link.amazon1")
	private QAFWebElement amazonclick;

	public QAFWebElement getAmazonclick() {
		return amazonclick;
	}

	public QAFWebElement getVerifygoogle() {
		return verifygoogle;
	}

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
		driver.get("/");
	}

	public QAFWebElement getTextSearch() {
		return textSearch;
	}

	public QAFWebElement getLinkAmazon() {
		return linkAmazon;
	}

	public QAFWebElement getYourAmazon() {
		return yourAmazon;
	}

	public QAFWebElement getLoginPasswrd() {
		return loginPasswrd;
	}

	public QAFWebElement getLoginUname() {
		return loginUname;
	}

	public QAFWebElement getLoginButton() {
		return loginButton;
	}
	
	@QAFTestStep(description="google launch page")
	public void Google_launch(){
		driver.get("/");
		//launchPage(null);	
	}
	
	@QAFTestStep(description="verify google homepage")
	public void Google_verify(){
		getVerifygoogle().waitForVisible(10000);
		getVerifygoogle().verifyPresent("Google Image");
		
	}
	
	@QAFTestStep(description="google home page search")
	public void Google_search(){
		getTextSearch().sendKeys("amazon",Keys.ENTER);
		getAmazonclick().click();
		getYourAmazon().click();	
		getLoginUname().sendKeys("abc@gmail.com");
		
	}
	
	
}
