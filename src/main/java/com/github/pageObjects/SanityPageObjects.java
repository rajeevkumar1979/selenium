package com.github.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SanityPageObjects {
	
	public SanityPageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using="")
	private WebElement txt_userName;

	 @FindAll(@FindBy(how = How.CSS, using = ".noo-product-inner"))
	 private List<WebElement> prd_List; 
	
	public void enterUserName() {
		txt_userName.sendKeys("userName");
	}
}
