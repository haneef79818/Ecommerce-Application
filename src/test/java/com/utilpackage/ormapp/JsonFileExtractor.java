package com.utilpackage.ormapp;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFileExtractor {
	
	public static String getXpath(String elementName,String filepath) throws Throwable {
		
		FileReader fs = new FileReader(filepath);
		JSONParser js= new JSONParser();
		Object obj = js.parse(fs);
		JSONObject job = (JSONObject)obj;
		try {
		String elementXpath = (String)job.get(elementName);
		return elementXpath;
		}
		catch(Exception e){
			System.out.println("Element:"+ elementName+" is not present in the json file: "+filepath);
			return "Element:"+ elementName+" is not present in the json file: "+filepath;
		}
	}

}
