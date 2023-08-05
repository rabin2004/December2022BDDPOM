package runnerPkg;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\User\\eclipse-workspace\\CucumberDecemberBDDPOM\\src\\test\\java\\featurePkg",
		glue="stepDefinations"
		)

public class RunnerClass_2 {

}
