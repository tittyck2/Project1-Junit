package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToggleTestPage {

	WebDriver driver;
	
	static By toggle = By.name("allbox");
	
	
	public  static void clickOnToggle(WebDriver driver) {

		driver.findElement(toggle).click();
	
	}

}
