package com.cucumber.stepdef;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LoginProdStep {
	
	@And("^user validates the captcha image$")
	public void user_validates_the_captcha_image() throws Throwable {
		System.out.println("@Then -- Captcha validation");
	}

}
