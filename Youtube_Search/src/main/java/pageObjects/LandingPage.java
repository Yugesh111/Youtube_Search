package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	By home= By.xpath("//span[text()='Home']");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	public WebElement gethome()
	{
		return driver.findElement(home);
	}
			

}
