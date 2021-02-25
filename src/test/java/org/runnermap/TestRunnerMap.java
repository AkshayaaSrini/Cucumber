package org.runnermap;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Map.feature", glue="org.stepdefmap", dryRun=false, monochrome=true)
public class TestRunnerMap {

}
