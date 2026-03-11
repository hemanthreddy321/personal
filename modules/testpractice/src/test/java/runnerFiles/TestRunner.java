package runnerFiles;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/resources/featureFiles/Tabs.feature",
    glue={"stepDefinitions","hooks"},
    dryRun = true,
    snippets = CAMELCASE

)

public class TestRunner {
    
}
