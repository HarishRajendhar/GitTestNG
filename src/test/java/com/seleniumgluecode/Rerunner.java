package com.seleniumgluecode;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = {"@target/failed_scenarios.txt"}

,glue = {"com.seleniumgluecode"},

dryRun =false,

monochrome=true,
plugin = { "pretty", "html:target/cucumber-reports"}
)
public class Rerunner extends Baseclass {

}
