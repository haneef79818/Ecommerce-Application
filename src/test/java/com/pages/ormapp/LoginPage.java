package com.pages.ormapp;

import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.ormapp.BaseClass;
import com.commonpage.ormapp.CommonUtils;
import com.utilpackage.ormapp.JsonFileExtractor;

public class LoginPage {
	
	WebDriver driver;
	private final String pageName="C:\\Users\\hanee\\eclipse-workspace\\JavaProject\\Ecommerce\\src\\test\\resources\\pagejsonfiles\\LoginPage.json";
	CommonUtils cu;
	private String xpathString = "";
	public LoginPage() {
		this.driver = BaseClass.getDriver();
		this.cu = new CommonUtils();
		PageFactory.initElements(driver, this);
	}
	
	private WebElement getWebElement(String element) throws Throwable {
			String xpath=JsonFileExtractor.getXpath(element, this.pageName);
		 WebElement we = driver.findElement(By.xpath(xpath));
		 return we;
	}
	public void loginToApplication(LinkedHashMap<String, String>fieldList) throws Throwable {
		WebElement username = getWebElement("username");
		WebElement password = getWebElement("password");
		WebElement submit = getWebElement("submit");
		cu.waitUntilElementVisible(username);
		username.clear();
		username.sendKeys(fieldList.get("USERNAME"));
		password.clear();
		password.sendKeys(fieldList.get("PASSWORD"));
		submit.click();
		Thread.sleep(10000);
	}
}
