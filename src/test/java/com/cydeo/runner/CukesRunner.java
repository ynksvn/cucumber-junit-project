package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty", //basically it just prints out additional information about the scenario that is being executed.
                "html:target/cucumber-reports.html " , // giving options to create reports
                "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
                },

        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        //true mean only get snippets if you not implement yet/ Do not run test definitions, only check the if there is missing snippet // false this will turn off dryRun and our code will run as expected
        tags = "@googleSearch",
        //when we used the 'or' tag, it runned both of them
        //when we used the 'and' tag, it looks for the scenarios that both tags are together
        publish = true //will enable a functionality from cucumber to generate a public link for the report of our final execution of our code
)


public class CukesRunner {




}
