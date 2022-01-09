package org.runner;

import org.Utiltiles.BaseClass;
import org.Utiltiles.JVMreport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature files\\rerun\\failed.txt", glue="org.stepdefinitions",
					dryRun=false, snippets=SnippetType.CAMELCASE, tags= {"@Regression"},
					plugin= {"json:target\\reports\\sampletest.json",
							"rerun:src\\test\\resources\\Feature files\\rerun\\failed.txt"})
public class ReRunner extends JVMreport {
	@AfterClass
	public static void JVMReportOutput() {
		genJVM(System.getProperty("user.dir")+"\\target\\reports\\sampletest.json");
	}
}
