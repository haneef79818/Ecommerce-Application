package com.classpathassain.ormapp;

final public class  ClassPathLoader {
	
	public final static String getClassPath(String className) {
		String classPath=null;
		switch (className){
		case "LoginPage":{
			classPath = "/Ecommerce/src/test/java/com/pages/ormapp/LoginPage.java";
			break;
		}
		}
		return classPath;
	}

}
