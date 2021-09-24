package com.demo.flipkart.page.feature;

import java.text.MessageFormat;

import org.testng.Assert;

import com.demo.flipkart.constants.FlipkartConstants;
import com.demo.flipkart.page.objects.HomePagePO;
import com.demo.flipkart.page.objects.LoginPO;
import com.demo.flipkart.utilities.ActivityFunctions;

public class LoginFeature extends ActivityFunctions {
	private static final String USER_NAME = "vishalr1487@gmail.com";
	private static final String PASSWORD = "vishal456";

	public static boolean loginToApp() {
		if (waitTillElementVisible(FlipkartConstants.XPATH, LoginPO.chooseLanguageText).isDisplayed()) {
			scrollTillText(FlipkartConstants.ENGLISH_TEXT);
			waitTillElementVisible(FlipkartConstants.XPATH,
					MessageFormat.format(LoginPO.englishLanguageButton, FlipkartConstants.ENGLISH_TEXT)).click();
			waitTillElementVisible(FlipkartConstants.XPATH, LoginPO.continueButtonLanguagePage).click();
		}
		Assert.assertTrue(waitTillElementVisible(FlipkartConstants.XPATH, LoginPO.phoneNumberTextField).isDisplayed(),
				ELEMENT_NOT_FOUND);
		waitTillElementVisible(FlipkartConstants.XPATH, LoginPO.switchEmailIdButton).click();
		waitTillElementVisible(FlipkartConstants.XPATH, LoginPO.emailIdTextField).sendKeys(USER_NAME);
		waitTillElementVisible(FlipkartConstants.XPATH, LoginPO.continueButton).click();
		waitTillElementVisible(FlipkartConstants.XPATH, LoginPO.passwordTextField).sendKeys(PASSWORD);
		waitTillElementVisible(FlipkartConstants.XPATH, LoginPO.continueButton).click();
		waitTillElementVisible(FlipkartConstants.XPATH, HomePagePO.homePageDrawer).click();
		waitTillElementVisible(FlipkartConstants.XPATH, HomePagePO.myAccountBtn).click();
		return waitTillElementVisible(FlipkartConstants.XPATH, "//*[contains(@text,'" + USER_NAME + "')]")
				.isDisplayed();
	}
}
