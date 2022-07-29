package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/"}, glue = {"stepDefination"}, 
                 monochrome = true, strict = true, dryRun = false, plugin = {"pretty","html:target/HtmlReports",
                 "json:target/JSONReports/report.json","junit:target/JUNITReports/report.xml"},tags = {"@regression or @smoke"})
public class TestRunner
{

}
