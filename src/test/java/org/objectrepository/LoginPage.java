package org.objectrepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;
import org.utilities.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// AND operator
	@CacheLookup
	@FindBys({ @FindBy(xpath = "//input[@id='email']"), @FindBy(xpath = "//input[@name='email']") })
	private WebElement txtUsername;

	// OR operator
	@FindAll({ @FindBy(xpath = "//input[@id='pass']"), @FindBy(xpath = "//input[@name='sgxhdfxj']") })
	private List<WebElement> txtPassword;

	@CacheLookup
	@FindBy(xpath = "//button[text()='Log in']")
	private List<WebElement> btnLogin;

	// 3.Generate Getters
	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public List<WebElement> getTxtPassword() {
		return txtPassword;
	}

	public List<WebElement> getBtnLogin() {
		return btnLogin;
	}

}
