package OrangeHRM.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/features/Login.feature"
		,glue="com/OrangeHRM/steps"
		,dryRun=false
		//,tags= {"@jenkins"}
		
		)
public class LoginRunner {

	
	
	
}
