package org.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static FileReader f;
	public static Properties p;

	public static void launchBrowser(String browser) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}

	public static void loadUrl(String url) {

		driver.get(url);

	}

	public static String readProperty(String propertyName) throws IOException {

		f = new FileReader("Config.properties");

		p = new Properties();

		p.load(f);

		String propertyValue = p.getProperty(propertyName);

		return propertyValue;


	}

	public static void elementClick(WebElement element) {
		element.click();
	}

	public static void windowMaximze() {
		driver.manage().window().maximize();
	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}
}
