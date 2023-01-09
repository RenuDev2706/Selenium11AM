package org.code;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static WebDriver driver;

	@BeforeClass
	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}

	@Before
	public void startTime() {

		Date d = new Date();
		System.out.println("Testcase execution starts at: " + d);

	}

	@After
	public void endTime() {
		Date d = new Date();
		System.out.println("Testcase execution ends at: " + d);

	}

	// Valid username and valid password
	@Test
	public void tc1() throws InterruptedException {

		driver.get("https://www.facebook.com/");

		String title = driver.getTitle();

		// If condition returns true-Assert passed if false Assert marked as failed
		Assert.assertTrue("Expected title not found", title.contains("Facebook"));

		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("Renu");

		Thread.sleep(3000);

		String userEnteredValue = txtUsername.getAttribute("value");

		// If expected and actual values are exactly same--Assert passed
		// If expected and actual values are not same ---Assert Failed
		Assert.assertEquals("username mismatch", "renu", userEnteredValue); // Renu renu--not same--Failed

		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("renu@123");

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

		Thread.sleep(3000);

		WebElement txtErrorMessage = driver
				.findElement(By.xpath("//div[contains(text(),\"you entered isn't connected to an account\")]"));

		Assert.assertTrue("Error message not displayed", txtErrorMessage.isDisplayed());
	}

}
