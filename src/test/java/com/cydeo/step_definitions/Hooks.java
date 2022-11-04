package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.Scenario;

public class Hooks {



@Before
    public void setUp(){

    System.out.println("@Before in Hooks is running");
}

@After
    public void tearDown(Scenario scenario){
    System.out.println("@After in Hooks is running");

    if (scenario.isFailed()) {
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        //casting the screenshot. when we cast in byte we will be able to see in html. it will store as Array

        scenario.attach(screenshot, "image/png", scenario.getName());
    }
    Driver.closeDriver();
}


}
