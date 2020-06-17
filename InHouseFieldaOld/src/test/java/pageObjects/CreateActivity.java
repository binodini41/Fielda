package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class CreateActivity {
	public WebDriver Idriver;
	
	public CreateActivity(WebDriver rdriver){
				Idriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By Projects=By.xpath("//*[@id='root']/div/section/aside/div/ul/li[2]/a");
	By ClkPRJ1=By.linkText("PRJ-1");
	By ActivityCreate= By.xpath("//div[@class='ant-card-extra']//button");
	
	By ServiceOrderRadioBtn=By.xpath("//input[@class='ant-radio-input']");
	By PoleBtn=By.xpath("//input[@class='ant-radio-input']");
	By Observations=By.xpath("//div[@class='antd-pro-components-buttons-group-index-tagColor']/span[2]");
	By ClkArrowIcon=By.xpath("//svg[@class='svg-inline--fa fa-arrow-circle-right fa-w-16 fa-2x fa-pull-right']/path");
	
	By Title=By.id("title");
	By Notes=By.id("notes");
	By ClkNext=By.xpath("//svg[@class='svg-inline--fa fa-arrow-circle-right fa-w-16 fa-2x fa-pull-right']");
	
	By Priority=By.xpath("//div[@class='antd-pro-components-radio-buttons-group-index-tagButton']/span[2]");
	By addTag=By.xpath("//div[@class='antd-pro-components-buttons-group-index-tagColor']/span[1]");
	By tagNextarrow=By.xpath("//svg[@class='svg-inline--fa fa-arrow-circle-right fa-w-16 fa-2x fa-pull-right']/path");
	By AssignTo=By.xpath("//label[@class='antd-pro-components-member-selection-card-member-selection-card-radioButton ant-radio-wrapper]/span[1]'");
		/*By verifyActivitytitle=By.xpath("//div[@class='ant-card-head-title'");
	By ServiceOrder=By.xpath("//button[@class='ant-btn ant-btn-link']");
	By CreateNewActivity=By.xpath("//div[@class='ant-modal-body']/div[2]/button[2]");
	
	
	By AssignTo =By.id("assignee");
	By Status=By.id("status");
	By Priority=By.id("priority");
	By StartDate=By.id("startDate");
	By EndDate=By.id("dueDate");
	By CreateBtn=By.xpath("//i[@aria-label='icon: save']//span");*/
	
	
	public String getTitle(){
		return Idriver.getTitle();
		
			
	}
	
	public void clickProjectlink() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Projects));
		Idriver.findElement(Projects).click();
		Thread.sleep(2000);
	}

	public void clkProject1() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ClkPRJ1));
		Idriver.findElement(ClkPRJ1).click();
		Thread.sleep(2000);
	}
	
	/*@SuppressWarnings("deprecation")
	public void verifyActivityTitle(String title){
		System.out.println("The title is:" + Idriver.getTitle());
		Assert.assertEquals(title, Idriver.getTitle());
	}*/
	
	public void ClkActivityBtn() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ActivityCreate));
		Idriver.findElement(ActivityCreate).click();
		Thread.sleep(2000);
	}
	
/*	public void clkServiceOrd() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ServiceOrder));
		Idriver.findElement(ServiceOrder).click();
		Thread.sleep(2000);
	}
	
	public void clkNewActivity() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(CreateNewActivity));
		Idriver.findElement(CreateNewActivity).click();
		Thread.sleep(2000);
	}
	public void SetTitle(String tname) throws InterruptedException{
			Idriver.findElement(Title).sendKeys(tname);
			Thread.sleep(2000);
	}
	public void selectAssign() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(AssignTo));
	
		WebElement assign=Idriver.findElement(AssignTo);
		assign.click();
	WebElement listassign= (WebElement) Idriver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']//li"));
		Select select = new Select(listassign);
		select.selectByVisibleText("Robert Claypool");
		Thread.sleep(2000);
	}
	public void selectStatus() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Status));
		WebElement status=Idriver.findElement(Status);
		status.click();
		WebElement liststatus=(WebElement) Idriver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li/span"));
		Select select = new Select(liststatus);
		select.selectByVisibleText("Pending");
		Thread.sleep(2000);
	}
	public void selectPriority() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Priority));
		WebElement priority=Idriver.findElement(Priority);
		priority.click();
		WebElement listpriority= (WebElement) Idriver.findElements(By.xpath("//ul[@class='ant-select-dropdown-menu  ant-select-dropdown-menu-root ant-select-dropdown-menu-vertical']/li"));
		Select select = new Select(listpriority);
		select.selectByVisibleText("Low");
		Thread.sleep(2000);
	}
	public void selectStartDate() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(StartDate));
		Idriver.findElement(StartDate).click();
	
		Idriver.findElement(By.xpath("/html/body/div[8]/div/div/div/div/div[2]/div[3]/span/a")).click();
	}
	public void selectEndDate() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(Idriver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(EndDate));
		Idriver.findElement(EndDate).click();
	
		Idriver.findElement(By.xpath("/html/body/div[9]/div/div/div/div/div[2]/div[2]/table/tbody/tr[2]/td[4]/div")).click();
		Thread.sleep(2000);
	}
	public void clkCreateBtn() throws InterruptedException{
		Idriver.findElement(CreateBtn).click();
		Thread.sleep(2000);
	}*/
	
	
	
}
