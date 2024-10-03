package com.qa.base;

import java.util.Properties;

import com.qa.enums.ConfigPropertiesEnum;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.qa.io.ConfigReader;

public class BaseClass {
	
	public static WebDriver driver;

	protected BaseClass(){

	}
	
	@BeforeSuite
	public void setup(){
		DriverManager driverManager = new DriverManager();
		Properties prop = ConfigReader.readConfigPropertiesFile();
		String browser = prop.getProperty(ConfigPropertiesEnum.BROWSER.name().toLowerCase());
		driver = driverManager.InitilizeDriver(browser);
		driver.get(prop.getProperty(ConfigPropertiesEnum.URL.name().toLowerCase()));
		
	}
	
	@BeforeClass
	public void beforeClass(){
		
	}
	
	@AfterSuite
	public void tearDown(){
		//driver.quit();
	}

}
