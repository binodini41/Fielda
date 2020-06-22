package stepDefinations;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CreateActivity;
import pageObjects.ForgotpasswordPage;
import pageObjects.LoginPage;
import pageObjects.SignupPage;


public class LoginScreen extends BaseClass  {

	@Before
	public void Setup(Scenario scenario) throws IOException{
		configprop=new Properties();
		FileInputStream configPropfile= new FileInputStream("config.properties");
		configprop.load(configPropfile);
		
		logger = Logger.getLogger("InHouseFielda"); 
		PropertyConfigurator.configure("log4j.properties");
		
		String br=configprop.getProperty("browser");
		
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",configprop.getProperty("chromepath"));
		driver= new ChromeDriver();
		scenario.write("Chrome Browser launched");
			}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",configprop.getProperty("firefoxpath"));
			driver= new FirefoxDriver();
			scenario.write("Firefox Browser launched");
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",configprop.getProperty("iepath"));
			driver= new InternetExplorerDriver();
			scenario.write("ie Browser launched");
		}
		
		driver.manage().window().maximize();
		logger.info("************Launching Browser**********");
		
	}
	
	
	
	@Given("User launch the chrome browser")
	public void User_launch_the_chrome_browser(){
		/*logger = Logger.getLogger("InHouseFielda"); 
		PropertyConfigurator.configure("log4j.properties");
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		logger.info("************Launching Browser**********");	*/	
		lp=new LoginPage(driver);
	
	}
	
	@When ("User enter the URL {string}")
	public void User_enter_the_URL(String url) throws InterruptedException{
		driver.get(url);
		logger.info("************Launching url**********");
		Thread.sleep(2000);
	}
	
	@And("User enter the email as {string} and password as {string}")
public void User_enter_the_email_as_and_password_as(String uname, String pws) throws InterruptedException
	
	{
		logger.info("************Entering userName and Password**********");
		lp.SetUsername(uname);
		lp.SetPassword(pws);
		Thread.sleep(2000);
	}
	
	
	@And("user clicked on the login button")
	public void user_clicked_on_the_login_button() throws InterruptedException{
		logger.info("************Click on login button**********");
		lp.clickLoginBtn();
		Thread.sleep(5000);
	
		}
		
	@Then("The page title displayed as {string}")
	public void The_page_title_displayed_as(String title) throws InterruptedException{
		//Invalid email or password
		 if(driver.getPageSource().contains("Invalid email or password")){
			 System.out.println("The title is: " +driver.getTitle());
			 driver.close();
			 logger.info("************Login fail**********");
			 Assert.assertTrue(false);}
		 else{
			 
			 System.out.println("The title is: " +driver.getTitle()); 
			 logger.info("************Login pass**********");
				 Assert.assertEquals(title, driver.getTitle()); 
		 }
		
		//Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(2000);
		}
	@When("Click on the Sign up here link") 
	public void Click_on_the_Sign_up_here_link()throws InterruptedException{
		logger.info("************Click on the signup link**********");
		sp = new SignupPage(driver);
		sp.ClkSignup();
		 
	}

	@Then("Enter email id as {string} and password as {string} and confirm password as {string} and display name as {string}")
public void Enter_email_id_as_and_password_as_and_confirm_password_as_and_display_name_as(String uname, String password, String cpassword,String dname) throws InterruptedException {
		logger.info("***********Validate the signup form**********");
	sp.setEmail(uname);
	sp.setPassword(password);
	sp.ReEnterPassword(cpassword);
	sp.EnterDisplayname(dname);
	Thread.sleep(2000);
	}

	@Then("Click on Create a Account button")
	public void Click_on_Create_a_Account_button() throws InterruptedException
	{
		logger.info("************Click on the Create Account Btn**********");
		sp.ClkCreateBtn(); 
		Thread.sleep(2000);
	}

	@When("Click on the Forgot password link")
	public void Click_on_the_Forgot_password_link()throws InterruptedException
	{
		logger.info("************Click on the Forgot password link**********");
		fp = new ForgotpasswordPage(driver);
		fp.ClkPasswordLink();
		Thread.sleep(2000);
	}

	@Then("User enter the email as {string}")
	public void User_enter_the_email_as(String email) {
	   fp.emailEnter(email);
	}

	@Then("Clicked on Resend code button")
	public void Clicked_on_Resend_code_button() throws InterruptedException{
	    fp.ClickOnSendBtn();
	    Thread.sleep(3000);
	}

	@Then("User enter the new password as {string} and confirm new password as {string} and enter code as {string}")
	public void User_enter_the_new_password_as_and_confirm_new_password_as_and_enter_code_as(String newpassword, String cnewpassword, String entercode){
	  fp.SetnewPassword(newpassword);
	  fp.SetconnewPassword(cnewpassword);
	  fp.SetCode(entercode);
	}

	@Then("Clicked on change password button")
	public void Clicked_on_change_password_button()
	{
	  fp.ClickonChangePassword();  
	}
	
	
	
	
	@When("user click on the project")
	public void user_click_on_the_project() throws InterruptedException {
		ca= new CreateActivity(driver);
		ca.clickProjectlink();
		
	    
	}

	@When("clicked on PROJOne")
	public void clicked_on_PROJone() throws InterruptedException
	{
		ca.clkProject1();
	}

	/*@Then("user see the activity button")
	public void user_see_the_activity_button(String title) throws InterruptedException
	
	{
	   ca.verifyActivityTitle(title);
	}*/

	@When("clicked on Create Activity button")
	public void clicked_on_Create_Activity_button() throws InterruptedException
	{
		 ca.ClkActivityBtn();
	}



	@Then("click on the Service option")
	public void click_on_the_Service_option() throws InterruptedException
	{
	    
	}

	

	@Then("click on the Create New Activity button")
	public void click_on_the_Create_New_Activity_button() throws InterruptedException
	{
	  
	}

	@Then("User enter title as {string}")
	public void User_enter_title_as (String title) throws InterruptedException {
	   
	}

	@Then("user select Assign To")
	public void user_select_Assign_To() throws InterruptedException
	{
	   
	}

	@Then("user select Status")
	public void user_select_Status() throws InterruptedException
	{
		
	
	}

	@Then("user select priority")
	public void user_select_priority() throws InterruptedException
	{
	
	}

	@Then("user select Start Date")
	public void user_select_Start_Date() throws InterruptedException
	{
	  
	}

	@Then("User select End Date")
	public void User_select_End_Date() throws InterruptedException
	{
	  
	}

	@Then("click on create button")
	public void click_on_create_button() throws InterruptedException
	{
	   
	}

	@Then("Verify the title of the activity")
	public void Verify_the_title_of_the_activity(String title)
	{
	   System.out.println(ca.getTitle());
	   Assert.assertEquals(title, ca.getTitle());
	}
	
@When("User clicked on logout")
	public void User_clicked_on_logout() throws InterruptedException
	{
		Actions actions = new Actions(driver);
	    WebElement target = driver.findElement(By.xpath("//span[@class='antd-pro-components-global-header-index-action antd-pro-components-global-header-index-account ant-dropdown-trigger']/span[2]"));
		actions.moveToElement(target).perform();
		Thread.sleep(1000);
		logger.info("************User logged out from the application**********");
	    lp.ClickOnLogout();
		   
	}

	
	
	
	@And ("Then close the browser")
	public void Then_close_the_browser() throws InterruptedException{
	
		logger.info("************Closing Browser**********");
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
