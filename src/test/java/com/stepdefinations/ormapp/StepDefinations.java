package com.stepdefinations.ormapp;

import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;

import com.baseclass.ormapp.BaseClass;
import com.pageVSclass.ormapp.PageVSClassMappings;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class StepDefinations {

	
	@Given("Navigate to application.")
	public void navigate_to_application() throws InterruptedException {
		System.out.println("Current URL: " + BaseClass.getDriver().getCurrentUrl());
	}
	
	@Given("^Call \"([^\"]*)\" on \"([^\"]*)\"$")
	public void call_on(String MethodName, String PageName,Map<String, String> fieldList) throws Throwable {
		
		String classPath = PageVSClassMappings.getClassPath(PageName);
	    Class<?> cls = Class.forName(classPath);
	    Map<String, String> newfieldList = new LinkedHashMap<String, String>();
	    newfieldList.putAll(fieldList);
	    Method m = cls.getDeclaredMethod(MethodName,LinkedHashMap.class); // Corrected parameter type
	    Object instance = cls.getDeclaredConstructor().newInstance();	
	    m.setAccessible(true); // If method is private
	    m.invoke(instance,newfieldList); // Corrected invocation
	    
	}

	@Then("verify login is successfull.")
	public void verify_login_is_successfull() {
		 System.out.println("successfully logged in");
	}

}
