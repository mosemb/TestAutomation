package selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgClass {
	
	WebDriver driver;
	
  @BeforeMethod
  public void prepareTest() {
	  System.setProperty("webdriver.chrome.driver","/home/mose/chromedriver_linux64/chromedriver");
	  driver = new ChromeDriver();
  }
  
  @Test
  public void runTest() {
	  
	    System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//WebElement searchElement = driver.findElement(By.xpath("//input[@title='Search' and @type='text']"));
		//searchElement.sendKeys("TestAutomation.co");
		//WebElement searchBtnElement = driver.findElement(By.name("btnK"));
		//searchBtnElement.submit();
	  
  }
  
  @AfterMethod
  public void cleanTest() {
		driver.quit();
	  
  }
  
  
}
