package org.Utiltiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WgPojoClass extends BaseClass {
	
	public WgPojoClass() {
		PageFactory.initElements(driver, this);
	}
	
	// WallGreens locators
	
	@FindBy(xpath="//*[text()='Account']")
	private WebElement wgBtnAccnt;
	
	@FindBy(id="pf-dropdown-signin")
	private WebElement wgBtnSignIn;
	
	@FindBy(id="user_name")
	private WebElement wgTxtEmail;
	
	@FindBy(id="user_password")
	private WebElement wgTxtPasswd;
	
	@FindBy(id="ShowCharacter")
	private WebElement wgCheckBtnPasswd;
	
	@FindBy(id="submit_btn")
	private WebElement wgBtnSubmit;
	
	@FindBy(id="error_msg")
	private WebElement wgErrorMsgInvalidUser;
	
	@FindBy(id="goto_resetpass")
	private WebElement wgForgotPassLink;
	
	@FindBy(id="user-id")
	private WebElement wgResetUserId;
	
	@FindBy(id="submit_btn")
	private WebElement wgBtnContinue;
	
	
	
	
	public WebElement getWgForgotPassLink() {
		return wgForgotPassLink;
	}

	public WebElement getWgResetUserId() {
		return wgResetUserId;
	}

	public WebElement getWgBtnContinue() {
		return wgBtnContinue;
	}

	public WebElement getWgBtnAccnt() {
		return wgBtnAccnt;
	}

	public WebElement getWgBtnSignIn() {
		return wgBtnSignIn;
	}

	public WebElement getWgTxtEmail() {
		return wgTxtEmail;
	}

	public WebElement getWgErrorMsgInvalidUser() {
		return wgErrorMsgInvalidUser;
	}

	public WebElement getWgTxtPasswd() {
		return wgTxtPasswd;
	}

	public WebElement getWgCheckBtnPasswd() {
		return wgCheckBtnPasswd;
	}

	public WebElement getWgBtnSubmit() {
		return wgBtnSubmit;
	}
	
	
	
}
