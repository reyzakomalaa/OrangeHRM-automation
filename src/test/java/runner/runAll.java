package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step",
        plugin = "html:target/OrangeHRM_report.html",
        tags = "@ChangeProfile"
)
public class runAll {
}
