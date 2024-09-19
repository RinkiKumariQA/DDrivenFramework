package TestRunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
		features="TestCasFeature",
		glue="Step_Definition_File",
		dryRun=false,
		tags= "@FirstStep",
		monochrome = true,
		plugin ={"pretty","html:target/cucumber-reports/r.html"}
		
		
)
	
public class RunClass 
{

}
