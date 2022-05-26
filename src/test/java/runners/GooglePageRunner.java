package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish=true,
		features = "src//test//resources//SampleFeatures//GooglePage.feature",
		glue = {"stepDefs"},
		monochrome = true,
		dryRun = false,
		plugin = {
//				"pretty",
				"html:target/reports/HTMLReport.html",
//				"usage:target/reports/UsageReport"
//				"json:target/reports/JsonReport.json"
//				"junit:target/reports/JUnitReport.xml"
//				"rerun:target/failed_scenario.txt"
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)
public class GooglePageRunner {
	

	
	}


