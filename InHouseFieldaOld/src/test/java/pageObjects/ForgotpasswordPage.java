package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotpasswordPage {
	
	
public WebDriver Idriver;
	
	public ForgotpasswordPage(WebDriver rdriver){
        Idriver= rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	
	@FindBy(xpath="//a[@href='/user/forgot-password']")
	@CacheLookup
	WebElement ForgotpasswordLink;
	public void ClkPasswordLink(){
		ForgotpasswordLink.click();
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement SetEmail;
	
	public void emailEnter(String email){
		SetEmail.clear();
		SetEmail.sendKeys(email);
	}
	
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-btn-block']")
	@CacheLookup
	WebElement clkResendCode;
	
	public void ClickOnSendBtn(){
		clkResendCode.click();
	}
	
	@FindBy(id="newPassword")
	@CacheLookup
	WebElement EnternewPassword;
	
	public void SetnewPassword(String newpassword){
		EnternewPassword.clear();
		EnternewPassword.sendKeys(newpassword);
		
	}
	@FindBy(id="confirmNewPassword")
	@CacheLookup
	WebElement EnterconfirmnewPassword;
	
	public void SetconnewPassword(String cnewpassword){
		EnterconfirmnewPassword.clear();
		EnterconfirmnewPassword.sendKeys(cnewpassword);
		
	}
	@FindBy(id="code")
	@CacheLookup
	WebElement Entercode;
	
	public void SetCode(String entercode){
		Entercode.clear();
		Entercode.sendKeys(entercode);
	}
	
	@FindBy(id="code")
	@CacheLookup
	WebElement ClkChangePassword;
	
	public void ClickonChangePassword(){
		
		ClkChangePassword.click();
		
	}
	
}
