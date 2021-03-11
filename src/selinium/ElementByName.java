package selinium;

import org.testng.annotations.Test;

import java.util.*;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ElementByName {
	
	WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver","/home/mose/chromedriver_linux64/chromedriver");
	  driver = new ChromeDriver();
	  
	  }
  
  @Test
  public void testId() {
	  driver.get("https://testautomation.co/webelements/");
	  driver.findElement(By.name("yourname")).sendKeys("Mike");
	  //We want to enter values in the second box. 
	  List<WebElement> names =  driver.findElements(By.name("yourname"));
	  names.get(1).sendKeys("Mikey James");
	  
	 // for(WebElement namElement:names) {
		  
	 // }
	  
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
  }

}
