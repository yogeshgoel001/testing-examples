package com.pik.contact.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format   = {"json:target/cucumber.json", "html:target/site/cucumbe-pretty"},
        glue = {"com/pik/contact/cucumber","cucumber.runtime.java.spring.hooks"})
public class RunCukesTest {
}
