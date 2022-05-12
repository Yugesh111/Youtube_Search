package Youtube;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ExplorePage;
import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	
	
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		driver.get("https://www.youtube.com/");
	}
	
	
	
	@Test
	
	public void Homepagenavigation() throws IOException, InterruptedException
	{
		
		
		Thread.sleep(1000);
		
		LandingPage p=new LandingPage(driver);
		p.gethome().click();
		
		Thread.sleep(1000);
		
		ExplorePage e=new ExplorePage(driver);
		e.getexplore().click();
		
	}
	
	@AfterTest
	
	public void close()
	{
		driver.close();
	}

}
