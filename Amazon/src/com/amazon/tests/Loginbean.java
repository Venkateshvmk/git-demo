package com.amazon.tests;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.util.RandomStringGenerator.RandomizerTypes;
import com.qmetry.qaf.automation.util.Randomizer;

public class Loginbean extends BaseFormDataBean {
	
	@UiElement(fieldLoc="")
	@Randomizer(suffix = "@gmail.com", length = 6)
	private String email;

	@Randomizer(type = RandomizerTypes.MIXED)
	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
