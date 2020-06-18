package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/LoginToFielda.feature",
glue="stepDefinations",
tags={"@regression,@sanity"},
dryRun=false,
monochrome=true,
strict=true,
snippets=SnippetType.CAMELCASE,
plugin={"pretty","html:target/site/cucumber-pretty",
		"json:target/cucumber.json"}

		)

public class RunnerTest {

}
