package stepDefinations;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.ScreenshotException;

import cucumber.api.Scenario;
import pageObjects.CreateActivity;
import pageObjects.ForgotpasswordPage;
import pageObjects.LoginPage;
import pageObjects.SignupPage;



public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public SignupPage sp;
	public ForgotpasswordPage fp;
	public CreateActivity ca;
	public static Logger logger;
	public static Scenario scenario;
	public Properties configprop;
	public static String screenshotException;
	
	

}
