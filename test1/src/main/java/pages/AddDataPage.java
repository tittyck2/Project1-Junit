package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.BasePage;

public class AddDataPage {

	static WebDriver driver;

	static By addtext = By.name("data");
	static By addButton = By.xpath("/html/body/div[4]/input[2]");

	public static void userMustBeAbleToAddData(WebDriver driver) {

		for(int i=0; i<5  ;i++  ) {driver.findElement(addtext).sendKeys("Titty" + BasePage.generateRandomNumber());

		driver.findElement(addButton).click();}



	}
}
