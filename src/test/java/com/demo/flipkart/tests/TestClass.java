package com.demo.flipkart.tests;

import java.net.MalformedURLException;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

import com.demo.flipkart.basetest.FlipkartBaseTest;
import com.demo.flipkart.page.feature.LoginFeature;

public class TestClass extends FlipkartBaseTest {
	@Test(description = "Valid Login using email id")
	public void testFlipkartValidLogin() throws MalformedURLException, InterruptedException {
		assertTrue(LoginFeature.loginToApp(), "Failed to login");
		
		
		
	}
}
