package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ToggleAllAndRemoveall {
	
	WebDriver driver;
	
	static By toggle = By.name("allbox");
	static By rbutton = By.xpath("/html/body/div[3]/input[1]");
	
	public  static void clickOnToggle(WebDriver driver) {

		driver.findElement(toggle).click();
	
	}
	
	public static void clickOnRemoveButton(WebDriver driver) {
		
		driver.findElement(rbutton).click();
		
	}

}
