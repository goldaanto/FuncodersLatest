package stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features", glue={"stepdef"}, monochrome = true, plugin= {"pretty","html:target/JSONReport/report.html"})
//dsalog Runner
public class DsAlgoRunner {

}
