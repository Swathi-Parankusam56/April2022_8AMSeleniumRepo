package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/loginpage.feature"}, glue = {"stepDefination/LoginDemoStepDefenition"}, 
                 monochrome = true, strict = true, dryRun = false, plugin = {"pretty","html:target/HtmlReports",
                 "json:target/JSONReports/report.json","junit:target/JUNITReports/report.xml"},tags = {""})
public class TestRunner
{

}
