package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseClass{
	
	

	
	@After
	
	public void tearDown(Scenario scenario){
		scenario.write("capture screen");
		if(scenario.isFailed()){
		final byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot,"image/png");
		}
		driver.close();
	}

}
