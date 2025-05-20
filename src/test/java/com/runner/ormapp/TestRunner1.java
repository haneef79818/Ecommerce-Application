package com.runner.ormapp;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features="src//test//resources//features//",
					glue = {"com.stepdefinations.ormapp","com.baseclass.ormapp"} , tags="@test1 or @test2", plugin= {"pretty" ,"json:target/cucumber-reports.json"}
)

public class TestRunner1 extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider (parallel = true)
	public Object [][] scenarios(){
		return super.scenarios();
	}
}