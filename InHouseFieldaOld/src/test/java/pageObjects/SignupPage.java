package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
public WebDriver Idriver;
	
	
	
	public SignupPage(WebDriver rdriver) {
		Idriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Sign up here.')]")
	@CacheLookup
	WebElement signupLink;
	
	public void ClkSignup(){
		
		signupLink.click();
	}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement EnterEmailId;
	public void setEmail(String uname){
		EnterEmailId.clear();
		EnterEmailId.sendKeys(uname);
		
	}
	@FindBy(id="password")
	@CacheLookup
	WebElement Enterpassword;
	
	public void setPassword(String password){
		Enterpassword.clear();
		Enterpassword.sendKeys(password);
		
	}
	@FindBy(id="reEnterPassword")
	@CacheLookup
	WebElement EnterRepassword;
	
	public void ReEnterPassword(String cpassword){
		EnterRepassword.clear();
		EnterRepassword.sendKeys(cpassword);
		
	}
	
	@FindBy(id="displayName")
	@CacheLookup
	WebElement EnterdisplayName;
	public void EnterDisplayname(String dname){
		EnterdisplayName.clear();
		EnterdisplayName.sendKeys(dname);
		
	}
	@FindBy(xpath="//*[@id='root']/div/div/div/div[2]/div/form/div[5]/div/div/span/button")
	@CacheLookup
	WebElement CreateAccBtn;
	
	public void ClkCreateBtn(){
		CreateAccBtn.click();
		
	}

}
