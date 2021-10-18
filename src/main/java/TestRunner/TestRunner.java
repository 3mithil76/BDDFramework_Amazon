package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

   @RunWith(Cucumber.class)
   @CucumberOptions(
		
		features= "C:/Users/Mithil/Documents/Java Class/Selenium_Workspace/BDDFramework/src/main/java/features",
		glue= {"stepDefinitions"},
		format= {"pretty" , "html:test-output"},
		dryRun= false,
		//strict= true,
		monochrome = true,
		tags= {"@ColdFix"}
		)


public class TestRunner {

}
