package org.code;

import java.io.IOException;

import org.objectrepository.LoginPage;
import org.utilities.BaseClass;

public class Executable extends BaseClass {

	public static void main(String[] args) throws IOException {

		String browserName = readProperty("browser");
		launchBrowser(browserName);
		loadUrl(readProperty("url"));
		windowMaximze();
		driver.navigate().refresh();
		LoginPage l = new LoginPage();
		enterText(l.getTxtUsername(), readProperty("db.username"));
		enterText(l.getTxtPassword().get(0), readProperty("db.password"));
		elementClick(l.getBtnLogin().get(0));

	}
}
