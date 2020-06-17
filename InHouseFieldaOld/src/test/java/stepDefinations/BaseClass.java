package stepDefinations;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import pageObjects.CreateActivity;
import pageObjects.LoginPage;



public class BaseClass {
	
	public WebDriver driver;
	public LoginPage lp;
	public CreateActivity ca;
	public static Logger logger;
	
	public Properties configprop;
	
	

}
