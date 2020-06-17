package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver){
        Idriver= rdriver;
		PageFactory.initElements(rdriver, this);
		}
	
	@FindBy(id="email")
	@CacheLookup
	WebElement EmailText;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement passwordText;
	
	@FindBy(xpath="//*[@id='root']/div/div/div/div[2]/div/form/div[4]/div/div/span/button")
	@CacheLookup
	WebElement clkLogin;
	
	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[1]")
	WebElement clickLogout;
	
	public void SetUsername(String uname){
		EmailText.clear();
		EmailText.sendKeys(uname);
	}
	
	public void SetPassword(String pws){
		passwordText.clear();
		passwordText.sendKeys(pws);
	}
	
	public void clickLoginBtn(){
		clkLogin.click();
		
	}
	
/*public void ClickOnLogout(){
		clickLogout.click();
	}*/
	

}
