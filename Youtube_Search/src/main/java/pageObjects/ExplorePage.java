package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ExplorePage {
	
	public WebDriver driver;
	
	By explore= By.xpath("//a[@title='Explore']");
	
	public ExplorePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	public WebElement getexplore()
	{
		return driver.findElement(explore);
	}
			

}
