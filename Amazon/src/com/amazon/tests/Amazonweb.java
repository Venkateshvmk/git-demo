package com.amazon.tests;

import org.testng.annotations.Test;

import com.amazon.pages.AutoTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;

public class Amazonweb extends WebDriverTestCase {

	@Test(groups = { "P1" }, description = "")
	public void Scenario1() {
		//getDriver().get("/");
		AutoTestPage a1=new AutoTestPage();
		a1.Google_launch();
		a1.Google_verify();
		a1.Google_search();
	}

}
