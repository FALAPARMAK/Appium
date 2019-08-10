package OrangeHRM.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/features"}//  { olabilir ya da olmayabilir
		,glue= {"com/orangeHRM/steps"}
         //,dryRun=false
         ,monochrome=true
      	,tags= {"@jenkins"}
		//,plugin= {"pretty","html:target/cucumber-default-reports","json:target/cucumber.json"}
		)
 

public class Smoke {

}
