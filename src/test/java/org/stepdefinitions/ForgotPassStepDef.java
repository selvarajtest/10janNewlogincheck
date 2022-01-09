//package org.stepdefinitions;
//
//import java.util.List;
//
//import org.Utiltiles.BaseClass;
//import org.Utiltiles.WgPojoClass;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//
//import io.cucumber.java.en.*;
//
//public class ForgotPassStepDef extends BaseClass {
//	
//	@Given("User should launch the chrome and load the url")
//	public void userShouldLaunchTheChromeAndLoadTheUrl() {
//	    chromeLauch();
//	    loadUrl("https://www.walgreens.com/");
//	    System.out.println("launched home page");
//	}
//
//	@When("User should click account in homepage and then click sigin")
//	public void userShouldClickAccountInHomepageAndThenClickSigin() throws InterruptedException {
//		WgPojoClass w = new WgPojoClass();
//		   btnClick(w.getWgBtnAccnt());
//		   threadWait(1000);
//		   btnClick(w.getWgBtnSignIn());	   
//	}
//	
//
//	@When("User should click the Forgotpassword and to enter the credentials and click continue")
//	public void userShouldClickTheForgotpasswordAndToEnterTheCredentialsAndClickContinue(io.cucumber.datatable.DataTable d) {
//		WgPojoClass w = new WgPojoClass();
//		btnClick(w.getWgForgotPassLink());
//		List<String> li = d.asList();
//		fill(w.getWgResetUserId(),li.get(1));
//		btnClick(w.getWgBtnContinue());
//	}
//
//	@Then("user should verify the password Reset verification page.")
//	public void userShouldVerifyThePasswordResetVerificationPage() {
//    String msg = driver.getPageSource();
//	//Assert.assertTrue("verify reset pswd page", msg.contains("verification code will be sent"));
//	System.out.println("Expected Page is Verified");
//	}
//	
//
//}
