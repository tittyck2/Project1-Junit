package pagetest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.AddDataPage;
import pages.RemovalTestPage;
import pages.ToggleAllAndRemoveall;
import pages.ToggleTestPage;
import util.BrowserFactory;


public class AddpageTest {
	WebDriver driver;

	
	@Before
	public void callingBrowserFactory() {
		
		driver =BrowserFactory.initTest();
		
	}
	@Test
	 
	public void customerAddingData() {
		
		AddDataPage.userMustBeAbleToAddData(driver);
	}
	
		
	@Test
	public void customerAbleToClickOnToggle() {
		
		ToggleTestPage.clickOnToggle(driver);
		

	}
	
	@Test
	public void customerShouldBeAbletoClickOnOneBox() {
		
		RemovalTestPage.clickOnSingleBox(driver);
		RemovalTestPage.clickOnRemoveButton(driver);
	}
	
	
	@Test
	public void customerShouldBeAbleToToggleAllAndRemoveAll() {
		ToggleAllAndRemoveall.clickOnToggle(driver);
		ToggleAllAndRemoveall.clickOnRemoveButton(driver);
	}
	
}