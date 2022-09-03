package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true, plugin= {"pretty", "junit:target//output.xml"},features="src\\test\\resources",glue="com.stepdefinition")
public class TestRunnerClass {

}
