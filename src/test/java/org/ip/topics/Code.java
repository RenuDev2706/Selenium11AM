package org.ip.topics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Code {

	public static void main(String[] args) throws IOException {

		// FileReader object
		FileReader f = new FileReader("Config.properties");

		// Create object for Properties class
		Properties p = new Properties();

		// To load the file for reading
		p.load(f);

		// getProperty("propertyname")--->returns String- propertyValue
		String propertyUrl = p.getProperty("url");
		System.out.println("Url: "+propertyUrl);

		System.out.println("Database username: " + p.getProperty("db.username"));
		System.out.println("Database Password: " + p.getProperty("db.password"));

		System.out.println("Browser: " + p.getProperty("browser"));

	}

}
