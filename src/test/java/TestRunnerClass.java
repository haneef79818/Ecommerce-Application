import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions (features="src//test//resources//features//",
					glue = {"com.stepdefinations.ormapp","com.baseclass.ormapp"} , tags="@test1", plugin= {"pretty" ,"json:target/cucumber-reports.json"}
)

public class TestRunnerClass {

}
