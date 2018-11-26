package com.github.rk.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public static WebDriver getDriver() {
		WebDriver driver =new FirefoxDriver();
		return driver;		
	}
}
