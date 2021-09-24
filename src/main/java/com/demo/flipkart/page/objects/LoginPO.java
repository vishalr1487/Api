package com.demo.flipkart.page.objects;

public interface LoginPO {
	public static final String phoneNumberTextField = "//android.widget.EditText[@content-desc='Phone Number']";
	public static final String switchEmailIdButton = "//*[contains(@text,'Email-ID')]";
	public static final String emailIdTextField = "//*[@content-desc='Email ID']";
	public static final String continueButton = "//*[contains(@text,'Continue')]";
	public static final String continueButtonLanguagePage = "//*[contains(@text,'CONTINUE')]";
	public static final String passwordTextField = "//android.widget.EditText[@content-desc='Password']";
	public static final String chooseLanguageText = "//*[contains(@text,'English')]";
	public static final String englishLanguageButton = "//*[contains(@text,'English')]";
	public static final String containsString = "//*[contains(@text,''{0}'')]";
}
