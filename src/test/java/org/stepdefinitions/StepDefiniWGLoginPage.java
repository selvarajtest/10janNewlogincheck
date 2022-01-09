package org.stepdefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.Utiltiles.BaseClass;
import org.Utiltiles.WgPojoClass;
import org.junit.Assert;
import org.openqa.selenium.By;


import io.cucumber.datatable.dependency.com.fasterxml.jackson.core.util.VersionUtil;
import io.cucumber.java.en.*;


public class StepDefiniWGLoginPage extends BaseClass{
	
	/*
	@Given("User should launch the chrome browser and load the url")
	public void userShouldLaunchTheChromeBrowserAndLoadTheUrl() {
	   chromeLauch();
	   loadUrl("https://www.walgreens.com/");
	   
	}
	
	1D list
	 
	@When("User should enter the user name in login page")
	public void userShouldEnterTheUserNameInLoginPage(io.cucumber.datatable.DataTable user) {
			WgPojoClass w = new WgPojoClass();
		   btnClick(w.getWgBtnAccnt());
		   btnClick(w.getWgBtnSignIn());
		   List<String> li = user.asList();
		   fill(w.getWgTxtEmail(), li.get(0));
		  System.out.println("Id passed");
	}

	@When("To enter the password in login page")
	public void toEnterThePasswordInLoginPage(io.cucumber.datatable.DataTable passwd) {
	   WgPojoClass w = new WgPojoClass();
	   List<String> li = passwd.asList();
	   fill(w.getWgTxtPasswd(), li.get(0));
	}
	*/

	
	/*   2D list
	
	@When("User should enter the user name and enter the password in login page")
	public void userShouldEnterTheUserNameAndEnterThePasswordInLoginPage(io.cucumber.datatable.DataTable d) throws InterruptedException {
		WgPojoClass w = new WgPojoClass();
		btnClick(w.getWgBtnAccnt());
		threadWait(1000);
		btnClick(w.getWgBtnSignIn());
		threadWait(1000);
		List<List<String>> li = d.asLists();
	   fill(w.getWgTxtEmail(), li.get(0).get(1));
	   fill(w.getWgTxtPasswd(), li.get(1).get(1));
	    
	}
*/
	
	@Given("click account icon homepage then click sigin")
	public void clickAccountIconHomepageThenClickSigin() throws InterruptedException {
		WgPojoClass w = new WgPojoClass(); 
		btnClick(w.getWgBtnAccnt());
		threadWait(1000);
		btnClick(w.getWgBtnSignIn());
		threadWait(1000);
	}
	
	@When("User should enter the user name and enter the password in login page")
	public void userShouldEnterTheUserNameAndEnterThePasswordInLoginPage(io.cucumber.datatable.DataTable d){
		WgPojoClass w = new WgPojoClass();
		List<Map<String, String>> m = d.asMaps(String.class,String.class);
		fill(w.getWgTxtEmail(), m.get(0).get("userId"));
		fill(w.getWgTxtPasswd(), m.get(0).get("password"));
	}
	
	@When("User shouldk sign in button for login")
	public void userShouldkSignInButtonForLogin() throws InterruptedException{
		WgPojoClass w1 = new WgPojoClass();
		btnClick(w1.getWgBtnSubmit());
		threadWait(2000);
		}
	
	@Then("To verify the page is incredential login page")
	public void toVerifyThePageIsIncredentialLoginPage() {
		Assert.assertTrue("verify the password column", driver.findElement(By.xpath("//span[text()='Please enter your password.']")).getText().contains("Please enter"));
		
		System.out.println("empty password used");
		
	}

	
	
}
