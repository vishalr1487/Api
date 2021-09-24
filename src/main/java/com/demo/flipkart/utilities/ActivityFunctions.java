package com.demo.flipkart.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.demo.flipkart.basetest.FlipkartBaseTest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class ActivityFunctions extends FlipkartBaseTest{
	public static final int DEFAULT_WAIT = 5;
	public static final String ELEMENT_NOT_FOUND = " Element not found !! ";
	public static String ID = "id";
	public static String XPATH = "xpath";
	public static String ClassName = "classname";
	public static int matchTypePrecise = 1;
	public static int matchTypePartial = 2;
	public static int matchTypeStartwith = 3;

	public static void scrollDown() {
		int pressX = driver.manage().window().getSize().width / 2;
		// 4/5 of the screen as the bottom finger-press point
		int bottomY = driver.manage().window().getSize().height * 4 / 5;
		// just non zero point, as it didn't scroll to zero normally
		int topY = driver.manage().window().getSize().height / 8;
		// scroll with TouchAction by itself
		scroll(pressX, bottomY, pressX, topY);
	}

	@SuppressWarnings({ "rawtypes", "static-access" })
	private static void scroll(int fromX, int fromY, int toX, int toY) {
		TouchAction touchAction = new TouchAction(driver);
		PointOption pointOption = new PointOption<>();
		touchAction.longPress(pointOption.point(fromX, fromY)).moveTo(pointOption.point(toX, toY)).release().perform();
	}

	public static MobileElement waitTillElementVisible(String locatorType, String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, DEFAULT_WAIT);
		MobileElement element = getElement(locatorType, xpath);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed(), ELEMENT_NOT_FOUND);
		return element;
	}

	public static MobileElement getElement(String type, String value) {
		MobileElement element;
		String typpe = type.toLowerCase();
		By by = By.id(value);

		if (typpe.equals(ID)) {
			by = By.id(value);
			Reporter.log("finding element by id => " + value);

		} else if (typpe.equals(XPATH)) {
			by = By.xpath(value);
			Reporter.log("finding element by xpath => " + value);

		} else if (typpe.equals(ClassName)) {
			by = By.className(value);
			Reporter.log("finding element by classname => " + value);

		} else if (typpe.equalsIgnoreCase("text")) {
			by = By.xpath("//*[@text='" + value + "']");
			Reporter.log("finding element by text => " + value);

		} else if (typpe.equalsIgnoreCase("contains")) {
			by = By.xpath("//*[contains(@text,'" + value + "')]");
			Reporter.log("finding element by contains => " + value);

		} else if (typpe.equalsIgnoreCase("starts-with")) {
			by = By.xpath("//*[starts-with(@text,'" + value + "')]");
			Reporter.log("finding element by starts-with => " + value);
		}

		try {
			element = driver.findElement(by);
			Reporter.log("Elements found by " + value);

		} catch (StaleElementReferenceException e) {
			element = driver.findElement(by);
			Reporter.log("Elements found by " + value);
		}
		return element;
	}

	public static boolean scrollTillText(String text) {
		for (int i = 0; i < 20; i++) {
			try {
				String xpath = "//*[contains(@text,'" + text + "')]";
				if (driver.findElement(By.xpath(xpath)).isDisplayed())
					return true;
			} catch (Exception e) {
				scrollDown();
				continue;
			}
		}
		return false;
	}

}
