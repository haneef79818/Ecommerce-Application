package com.commonpage.ormapp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.ormapp.BaseClass;

public class CommonUtils {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public CommonUtils() {
		this.driver = BaseClass.getDriver();
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
		 
	}
	
	public  void waitUntilElementVisible(WebElement we) {
		System.out.println("Waiting for WebElement visibility");
		wait.until(ExpectedConditions.visibilityOf(we));
	}

}
