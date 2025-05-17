package com.pageVSclass.ormapp;

public class PageVSClassMappings {
	
	public static String getClassPath(String pageName) {
		String s=null;
		switch(pageName) {
		case "LoginPage":{
			s="com.pages.ormapp.LoginPage";
			break;			
		}
		default:{
			System.out.println("page not fount: "+pageName);
		}
		}
		return s;
	}

}
