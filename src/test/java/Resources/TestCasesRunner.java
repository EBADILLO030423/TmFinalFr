package Resources;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featureTest/test.feature", glue = "testCase"

)
public class TestCasesRunner extends AbstractTestNGCucumberTests {
	
}


