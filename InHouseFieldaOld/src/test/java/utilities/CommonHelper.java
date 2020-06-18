package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;

public class CommonHelper {
	public WebDriver driver;
	
public CommonHelper(WebDriver driver){
		
		this.driver=driver;
	}

public void teardown(Scenario scenario) throws IOException{
	
	if (scenario.isFailed()) {
		   try {
		    byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    FileUtils.copyFile(screenshot_with_scenario_name,
		      new File("./target/test-report/" + scenario.getName() + ".png"));
		    System.out.println(scenario.getName());
		    scenario.embed(screenshot, "image/png");
		   } catch (WebDriverException somePlatformsDontSupportScreenshots) {
		    System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		   }
		   
		   
		  }
	
	
	
}

}
