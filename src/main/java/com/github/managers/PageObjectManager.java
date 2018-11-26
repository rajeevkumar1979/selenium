package com.github.managers;

import org.openqa.selenium.WebDriver;

import com.github.pageObjects.SanityPageObjects;

public class PageObjectManager {
	WebDriver driver;
	SanityPageObjects sanityPage;

	public PageObjectManager(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public SanityPageObjects getSanityPage() {
		return (sanityPage == null) ? new SanityPageObjects(driver) : sanityPage;
	}

}
