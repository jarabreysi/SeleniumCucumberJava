package runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/feature"},
        glue = {"stepDefinition"},
        tags = {"@WebTableEdit or @Form or  @FormBasic or @LoginInstagram"}
        //tags = {"@Form"}
        //plugin ={"json:test/report/cucumber_report.json"}
)

public class RunnerTest {

}
