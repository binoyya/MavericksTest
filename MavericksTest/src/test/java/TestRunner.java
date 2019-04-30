import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;


/**
 * Created by Binoy on 4/28/2019.
 */
@RunWith(Cucumber.class)

@CucumberOptions(
        features = "./src/test/java/com/mevericks/automation/web/featureFiles/redditTest.feature",
        format = {"html:target/cucumber",},
        monochrome = true,
        glue = {""},
        tags = {"@test"},
        plugin = {"pretty", "html:target/cucumber-html-report","json:target/cucumber.json"})
public class TestRunner {

    }
