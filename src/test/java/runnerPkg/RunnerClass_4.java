package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\User\\eclipse-workspace\\CucumberDecemberBDDPOM\\src\\test\\java\\featurePkg",
		glue="stepDefinations",
		plugin= {"pretty","html:target/HTML_report/report.html",
						"json:target/JSON_reprot/report.json"},
//		tags="@newScenario" // -> single tag execution
//		tags="@SmokeTest and @Regression" // -> having both tags
//		tags="@SmokeTest or @Regression" // -> either or
		tags="@SmokeTest and not @Regression" // -> just smoke test not regression
		)

public class RunnerClass_4 {

}
