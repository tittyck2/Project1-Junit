package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemovalTestPage {
	
	WebDriver driver;

	
	
	static By chkbox = By.name("todo[0]");
	
	
	static By rbutton = By.xpath("/html/body/div[3]/input[1]");
	
	public static void clickOnSingleBox(WebDriver driver) {
		
		driver.findElement(chkbox).click();
	}

	public static void clickOnRemoveButton(WebDriver driver) {
		
		driver.findElement(rbutton).click();
		
	}
}
