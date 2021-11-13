package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Feature/login.feature",
        glue="stepDefinition",
        dryRun=false,
        monochrome=true,
        plugin= {"pretty","html:target/test-output"}
        
		)


public class TestRun {

}