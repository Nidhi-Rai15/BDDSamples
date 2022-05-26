package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "src//test//resources//TaggedFeatures//",
		glue = {"stepDefs"},
		monochrome = true,
	//	tags = "@RegressionTest"
	//	tags = "@RegressionTest or @SmokeTest"
	//	tags = "@RegressionTest and @SmokeTest"
	//	tags = "@RegressionTest or not @SmokeTest"
	//	tags = "@PhaseOne"
	//	tags = "@PhaseOne and @RegressionTest"
	//	tags = "@PhaseOne and @SmokeTest"
	//	tags = "@PhaseTwo and not @Regression"
	//	tags = "@PhaseOne or @PhaseTwo"
		tags = "@PhaseOne and @RegressionTest or @PhaseOne and @SmokeTest"
		)
public class CRMRunner {

}
