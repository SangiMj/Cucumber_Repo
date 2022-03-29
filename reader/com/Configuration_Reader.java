package com.reader.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Configuration_Reader {
	
	public static WebDriver driver;
	
	public static Properties p;
	
	public Configuration_Reader() throws IOException {
		
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace_old\\Cucumber\\src\\test\\java\\com\\configuration\\com\\Configuration.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}
	
	public String geturl() {
		
		String url = p.getProperty("url");
		
		return url;
	}
	
	public String getUsername() {

		String username = p.getProperty("username");
		
		return username;	
	}
	
	public String getpassword() {
		
		String password = p.getProperty("password");
		
		return password;
	}
	

}
